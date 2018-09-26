package com.tpkd.common.services;

import com.tpkd.common.pojo.Department;

import java.util.List;

public interface RpcDepartmentService {

    List<Department> findTopDep();

    List<Department> findNextDep(Department department);
}
