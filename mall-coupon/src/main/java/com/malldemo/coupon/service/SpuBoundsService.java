package com.malldemo.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.malldemo.common.utils.PageUtils;
import com.malldemo.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:21
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

