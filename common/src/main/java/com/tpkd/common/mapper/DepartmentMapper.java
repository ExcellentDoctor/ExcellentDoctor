package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Department;

public interface DepartmentMapper {
    Department selectById(int departmentId);
}
