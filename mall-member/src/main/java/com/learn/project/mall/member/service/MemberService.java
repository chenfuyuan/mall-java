package com.learn.project.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.learn.project.mall.common.util.PageUtil;
import com.learn.project.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:42:03
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtil queryPage(Map<String, Object> params);
}

