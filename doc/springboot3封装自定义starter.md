### 【实战】 Springboot3.0 封装自定义Starter

#### 1. 什么是Starter

starter 是SpringBoot中的一个新发明，它是一种项目模板，其中包含了一些常用的依赖和配置。使用starter可以简化项目的配置，并提高开发效率。

#### 2. 为什么要封装自定义Starter

在实际开发中，我们可能会遇到一些通用的功能或者配置，这些功能或配置可能会被多个项目使用。为了提高代码复用性和可维护性，我们可以将这些功能或配置封装为一个自定义的Starter，然后在需要使用这些功能的项目中引入该Starter。这样，我们就可以在项目中轻松地使用这些功能或配置，而不需要重复编写相同的代码。

#### 3. 如何封装自定义Starter

1. 创建一个Maven项目，并添加SpringBoot的依赖。

2. 创建一个配置类，用于定义需要封装的功能或配置。

3. 创建一个自动配置类，用于在项目中自动加载配置类。

4. 创建一个Starter模块，用于打包配置类和自动配置类，并将其发布到Maven仓库。

5. 在需要使用该Starter的项目中，引入该Starter，并按照Starter的文档进行配置和使用。

#### 4. 封装自定义Starter的示例

1. 创建一个Maven项目，并添加依赖。

```xml
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-autoconfigure</artifactId>
      <version>3.0.2</version>
    </dependency>
```
   
2. 创建一个配置类，用于定义需要封装的功能或配置。

```java
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

    }
```

3. 创建一个自动配置类，用于在项目中自动加载配置类。

```java
@AutoConfiguration
@ConditionalOnClass({OpenAPI.class})
@EnableConfigurationProperties(SwaggerProperties.class)
@ConditionalOnProperty(prefix = "springdoc.api-docs", name = "enabled", havingValue = "true", matchIfMissing = true) // 设置为 false 时，禁用
public class MinSwaggerAutoConfiguration {


    @Bean
    public OpenAPI createApi(SwaggerProperties properties) {
        OpenAPI openAPI = new OpenAPI()
                // 接口信息
                .info(buildInfo(properties));
        return openAPI;
    }
    /**
     * API 摘要信息
     */
    private Info buildInfo(SwaggerProperties properties) {
        return new Info()
                .title(properties.getTitle())
                .description(properties.getDescription())
                .version(properties.getVersion())
                .contact(new Contact().name(properties.getAuthor()).url(properties.getUrl()).email(properties.getEmail()))
                .license(new License().name(properties.getLicense()).url(properties.getLicenseUrl()));
    }
}
```
4.创建imports配置文件，把需要自动装载的类配置上。
- @AutoConfiguration 是spring boot2.7新引入的，自动配置类必须放进下面的文件里才算自动配置类

```xml
META-INF/spring/org.springframework.boot.autoconfigure.AutoConfiguration.imports
```

5.mvn clean install 打入到本地仓库





