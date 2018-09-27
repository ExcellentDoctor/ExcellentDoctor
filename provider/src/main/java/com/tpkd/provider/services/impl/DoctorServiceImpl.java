package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.mapper.*;
import com.tpkd.common.pojo.*;
import com.tpkd.common.services.RpcDoctorService;
import com.tpkd.common.vo.doctor.DoctorData;
import com.tpkd.common.vo.doctor.DoctorDetailedMessage;
import com.tpkd.common.vo.doctor.DoctorPayVo;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
@Service(interfaceClass = RpcDoctorService.class)
public class DoctorServiceImpl implements RpcDoctorService {
@Resource
private DoctorMapper doctorMapper;
@Resource
private HospitalMapper hospitalMapper;
@Resource
private DepartmentMapper departmentMapper;
@Resource
private ImageMapper imageMapper;
@Resource
private UserDoctorMapper userDoctorMapper;
@Resource
private ServicesMapper servicesMapper;
    @Override
    public DoctorDetailedMessage selectDoctorMessage(Integer doctorId) {
        DoctorDetailedMessage doctorDetailedMessage=new DoctorDetailedMessage();
        Doctor doctor=doctorMapper.selectDoctorById(doctorId);
        doctorDetailedMessage.setDoctorId(doctor.getDoctorId());
        doctorDetailedMessage.setDoctorName(doctor.getDoctorName());
        doctorDetailedMessage.setGoodAt(doctor.getGoodAt());
        doctorDetailedMessage.setHonnor(doctor.getHonor());
        doctorDetailedMessage.setProfessionalTitle(doctor.getProfessionalTitle());
        doctorDetailedMessage.setMedicalBackground(doctor.getMedicalBackground());
        Hospital hospital=hospitalMapper.selectByPrimaryKey(doctor.getHospitalId());
        doctorDetailedMessage.setHospitalName(hospital.getHospitalName());
        doctorDetailedMessage.setIntroduce(hospital.getIntroduce());
        String[] departmentId=doctor.getDepartmentId().split(",");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<departmentId.length;i++){
            Department department=departmentMapper.selectById(Integer.valueOf(departmentId[i]));
            if(i==departmentId.length-1){
                sb.append(department.getDepartmentName());
            }else {
                sb.append(department.getDepartmentName() + ",");
            }
        }
        doctorDetailedMessage.setDepartmentName(sb.toString());
        Image image=imageMapper.selectByPrimaryKey(doctor.getImageId());
        doctorDetailedMessage.setImageUrl(image.getImageUrl());
        return doctorDetailedMessage;
    }

    @Override
    public DoctorData selectDoctorData(Integer doctorId) {
        DoctorData doctorData=new DoctorData();
        Doctor doctor=doctorMapper.selectDoctorById(doctorId);
        doctorData.setDoctorId(doctor.getDoctorId());
        doctorData.setDoctorName(doctor.getDoctorName());
        doctorData.setServiceNumber(doctor.getServiceNumber());
        doctorData.setRecommend(doctor.getRecommend());
        doctorData.setProfessionalTitle(doctor.getProfessionalTitle());
        Image image=imageMapper.selectByPrimaryKey(doctor.getImageId());
        doctorData.setImageUrl(image.getImageUrl());
        String[] departmentId=doctor.getDepartmentId().split(",");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<departmentId.length;i++){
            Department department=departmentMapper.selectById(Integer.valueOf(departmentId[i]));
            if(i==departmentId.length-1){
                sb.append(department.getDepartmentName());
            }else {
                sb.append(department.getDepartmentName() + ",");
            }
        }
        Hospital hospital=hospitalMapper.selectByPrimaryKey(doctor.getHospitalId());
        doctorData.setHospitalName(hospital.getHospitalName());
        doctorData.setDepartmentName(sb.toString());
        int count =userDoctorMapper.selectCount(doctorId);
        doctorData.setCountNumber(count);
        return doctorData;
    }

    @Override
    public DoctorPayVo selectDoctorPay(Integer doctorId) {
        Doctor doctor=doctorMapper.selectDoctorById(doctorId);
        DoctorPayVo doctorPayVo=new DoctorPayVo();
        String prices=doctor.getPrices();
        String [] services=doctor.getServices().split(",");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<services.length;i++){
            Services service=servicesMapper.selectByPrimaryKey(Integer.valueOf(services[i]));
            if(i==services.length-1){
                sb.append(service.getServiceName());
            }else {
                sb.append(service.getServiceName() + ",");
            }
        }
        doctorPayVo.setPrice(prices);
        doctorPayVo.setServiceName(sb.toString());
        return doctorPayVo;
    }
}
