package cn.gduf.springcloud.controller;

import cn.gduf.springcloud.domain.CommonResult;
import cn.gduf.springcloud.domain.Order;
import cn.gduf.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:10
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
