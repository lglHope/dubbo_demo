package liu.hope.dubbo_provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import liu.hope.entity.User;
import liu.hope.mapper.UserMapper;
import liu.hope.service.IuserService;

import javax.annotation.Resource;

/**
 * @author Hope
 * @version 1.0
 * TODO:
 * @createTime 2018/12/9 15:07
 */
@Service(interfaceClass = IuserService.class)
public class UserServiceImpl implements IuserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public User queryById(Integer id) {
        User user = userMapper.queryById(id);
        System.out.println("服务提供者已调用------" + id);
        return user;
    }
}
