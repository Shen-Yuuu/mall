package cn.sdu.mall.server;

import cn.sdu.mall.pojo.Item;

import java.util.List;

public interface ItemService {
    List<Item> selectByCategoryId(Integer categoryId);

    void insert(Item item);
    void delete(Integer id);
    Item selectById(Integer id);
    void update(Item item);
}
