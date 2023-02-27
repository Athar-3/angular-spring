package com.mmm.service;

import com.mmm.entity.User;
import com.mmm.exceptions.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




public interface UserService {

	User save(User registration)throws EmailAlreadyInUseException, PhoneAlreadyInUseException;
	User findByEmailAndPassword(String email, String password) ;
	User findByEmail(String email) ;
	Boolean isValidUser(String email, String password) throws EmailNotFoundException, PasswordNotMatchedException;
	
	
	public Boolean emailInUse(String email) throws EmailNotFoundException;
	public Boolean phoneInUse(String phone) throws PhoneNotFoundException;
	public Boolean isValidPassword(String email, String pass) ;

	
}