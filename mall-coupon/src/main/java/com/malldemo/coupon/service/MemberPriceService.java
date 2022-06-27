package com.malldemo.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.malldemo.common.utils.PageUtils;
import com.malldemo.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:22
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

