# spring-boot-dubbo
spring boot 与 dubbo 整合
- 注解方式 `@EnableDubbo` 启动 `dubbo` ,@Service` 暴露服务 `@Reference` 引用服务
- 保留 `dubbo`的`xml`配置文件 使用`@ImportResource`导入`dubbo`的配置文件
- 使用注解 `api`方式 将每一个组件手动创建到容器中
