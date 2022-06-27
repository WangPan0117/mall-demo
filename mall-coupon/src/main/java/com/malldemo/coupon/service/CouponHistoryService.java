package com.malldemo.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.malldemo.common.utils.PageUtils;
import com.malldemo.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:21
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

