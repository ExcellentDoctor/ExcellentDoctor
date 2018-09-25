package com.tpkd.consumer.services.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.pojo.Department;
import com.tpkd.common.services.RpcDepartmentService;
import com.tpkd.consumer.services.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Reference
    private RpcDepartmentService rpcDepartmentService;

    @Override
    public List<Department> findTopDep() {
        return rpcDepartmentService.findTopDep();
    }

    @Override
    public List<Department> findNextDep(Department department) {
        return rpcDepartmentService.findNextDep(department);
    }
}
