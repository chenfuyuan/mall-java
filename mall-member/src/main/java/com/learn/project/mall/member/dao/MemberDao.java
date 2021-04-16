package com.learn.project.mall.member.dao;

import com.learn.project.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenfuyuan
 * @email chenfuyuan0713@163.com
 * @date 2021-04-16 15:42:03
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
