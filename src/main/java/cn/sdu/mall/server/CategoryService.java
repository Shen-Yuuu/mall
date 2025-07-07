package cn.sdu.mall.server;

import cn.sdu.mall.pojo.Category;

import java.util.List;

public interface CategoryService {
    List<Category> selectAll();
}
