package cn.sdu.mall.server.impl;

import cn.sdu.mall.mapper.OrderMapper;
import cn.sdu.mall.pojo.Order;
import cn.sdu.mall.server.OrderService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;

    public List<Order> selectByUserId(Integer userId) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("user_id", userId);
        List<Order> orders = orderMapper.selectList(queryWrapper);
        return orders;
    }

}
