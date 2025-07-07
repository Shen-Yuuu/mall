package cn.sdu.mall.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("mall_order")
public class Order {
    @TableField("order_id")
    private Integer orderId;
    
    @TableField("user_id")
    private Integer userId;
    private Integer total;
}
