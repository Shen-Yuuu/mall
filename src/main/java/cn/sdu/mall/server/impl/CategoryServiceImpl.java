package cn.sdu.mall.server.impl;

import cn.sdu.mall.mapper.CategoryMapper;
import cn.sdu.mall.pojo.Category;
import cn.sdu.mall.server.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public List<Category> selectAll() {
        List<Category> list = categoryMapper.selectList(null);
        return list;
    }
}
