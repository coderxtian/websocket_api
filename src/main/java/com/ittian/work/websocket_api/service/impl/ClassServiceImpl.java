package com.ittian.work.websocket_api.service.impl;

import com.github.pagehelper.PageHelper;
import com.ittian.work.websocket_api.mapper.ClassMapper;
import com.ittian.work.websocket_api.model.ClassModel;
import com.ittian.work.websocket_api.service.ClassService;
import com.ittian.work.websocket_api.websocket.WebSocketServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zhangtianzhi
 * Date: 2020/2/11
 * Time: 13:47
 * Description:
 */
@Service
@Transactional
public class ClassServiceImpl implements ClassService {
    @Autowired
    ClassMapper classMapper;

    @Override
    public int deleteByPrimaryKey(Integer classId) {
        return 0;
    }

    @Override
    public int insert(ClassModel record) {
        return 0;
    }

    @Override
    public ClassModel selectByPrimaryKey(Integer classId) {
        return null;
    }

    @Override
    public List<ClassModel> selectAll(int pageNum,int pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        return  classMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(ClassModel record) {
        return 0;
    }

    @Override
    public void addSum(int classId) {
        ClassModel classModel = classMapper.selectByPrimaryKey(classId);
        classModel.setClassSum(classModel.getClassSum()+1);
        classMapper.updateByPrimaryKey(classModel);
        try {
            WebSocketServer.sendInfo(classModel.getClassName()+"班新增成员！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}