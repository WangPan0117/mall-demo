package com.malldemo.coupon.dao;

import com.malldemo.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author wangpan
 * @email ${email}
 * @date 2022-06-27 15:04:21
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
