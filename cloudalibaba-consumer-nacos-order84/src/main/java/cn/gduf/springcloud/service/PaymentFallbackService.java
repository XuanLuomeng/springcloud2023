package cn.gduf.springcloud.service;

import cn.gduf.springcloud.entities.CommonResult;
import cn.gduf.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author LuoXuanwei
 * @date 2023/10/10 22:53
 */
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)    {
        return new CommonResult<>(444,"服务降级返回,没有该流水信息",new Payment(id, "errorSerial......"));
    }
}
