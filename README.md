# spring-boot-dubbo
spring boot 与 dubbo 的三种整合方式
- 注解方式 `@EnableDubbo` 启动 `dubbo` ,@Service` 暴露服务 `@Reference` 引用服务 [spring-boot-dubbo-one](https://github.com/longfeizheng/spring-boot-dubbo/tree/spring-boot-dubbo-one)
- 保留 `dubbo`的`xml`配置文件 使用`@ImportResource`导入`dubbo`的配置文件 [spring-boot-dubbo-two](https://github.com/longfeizheng/spring-boot-dubbo/tree/spring-boot-dubbo-two)
- 使用注解 `api`方式 将每一个组件手动创建到容器中 [spring-boot-dubbo-three](https://github.com/longfeizheng/spring-boot-dubbo/tree/spring-boot-dubbo-three)


B站链接：[av47009143](https://www.bilibili.com/video/av47009143/?p=1)
