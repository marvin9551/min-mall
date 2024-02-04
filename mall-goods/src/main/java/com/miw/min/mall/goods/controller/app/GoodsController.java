package com.miw.min.mall.goods.controller.app;

import com.miw.min.framework.common.core.Result;
import com.miw.min.mall.goods.entity.DO.GoodsSpu;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName GoodsController
 * @Description 商品管理相关接口
 * @Author marvin
 * @DATE 2024/2/4 15:34
 **/
@RestController(value = "goods")
public class GoodsController {

    @GetMapping("/goods/id")
    public Result<GoodsSpu> getGoodsById(@RequestParam("goodsId") String goodsId) {
        GoodsSpu goodsSpu = new GoodsSpu();
        return Result.success(goodsSpu);
    }
}
