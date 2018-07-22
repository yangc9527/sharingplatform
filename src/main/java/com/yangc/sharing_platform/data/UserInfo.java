package com.yangc.sharing_platform.data;

/**
 * 用户详细信息类，包含用户的所有信息
 */
public class UserInfo {


    private UserRegisterBody registerData;


    public UserInfo(UserRegisterBody data){

        this.registerData = data;

    }

    public UserRegisterBody getRegisterData() {
        return registerData;
    }

    public void setRegisterData(UserRegisterBody registerData) {
        this.registerData = registerData;
    }
}
