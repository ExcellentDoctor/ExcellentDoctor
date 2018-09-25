package com.tpkd.consumer.services;

import com.tpkd.common.pojo.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findTopDep();

    List<Department> findNextDep(Department department);
}
