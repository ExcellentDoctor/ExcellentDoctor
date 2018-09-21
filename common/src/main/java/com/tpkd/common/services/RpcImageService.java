package com.tpkd.common.services;

import com.tpkd.common.dto.Dto;
import com.tpkd.common.pojo.Image;

public interface RpcImageService {
    Dto insertImage(Image image);
}
