package com.learn.project.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.product.entity.SkuSaleAttrValueEntity;

import java.util.Map;

/**
 * sku销售属性&值
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 14:32:05
 */
public interface SkuSaleAttrValueService extends IService<SkuSaleAttrValueEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

