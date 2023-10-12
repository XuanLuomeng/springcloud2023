package cn.gduf.springcloud.service;

/**
 * @author LuoXuanwei
 * @date 2023/10/11 14:23
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
