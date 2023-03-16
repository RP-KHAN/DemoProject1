package com.example.demoproject1.models;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class UserModel extends ViewModel {
    String userName = "";
    String password = "";
    String gender = "";

    public UserModel(String userName, String password, String gender) {
        this.userName = userName;
        this.password = password;
        this.gender = gender;
    }

    public UserModel(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void onLoginButtonClick(View view){
        if(userName.isEmpty() || password.isEmpty()){
            return;
        }
        //success
    }

}
