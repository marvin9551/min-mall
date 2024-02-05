package com.miw.min.mall.goods.entity.DO;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName GoodsSpu
 * @Description 商品SPU
 * @Author marvin
 * @DATE 2024/2/5 11:07
 **/
public class GoodsSpu {

    private Long id;

    private Long categoryId;

    private Long brandId;

    private String name;

    private String goods_sn;

    private String pic;

    private String photoAlbum;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private Date promotionStartTime;

    private Date promotionEndTime;

    private String subTitle;

    private String detail;

    private Integer publishStatus;

    private Integer newStatus;

    private Integer recommendStatus;

    private Date createTime;

    private Date updateTime;

    private Integer deleted;

    public GoodsSpu(Long id, Long categoryId, Long brandId, String name, String goods_sn, String pic, String photoAlbum,
                    BigDecimal price, BigDecimal promotionPrice, Date promotionStartTime, Date promotionEndTime,
                    String subTitle, String detail, Integer publishStatus, Integer newStatus, Integer recommendStatus,
                    Date createTime, Date updateTime, Integer deleted) {
        this.id = id;
        this.categoryId = categoryId;
        this.brandId = brandId;
        this.name = name;
        this.goods_sn = goods_sn;
        this.pic = pic;
        this.photoAlbum = photoAlbum;
        this.price = price;
        this.promotionPrice = promotionPrice;
        this.promotionStartTime = promotionStartTime;
        this.promotionEndTime = promotionEndTime;
        this.subTitle = subTitle;
        this.detail = detail;
        this.publishStatus = publishStatus;
        this.newStatus = newStatus;
        this.recommendStatus = recommendStatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.deleted = deleted;
    }

    public GoodsSpu() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGoods_sn() {
        return goods_sn;
    }

    public void setGoods_sn(String goods_sn) {
        this.goods_sn = goods_sn;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(String photoAlbum) {
        this.photoAlbum = photoAlbum;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }
}
