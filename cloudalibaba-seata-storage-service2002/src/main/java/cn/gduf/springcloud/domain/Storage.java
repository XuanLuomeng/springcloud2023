package cn.gduf.springcloud.domain;

import lombok.Data;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:21
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
