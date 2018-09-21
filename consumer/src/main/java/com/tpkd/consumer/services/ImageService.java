package com.tpkd.consumer.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;

public interface ImageService {
    Dto insertImage(Image image);
}
