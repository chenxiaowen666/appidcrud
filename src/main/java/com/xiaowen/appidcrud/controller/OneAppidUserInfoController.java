package com.xiaowen.appidcrud.controller;

import com.github.pagehelper.PageInfo;
import com.xiaowen.appidcrud.entity.OneAppidUserInfo;
import com.xiaowen.appidcrud.service.OneAppidUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/one-appid-user-info")
public class OneAppidUserInfoController {

    @Autowired
    private OneAppidUserInfoService service;

    @PostMapping
    public String create(@RequestBody OneAppidUserInfo record) {
        service.insert(record);
        return "创建成功";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") String id, @RequestBody OneAppidUserInfo record) {
        record.setAppidUserInfoId(id);
        service.update(record);
        return "更新成功";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") String id) {
        service.deleteById(id);
        return "删除成功";
    }

    @GetMapping("/{id}")
    public OneAppidUserInfo getById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    @GetMapping
    public List<OneAppidUserInfo> getAll() {
        return service.findAll();
    }

    @PostMapping("/page")
    public PageInfo<OneAppidUserInfo> getPage(
            @RequestBody OneAppidUserInfo condition,
            @RequestParam(defaultValue = "1") int pageNum,
            @RequestParam(defaultValue = "10") int pageSize) {
        return service.findPage(condition, pageNum, pageSize);
    }
}


