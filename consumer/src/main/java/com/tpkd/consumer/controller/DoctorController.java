package com.tpkd.consumer.controller;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.vo.doctor.DoctorSelectVo;
import com.tpkd.consumer.services.DoctorService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class DoctorController {
    @Resource
    private DoctorService doctorService;

    /**
     * 查询医生列表
     * @param doctorSelectVo
     * @return
     */
    @RequestMapping("selectDoctor")
    public Dto selectDoctor(@RequestBody DoctorSelectVo doctorSelectVo){
        return doctorService.selectDoctor(doctorSelectVo);
    }

    @RequestMapping("selectDoctorMessage/{doctorId}")
    public Dto selectDoctorMessage(@PathVariable Integer doctorId){
        return new Dto();
    }
}
