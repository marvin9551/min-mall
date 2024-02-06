package com.miw.min.mall.goods.service.impl;
import java.time.LocalDateTime;

import com.miw.min.mall.goods.controller.admin.vo.GoodsCategoryCreateReqVO;
import com.miw.min.mall.goods.dal.dataobject.GoodsCategoryDO;
import com.miw.min.mall.goods.dal.mysql.GoodsCategoryMapper;
import com.miw.min.mall.goods.service.GoodsCategoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @ClassName GoodsCategoryServiceImpl
 * @Description 商品分类实现
 * @Author marvin
 * @DATE 2024/2/5 16:47
 **/
@Service
public class GoodsCategoryServiceImpl implements GoodsCategoryService {
    @Resource
    private GoodsCategoryMapper goodsCategoryMapper;

    @Override
    public Integer createCategory(GoodsCategoryCreateReqVO createReqVO) {


        GoodsCategoryDO category = new GoodsCategoryDO();

        category.setName(createReqVO.getName());
        category.setParentId(createReqVO.getParentId());
        category.setLevel(category.getLevel());
        category.setIcon_url(category.getIcon_url());
        category.setSort(category.getSort());
        category.setUrl(category.getUrl());
        category.setStatus(category.getStatus());
        category.setCreateTime(LocalDateTime.now());
        category.setUpdateTime(LocalDateTime.now());
        category.setDeleted(false);
        return goodsCategoryMapper.insert(category);
    }

}
