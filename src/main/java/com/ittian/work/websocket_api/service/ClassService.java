package com.ittian.work.websocket_api.service;

import com.ittian.work.websocket_api.model.ClassModel;

import java.util.List;

public interface ClassService {
    int deleteByPrimaryKey(Integer classId);

    int insert(ClassModel record);

    ClassModel selectByPrimaryKey(Integer classId);

    List<ClassModel> selectAll(int pageNum, int pageSize);

    int updateByPrimaryKey(ClassModel record);


    void addSum(int classId);
}
