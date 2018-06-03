/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azibit.test;

import com.azibit.entities.User;
import com.azibit.entities.UserPhoto;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
/**
 *
 * @author azibit
 */
public class TestClass {
    
    public List<User> getUsers() {
        List<User> users = requestUsersFromServer();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            CompletableFuture.runAsync(() -> {
                user.setPhoto(getUserPhoto(user.getUserId()));
            }).whenComplete((task, throwable) -> {
            });
        }

        return users;
    }
    
    public UserPhoto getUserPhoto(String userId){
        User user = new User();
        return user.getPhoto();
    }
    
    public List<User> requestUsersFromServer(){
        ArrayList<User> users = new ArrayList();
        return users;
    }
}
