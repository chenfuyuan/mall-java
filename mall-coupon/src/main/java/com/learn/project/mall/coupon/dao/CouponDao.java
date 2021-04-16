package com.learn.project.mall.coupon.dao;

import com.learn.project.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:37:11
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
