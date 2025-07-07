package cn.sdu.mall.server.impl;

import cn.sdu.mall.mapper.UserMapper;
import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.pojo.Item;
import cn.sdu.mall.pojo.User;
import cn.sdu.mall.server.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAll()
    {
        List<User> list = userMapper.selectList(null);
        return list;
    }
}
