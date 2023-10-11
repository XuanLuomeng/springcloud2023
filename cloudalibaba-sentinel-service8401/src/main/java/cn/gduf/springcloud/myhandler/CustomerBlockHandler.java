package cn.gduf.springcloud.myhandler;

import cn.gduf.springcloud.entities.CommonResult;
import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author LuoXuanwei
 * @date 2023/10/10 22:12
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException1(BlockException exception) {
        return new CommonResult(444, "按客户自定义,global handlerException---1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(444, "按客户自定义,global handlerException---2");
    }
}
