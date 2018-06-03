/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.azibit.entities;

/**
 *
 * @author azibit
 */
public class User {
    private UserPhoto photo;
    private String userId;

    public UserPhoto getPhoto() {
        return photo;
    }

    public void setPhoto(UserPhoto photo) {
        this.photo = photo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
