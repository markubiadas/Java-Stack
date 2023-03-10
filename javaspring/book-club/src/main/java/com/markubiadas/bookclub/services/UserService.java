package com.markubiadas.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.markubiadas.bookclub.models.LoginUser;
import com.markubiadas.bookclub.models.User;
import com.markubiadas.bookclub.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	// Register User
	public User register(User newUser, BindingResult result) {
		Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail());
		if(optionalUser.isPresent()) {
			result.rejectValue("email", "unique", "This email is already registered");
		}
		
		if(!newUser.getPassword() .equals(newUser.getConfirm())) {
			result.rejectValue("password", "matches", "Confirmation password does not match");
		}
		
		if(result.hasErrors()) {
			return null;
		}
		
		//Hash and set password -> save the user in db
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		userRepo.save(newUser);
		
		return newUser;
	}
	
	// Login User
	public User login(LoginUser newLogin, BindingResult result) {
		Optional<User> optionalUser = userRepo.findByEmail(newLogin.getEmail());
		
		if(!optionalUser.isPresent()) {
			result.rejectValue("email", "unique", "This email is not a registered email");
			return null;
		}
		
		User user = optionalUser.get();
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			result.rejectValue("password", "Matches", "Invalid Password");
		}
		
		if(result.hasErrors()) {
			return null;
		}
		
		return user;
		
	}
	
	
	// Find one user
	public User oneUser(Long id) {
		Optional<User> optionalUser = userRepo.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}
	
	
	
}
