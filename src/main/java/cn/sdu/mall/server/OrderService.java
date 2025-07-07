package cn.sdu.mall.server;

import cn.sdu.mall.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> selectByUserId(Integer userId);
}
