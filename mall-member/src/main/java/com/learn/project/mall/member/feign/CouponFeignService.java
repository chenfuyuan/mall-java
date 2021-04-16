package com.learn.project.mall.member.feign;

import com.learn.project.mall.common.util.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description: 优惠卷远程调用服务接口
 * @Author: chenfuyuan
 * @Date: 2021/4/16 21:51
 */
@FeignClient("mall-coupon")
@RequestMapping("/coupon/coupon")
public interface CouponFeignService {

    /**
     * 获取用户优惠券
     * @return 用户优惠券查询结果
     */
    @RequestMapping("/member/coupons")
    R memberCoupons();
}
