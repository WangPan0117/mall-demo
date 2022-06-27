package com.malldemo.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.malldemo.common.utils.PageUtils;
import com.malldemo.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:21
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

