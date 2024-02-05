CREATE DATABASE `min-mall-goods` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

-- `min-mall-goods`.goods_attribute definition

CREATE TABLE `goods_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `goods_attribute_category_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品属性分类id',
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '名称',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '类型 0 规则 1 参数',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除 1 已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品属性表';

-- `min-mall-goods`.goods_attribute_category definition

CREATE TABLE `goods_attribute_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除 1 已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品属性分类表';

-- `min-mall-goods`.goods_brand definition

CREATE TABLE `goods_brand` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '品牌名称',
  `desc` varchar(512) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '品牌介绍',
  `pic` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '品牌图',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除  1 已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品品牌表';


-- `min-mall-goods`.goods_category definition

CREATE TABLE `goods_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '分类名称',
  `parent_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '父级ID',
  `level` tinyint(4) NOT NULL DEFAULT '0' COMMENT '层级',
  `icon_url` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '图表URL',
  `sort` int(11) NOT NULL DEFAULT '0' COMMENT '排序',
  `url` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '跳转地址',
  `status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '状态 0 展示 1隐藏',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '跟新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除 1 已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `goods_category_UN` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品分类表';

-- `min-mall-goods`.goods_sku definition

CREATE TABLE `goods_sku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `category_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品分类id',
  `brand_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品分类id',
  `goods_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '商品id',
  `price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '商品价格',
  `stock` int(11) NOT NULL DEFAULT '0' COMMENT '商品库存',
  `lock_stock` int(11) NOT NULL DEFAULT '0' COMMENT '锁定库存',
  `pic` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品图片',
  `attribute` json NOT NULL COMMENT '属性，json格式',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除 1 已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `goods_sku_UN` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品sku';

-- `min-mall-goods`.goods_spu definition

CREATE TABLE `goods_spu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `category_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '分类id',
  `brand_id` bigint(20) NOT NULL DEFAULT '0' COMMENT '品牌id',
  `name` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品名称',
  `goods_sn` varchar(128) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品编码',
  `pic` varchar(256) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '商品主图',
  `photo_album` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品图集',
  `price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '商品价格',
  `promotion_price` decimal(10,2) NOT NULL DEFAULT '0.00' COMMENT '优惠价格',
  `promotion_start_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '优惠开始时间',
  `promotion_end_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '优惠结束时间',
  `sub_title` varchar(64) COLLATE utf8mb4_unicode_ci NOT NULL DEFAULT '' COMMENT '副标题',
  `detail` text COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '商品详情',
  `publish_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '发布状态 0 发布 1 未发布',
  `new_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '新品状态 0 新品 1 非新品',
  `recommend_status` tinyint(4) NOT NULL DEFAULT '0' COMMENT '推荐状态 0 推荐 1 不推荐',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '0 未删除 1 已删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `goods_spu_UN` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='商品spu';