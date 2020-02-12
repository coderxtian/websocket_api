package com.ittian.work.websocket_api.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.ittian.work.websocket_api.model.ClassModel;
import com.ittian.work.websocket_api.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: zhangtianzhi
 * Date: 2020/2/11
 * Time: 14:17
 * Description:
 */
@RestController
@RequestMapping("class")
public class ClassController {
    @Autowired
    ClassService classService;

    @RequestMapping("list")
    public PageInfo<ClassModel> list(int pageNum, int pageSize){
        return new PageInfo<ClassModel>(classService.selectAll(pageNum, pageSize));
    }

    @RequestMapping("addSum")
    public void addSum(int classId){
        classService.addSum(classId);
    }
}