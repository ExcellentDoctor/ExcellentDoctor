package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.util.DtoUtil;
import com.tpkd.common.vo.doctor.DoctorMessageVo;
import com.tpkd.common.vo.doctor.DoctorSelectVo;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    private HttpSolrClient httpSolrClient=new HttpSolrClient("http://localhost:8180/solr/doctor");
    @Override
    public Dto selectDoctor(DoctorSelectVo doctorSelectVo) {
        SolrQuery solrQuery=new SolrQuery();
        solrQuery.setQuery("doctorId:1");
        QueryResponse response= null;
        try {
            response=httpSolrClient.query(solrQuery);
        } catch (Exception e){
            return DtoUtil.getFailed("获取失败","1001");
        }
        List<DoctorMessageVo> list=response.getBeans(DoctorMessageVo.class);
        return DtoUtil.getSuccess("成功获取",list);
    }
}
