package com.sda.springstarter.demo.interfaces;

import com.sda.springstarter.demo.model.User;

import javax.jws.soap.SOAPBinding;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);

}
