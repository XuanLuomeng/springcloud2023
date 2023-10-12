package cn.gduf.springcloud.service;

import cn.gduf.springcloud.domain.Order;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:08
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
