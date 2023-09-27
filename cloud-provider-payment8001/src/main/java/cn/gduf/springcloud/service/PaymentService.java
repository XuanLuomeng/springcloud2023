package cn.gduf.springcloud.service;

import cn.gduf.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author LuoXuanwei
 * @date 2023/9/26 15:30
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
