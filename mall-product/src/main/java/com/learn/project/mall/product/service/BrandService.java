package com.learn.project.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 14:32:05
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

