package com.learn.project.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:48:08
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

