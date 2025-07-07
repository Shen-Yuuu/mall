package cn.sdu.mall.server.impl;


import cn.sdu.mall.mapper.ItemMapper;
import cn.sdu.mall.pojo.Item;
import cn.sdu.mall.server.ItemService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品业务层接口
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<Item> selectByCategoryId(Integer categoryId){

        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("category_id",categoryId);
        List<Item> items = itemMapper.selectList(queryWrapper);
        return items;

    }

    @Override
    public void insert(Item item) {

        int result = itemMapper.insert(item);

        if(result < 1){
            throw new RuntimeException("添加商品失败");
        }

    }

    @Override
    public void delete(Integer id) {
        int result = itemMapper.deleteById(id);

        if(result < 1){
            throw new RuntimeException("删除商品失败");
        }
    }

    @Override
    public Item selectById(Integer id) {
        Item result = itemMapper.selectById(id);

        if(result ==null){
            throw new RuntimeException("查找商品失败");
        }

        return itemMapper.selectById(id);
    }

    @Override
    public void update(Item item) {
        Item oldItem = itemMapper.selectById(item.getId());
        if(oldItem != null){

            if(item.getImage()==null||!item.getImage().equals("")){
                item.setImage(oldItem.getImage());
            }

            int result = itemMapper.updateById(item);
            if(result < 1){
                throw new RuntimeException("更新商品失败");
            }
        }else{
            throw new RuntimeException("修改商品失败");
        }
    }

}
