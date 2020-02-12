package com.ittian.work.websocket_api.mapper;

import com.ittian.work.websocket_api.model.ClassModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ClassMapper {
    int deleteByPrimaryKey(Integer classId);

    int insert(ClassModel record);

    ClassModel selectByPrimaryKey(Integer classId);

    List<ClassModel> selectAll();

    int updateByPrimaryKey(ClassModel record);
}