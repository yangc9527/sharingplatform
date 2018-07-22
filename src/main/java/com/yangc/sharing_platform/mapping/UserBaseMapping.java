package com.yangc.sharing_platform.mapping;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

@Mapper
@Service
public interface UserBaseMapping {


    @Insert("INSERT INTO TBL_VW_USER(user_id,nickname,telephone,password,email) VALUES(#{userId},#{nickname},#{telephone},#{password},email})")
    void insertUserRegisterInfo(@Param("userId") String userId, @Param("nickname") String nickname, @Param("telephone") String telephone, @Param("password") String password, @Param("email") String email);

}
