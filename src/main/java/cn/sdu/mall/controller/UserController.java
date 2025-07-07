package cn.sdu.mall.controller;

import cn.sdu.mall.pojo.User;
import cn.sdu.mall.server.UserService;
import cn.sdu.mall.util.ServerResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/user/selectAll")
    @Operation(summary = "查询所有用户")
    public ServerResult<List<User>> selectAll(){
        List<User> list = userService.selectAll();
        return ServerResult.ok(list);
    }
}
