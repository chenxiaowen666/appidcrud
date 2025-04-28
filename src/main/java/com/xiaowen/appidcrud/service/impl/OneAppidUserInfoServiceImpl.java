package com.xiaowen.appidcrud.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaowen.appidcrud.entity.OneAppidUserInfo;
import com.xiaowen.appidcrud.mapper.OneAppidUserInfoMapper;
import com.xiaowen.appidcrud.service.OneAppidUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OneAppidUserInfoServiceImpl implements OneAppidUserInfoService {

    @Autowired
    private OneAppidUserInfoMapper mapper;

    @Override
    public void insert(OneAppidUserInfo record) {
        mapper.insert(record);
    }

    @Override
    public void update(OneAppidUserInfo record) {
        mapper.update(record);
    }

    @Override
    public void deleteById(String appidUserInfoId) {
        mapper.deleteById(appidUserInfoId);
    }

    @Override
    public OneAppidUserInfo findById(String appidUserInfoId) {
        return mapper.selectById(appidUserInfoId);
    }

    @Override
    public List<OneAppidUserInfo> findAll() {
        return mapper.selectAll();
    }

    @Override
    public PageInfo<OneAppidUserInfo> findPage(OneAppidUserInfo condition, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<OneAppidUserInfo> list = mapper.selectPage(condition);
        return new PageInfo<>(list);
    }
}