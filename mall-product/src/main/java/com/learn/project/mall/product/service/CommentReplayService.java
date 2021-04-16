package com.learn.project.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 14:32:05
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

