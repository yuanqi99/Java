package com.rtcroom.project.system.user.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.rtcroom.project.system.user.domain.SysUser;
import com.rtcroom.project.system.user.mapper.SysUserMapper;
import com.rtcroom.project.system.user.service.ISysUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户信息表 服务实现类
 * </p>
 *
 * @author yuanqi
 * @since 2024-01-15
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

}
