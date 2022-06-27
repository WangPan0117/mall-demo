package com.malldemo.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.malldemo.common.utils.PageUtils;
import com.malldemo.coupon.entity.SeckillSkuNoticeEntity;

import java.util.Map;

/**
 * 秒杀商品通知订阅
 *
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:22
 */
public interface SeckillSkuNoticeService extends IService<SeckillSkuNoticeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

