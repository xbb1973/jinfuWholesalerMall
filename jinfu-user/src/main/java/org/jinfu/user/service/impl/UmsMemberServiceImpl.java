package org.jinfu.user.service.impl;

import org.jinfu.user.entity.UmsMember;
import org.jinfu.user.mapper.UmsMemberMapper;
import org.jinfu.user.service.IUmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author xbb
 * @since 2020-04-14
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

}
