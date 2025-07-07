package cn.sdu.mall.server;

import cn.sdu.mall.pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();
}
