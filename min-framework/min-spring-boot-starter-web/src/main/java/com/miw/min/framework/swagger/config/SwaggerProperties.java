package com.miw.min.framework.swagger.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotEmpty;

/**
 * @ClassName SwaggerProperties
 * @Description Swagger 配置属性
 * @Author marvin
 * @DATE 2024/2/2 14:37
 **/

@ConfigurationProperties("min.swagger")
public class SwaggerProperties {

    /**
     * 标题
     */
    @NotEmpty(message = "标题不能为空")
    private String title;
    /**
     * 描述
     */
    @NotEmpty(message = "描述不能为空")
    private String description;
    /**
     * 作者
     */
    @NotEmpty(message = "作者不能为空")
    private String author;
    /**
     * 版本
     */
    @NotEmpty(message = "版本不能为空")
    private String version;
    /**
     * url
     */
    @NotEmpty(message = "扫描的 package 不能为空")
    private String url;
    /**
     * email
     */
    @NotEmpty(message = "扫描的 email 不能为空")
    private String email;

    /**
     * license
     */
    @NotEmpty(message = "扫描的 license 不能为空")
    private String license;

    /**
     * license-url
     */
    @NotEmpty(message = "扫描的 license-url 不能为空")
    private String licenseUrl;

    public SwaggerProperties(String title, String description, String author,
                             String version, String url, String email, String license, String licenseUrl) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.version = version;
        this.url = url;
        this.email = email;
        this.license = license;
        this.licenseUrl = licenseUrl;
    }

    public SwaggerProperties() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    @Override
    public String toString() {
        return "SwaggerProperties{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", version='" + version + '\'' +
                ", url='" + url + '\'' +
                ", email='" + email + '\'' +
                ", license='" + license + '\'' +
                ", licenseUrl='" + licenseUrl + '\'' +
                '}';
    }
}
