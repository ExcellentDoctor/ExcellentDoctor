package com.tpkd.consumer.controller;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Department;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.RedisUtil;
import com.tpkd.consumer.services.DepartmentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dep")
public class DepartmentController {

    @Resource
    private DepartmentService departmentService;

    @Resource
    private RedisUtil redisUtil;

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/findDep",method = RequestMethod.POST)
    public Dto findDep(){
        final String REDIS_KEY = "DepartmentList";
        List<Department> topDepList = departmentService.findTopDep();
        Map map = new HashMap();
        map.put("top",topDepList);
        if (redisUtil.isexist(REDIS_KEY)){
            map = (Map) redisUtil.get(REDIS_KEY);
        }else{
        for (Department dep:topDepList) {
            Department department = new Department();
            department.setParentId(dep.getDepartmentId());
            List<Department> list = departmentService.findNextDep(department);
            map.put(dep.getDepartmentId(),list);
        }
        redisUtil.setHasTimeOut(REDIS_KEY,map,1440);
        }
        return DtoUtil.getSuccess(map);
    }





}
