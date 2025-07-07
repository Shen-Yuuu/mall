package cn.sdu.mall.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 *  商品分类实体类
 *    封装商品分类信息
 * @author
 *
 */
@TableName("category")
public class Category {

    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
