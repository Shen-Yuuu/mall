package cn.sdu.mall.controller;

import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.server.CategoryService;
import cn.sdu.mall.util.ServerResult;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "商品分类接口")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/category/selectAll")
    @Operation(summary = "查询所有商品分类")
    public ServerResult<List<Category>> selectAll() {
        List<Category> list = categoryService.selectAll();
        return ServerResult.ok(list);
    }


}