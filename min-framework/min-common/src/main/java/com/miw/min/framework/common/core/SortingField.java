package com.miw.min.framework.common.core;

/**
 * @ClassName SortingField
 * @Description 排序字段 DTO
 * @Author marvin
 * @DATE 2024/2/6 10:00
 **/
public class SortingField {

    /**
     * 顺序 - 升序
     */
    public static final String ORDER_ASC = "asc";
    /**
     * 顺序 - 降序
     */
    public static final String ORDER_DESC = "desc";

    /**
     * 字段
     */
    private String field;
    /**
     * 顺序
     */
    private String order;

    public SortingField(String field, String order) {
        this.field = field;
        this.order = order;
    }

    public SortingField() {
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
}
