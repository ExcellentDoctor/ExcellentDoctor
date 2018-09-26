package com.tpkd.common.mapper;

import com.tpkd.common.pojo.Department;

import java.util.List;

public interface DepartmentMapper {
    List<Department> findTopDep();

    List<Department> findNextDep(Department department);

    Department selectById(int departmentId);
}
