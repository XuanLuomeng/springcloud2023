package cn.gduf.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{
    private Integer code;
    private String  message;
    private T       data;

    public CommonResult(Integer code, String message)    {
        this(code,message,null);
    }
}

