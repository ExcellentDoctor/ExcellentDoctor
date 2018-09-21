package com.tpkd.provider.services.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.mapper.ImageMapper;
import com.tpkd.common.pojo.Image;
import com.tpkd.common.services.RpcImageService;
import com.tpkd.common.util.DtoUtil;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
@Component
@Service(interfaceClass = RpcImageService.class)
public class ImageServiceImpl implements RpcImageService{
    @Resource
    private ImageMapper imageMapper;
    @Override
    public Dto insertImage(Image image) {
         int temp=imageMapper.insertImage(image);
         if(temp>0){
             return DtoUtil.getSuccess("图片上传成功",image.getImageId());
         }
            return DtoUtil.getFailed("上传失败","1001");
    }
}
