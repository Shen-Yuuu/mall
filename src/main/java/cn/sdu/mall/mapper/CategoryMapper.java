package cn.sdu.mall.mapper;

import cn.sdu.mall.pojo.Category;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品分类持久层接口
 * @Mapper 声明这是持久层
 * BaseMapper<Category>
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}
