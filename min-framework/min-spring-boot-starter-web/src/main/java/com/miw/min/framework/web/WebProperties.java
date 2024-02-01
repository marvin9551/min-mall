package com.miw.min.framework.web;

import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @ClassName WebProperties
 * @Description WebProperties
 * @Author marvin
 * @DATE 2024/2/1 10:11
 **/
@Validated
public class WebProperties {

    @NotNull(message = "APP API 不能为空")
    private Api appApi = new Api("/app-api","**.controller.app.**");
    @NotNull(message = "Admin API 不能为空")
    private Api adminApi = new Api("/admin-api","**.controller.admin.**");

    public static class Api {
        /**
         *  Api 前缀，实现所有 Controller 提供的 Restful Api的统一前缀
         */

        @NotEmpty(message = "Api 前缀不能为空")
        private String prefix;

        @NotEmpty(message = "Controller 所在包不能为空")
        private String controller;

        public Api(String prefix, String controller) {
            this.prefix = prefix;
            this.controller = controller;
        }

        public String getPrefix() {
            return prefix;
        }

        public String getController() {
            return controller;
        }
    }

    public Api getAppApi() {
        return appApi;
    }

    public Api getAdminApi() {
        return adminApi;
    }
}
