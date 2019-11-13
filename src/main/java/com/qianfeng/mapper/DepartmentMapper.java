package com.qianfeng.mapper;

import com.qianfeng.entity.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface DepartmentMapper {
    List<Department> getDepartmentList();
}
