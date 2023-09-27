package cn.gduf.springcloud.service.impl;

import cn.gduf.springcloud.dao.PaymentDao;
import cn.gduf.springcloud.entities.Payment;
import cn.gduf.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LuoXuanwei
 * @date 2023/9/26 21:33
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
