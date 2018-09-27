package com.tpkd.common.services;

import com.tpkd.common.pojo.Classification;

public interface RpcClassificationService {
    Classification selectByClassificationId(Integer classificationId);
}
