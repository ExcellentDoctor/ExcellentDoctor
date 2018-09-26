package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.DepartmentMapper;
import com.tpkd.common.pojo.Department;
import com.tpkd.common.services.RpcDepartmentService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service(interfaceClass = RpcDepartmentService.class)
public class DepartmentServiceImpl implements RpcDepartmentService {

    @Resource
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> findTopDep() {
        return departmentMapper.findTopDep();
    }

    @Override
    public List<Department> findNextDep(Department department) {
        return departmentMapper.findNextDep(department);
    }
}
