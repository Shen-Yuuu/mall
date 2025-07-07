package cn.sdu.mall.test;

import cn.sdu.mall.mapper.CategoryMapper;
import cn.sdu.mall.pojo.Category;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * 商品分类持久层测试类
 * @SpringBootTest 表示测试类
 */
@SpringBootTest
public class CategoryMapperTest {
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void testSelectAll(){
        QueryWrapper<Category> queryWrapper = null;
        List<Category> list = categoryMapper.selectList(queryWrapper);
        System.out.println("查询结果: "+list);
    }
}
