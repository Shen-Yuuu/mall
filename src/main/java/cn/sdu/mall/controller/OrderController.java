package cn.sdu.mall.controller;

import cn.sdu.mall.pojo.Order;
import cn.sdu.mall.server.OrderService;
import cn.sdu.mall.util.ServerResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderservice;

    @RequestMapping("/order/selectByUserId")
    public ServerResult<List<Order>> selectByUserId(Integer userId) {
        List<Order> orders = orderservice.selectByUserId(userId);
        return ServerResult.ok(orders);
    }

}
