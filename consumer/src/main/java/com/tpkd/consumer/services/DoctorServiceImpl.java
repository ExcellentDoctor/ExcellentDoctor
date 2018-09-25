package com.tpkd.consumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Doctor;
import com.tpkd.common.services.RpcDoctorService;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.util.EmptyUtil;
import com.tpkd.common.vo.doctor.DoctorMessageVo;
import com.tpkd.common.vo.doctor.DoctorSelectVo;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Reference
    private RpcDoctorService rpcDoctorService;
    private HttpSolrClient httpSolrClient=new HttpSolrClient("http://localhost:8180/solr/doctor");
    @Override
    public Dto selectDoctor(DoctorSelectVo doctorSelectVo) {
        SolrQuery solrQuery=new SolrQuery();
        if(EmptyUtil.isEmpty(doctorSelectVo)){
            solrQuery.setQuery("*:*");
        }else {
            if(!EmptyUtil.isEmpty(doctorSelectVo.getDepartmentId())){
                solrQuery.setQuery("departmentId:"+doctorSelectVo.getDepartmentId());
            }
            if(!EmptyUtil.isEmpty(doctorSelectVo.getServiceId())){
                solrQuery.setQuery("services:*"+doctorSelectVo.getServiceId()+"*");
            }
            if(!EmptyUtil.isEmpty(doctorSelectVo.getAcs())){
                solrQuery.setSort(doctorSelectVo.getAcs(), SolrQuery.ORDER.asc);
            }
            if(!EmptyUtil.isEmpty(doctorSelectVo.getDesc())){
                solrQuery.setSort(doctorSelectVo.getDesc(), SolrQuery.ORDER.desc);
            }
        }
        QueryResponse response= null;
        try {
            response=httpSolrClient.query(solrQuery);
        } catch (Exception e){
            return DtoUtil.getFailed("获取失败","1001");
        }
        List<DoctorMessageVo> list=response.getBeans(DoctorMessageVo.class);
        return DtoUtil.getSuccess("成功获取",list);
    }

    @Override
    public Dto selectDoctorMessage(Integer doctorId) {
        Doctor doctor=rpcDoctorService.selectDoctorMessage(doctorId);
        if(EmptyUtil.isEmpty(doctor)){
            return DtoUtil.getFailed("获取信息失败","1001");
        }
        return DtoUtil.getSuccess("获取信息成功",doctor);
    }
}
