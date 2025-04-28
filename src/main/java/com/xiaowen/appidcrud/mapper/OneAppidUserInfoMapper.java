package com.xiaowen.appidcrud.mapper;

import com.xiaowen.appidcrud.entity.OneAppidUserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OneAppidUserInfoMapper {
    int insert(OneAppidUserInfo record);

    int update(OneAppidUserInfo record);

    int deleteById(String appidUserInfoId);

    OneAppidUserInfo selectById(String appidUserInfoId);

    List<OneAppidUserInfo> selectAll();

    List<OneAppidUserInfo> selectPage(OneAppidUserInfo condition);
}
