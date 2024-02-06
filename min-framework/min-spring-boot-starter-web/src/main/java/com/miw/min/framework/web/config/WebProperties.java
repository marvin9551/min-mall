package com.miw.min.framework.web.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;



/**
 * @ClassName WebProperties
 * @Description WebProperties
 * @Author marvin
 * @DATE 2024/2/1 10:11
 **/

@ConfigurationProperties
public class WebProperties {

    private Api appApi = new Api("/app-api","**.controller.app.**");

    private Api adminApi = new Api("/admin-api","**.controller.admin.**");

    public static class Api {
        /**
         *  Api 前缀，实现所有 Controller 提供的 Restful Api的统一前缀
         */

        private String prefix;

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
