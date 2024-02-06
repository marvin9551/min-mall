package com.miw.min.mall.goods.dal.dataobject;

import com.baomidou.mybatisplus.annotation.TableName;
import com.miw.min.framework.mybatis.core.dataobject.BaseDO;

import java.io.Serializable;

/**
 * @ClassName GoodsCategoryDO
 * @Description 商品分类DO
 * @Author marvin
 * @DATE 2024/2/6 10:08
 **/
@TableName("goods_category")
public class GoodsCategoryDO extends BaseDO  {



    private String name;

    private Long parentId;

    private Integer level;

    private String icon_url;

    private Integer sort;

    private String url;

    private Integer status;

    public GoodsCategoryDO(String name, Long parentId, Integer level, String icon_url, Integer sort,
                           String url, Integer status) {
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.icon_url = icon_url;
        this.sort = sort;
        this.url = url;
        this.status = status;
    }

    public GoodsCategoryDO() {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getIcon_url() {
        return icon_url;
    }

    public void setIcon_url(String icon_url) {
        this.icon_url = icon_url;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
