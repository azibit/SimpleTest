/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test;

import com.azibit.entities.User;
import com.azibit.entities.UserPhoto;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author azibit
 */
public class TestClass {
    
    @Test
    public void testGetUsers(){
        
        com.azibit.test.TestClass test = new com.azibit.test.TestClass();
        List<User> users = test.getUsers();
        Assert.assertNotNull(users);
        Assert.assertEquals(2, users.size());
    }
    
    public void testGetUserPhoto(String userId){
        com.azibit.test.TestClass test = new com.azibit.test.TestClass();
        UserPhoto photo =  test.getUserPhoto(userId);
        
        Assert.assertNotNull(photo);
    }
}
