package com.tpkd.consumer.services;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;
import com.tpkd.common.services.RpcImageService;
import com.tpkd.common.util.DtoUtil;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService{
    @Reference
    private RpcImageService rpcImageService;
    @Override
    public Dto insertImage(Image image) {
        return rpcImageService.insertImage(image);
    }
}
