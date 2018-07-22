package com.yangc.sharing_platform.service;

import com.yangc.sharing_platform.data.UserInfo;
import com.yangc.sharing_platform.data.UserRegisterBody;
import com.yangc.sharing_platform.mapping.UserBaseMapping;
import com.yangc.sharing_platform.utils.IdGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserBaseService {


    private UserBaseMapping userBaseMapping;

    @Autowired
    public UserBaseService(UserBaseMapping userBaseMapping) {

        this.userBaseMapping = userBaseMapping;
    }


    public UserInfo register(UserRegisterBody data) {

        String userId = IdGenerator.generateUserId();

        userBaseMapping.insertUserRegisterInfo(userId, data.getNickname(), data.getTelephone(), data.getPassword(), data.getEmail());
        return null;
    }


    public UserInfo login(String account, String password) {


        return null;
    }

}
