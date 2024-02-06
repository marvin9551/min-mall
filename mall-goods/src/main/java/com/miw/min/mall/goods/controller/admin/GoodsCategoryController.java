package com.miw.min.mall.goods.controller.admin;

import com.miw.min.framework.common.core.Result;
import com.miw.min.mall.goods.controller.admin.vo.GoodsCategoryCreateReqVO;
import com.miw.min.mall.goods.service.GoodsCategoryService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsCategoryController
 * @Description 商品分类相关
 * @Author marvin
 * @DATE 2024/2/5 16:25
 **/
@RestController
@Tag(name = "管理后台 - 商品分类")
@RequestMapping("/goods/category")
public class GoodsCategoryController {


    @Autowired
    private GoodsCategoryService goodsCategoryService;

    @PostMapping("/create")
    @Operation(summary = "创建商品分类")
    public Result<Integer> createCategory(@RequestBody GoodsCategoryCreateReqVO createReqVO) {
        return Result.success(goodsCategoryService.createCategory(createReqVO));
    }

}
