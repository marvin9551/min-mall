package com.miw.min.mall.goods.controller.admin.vo;

import org.springframework.web.bind.annotation.RequestBody;

/**
 * @ClassName GoodsCategoryCreateReqVO
 * @Description 商品分类创建
 * @Author marvin
 * @DATE 2024/2/5 16:31
 **/
public class GoodsCategoryCreateReqVO {


    private String name;

    private Long parentId;

    private Integer level;

    private String icon_url;

    private Integer sort;

    private String url;


    public GoodsCategoryCreateReqVO(String name, Long parentId, Integer level, String icon_url, Integer sort, String url) {
        this.name = name;
        this.parentId = parentId;
        this.level = level;
        this.icon_url = icon_url;
        this.sort = sort;
        this.url = url;
    }

    public GoodsCategoryCreateReqVO() {
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
}
