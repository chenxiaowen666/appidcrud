package com.xiaowen.appidcrud.service;

import com.github.pagehelper.PageInfo;
import com.xiaowen.appidcrud.entity.OneAppidUserInfo;

import java.util.List;

public interface OneAppidUserInfoService {
    void insert(OneAppidUserInfo record);

    void update(OneAppidUserInfo record);

    void deleteById(String appidUserInfoId);

    OneAppidUserInfo findById(String appidUserInfoId);

    List<OneAppidUserInfo> findAll();

    PageInfo<OneAppidUserInfo> findPage(OneAppidUserInfo condition, int pageNum, int pageSize);
}