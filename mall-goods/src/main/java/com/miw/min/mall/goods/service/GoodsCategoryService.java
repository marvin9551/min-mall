package com.miw.min.mall.goods.service;

import com.miw.min.mall.goods.controller.admin.vo.GoodsCategoryCreateReqVO;

/**
 * @ClassName GoodsCategoryService
 * @Description 商品分类相关的Service
 * @Author marvin
 * @DATE 2024/2/5 16:43
 **/
public interface GoodsCategoryService {
    /**
     * 生成商品分类
     * @param createReqVO
     * @return
     */
    Integer createCategory(GoodsCategoryCreateReqVO createReqVO);
}
