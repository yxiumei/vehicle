# 车联网，路线规划
+ vehicle-admin: 运营后台
+ vehicle-center: 核心业务
+ vehicle-domain: 领域模型(表结构等)
+ vehicle-web: C端web层
+ vehicle-api: 可以对外暴露的服务api(在使用fegin时,本质上也是一个rest服务)  
+ nacos: nacos本地后台服务
+ other: 其他信息(mysql数据库表结构)

# 依赖关系、操作说明
+ vehicle-api 模块 vehicle-admin、vehicle-web、vehicle-center可依赖
+ vehicle-api 使用对外是通过fegin暴露服务，可提供给vehicle-admin、vehicle-web操作
+ 登录鉴权信息可以直接在vehicle-admin、vehicle-web控制，vehicle-center可以不需要

# 涉及技术
 + SpringBoot 底层平台
 + SpringCloud(alibaba) 微服务
 + openFeign 微服务调用技术
 + Nacos 服务发现配置管理
 + Mysql 数据库
 + MybatisPlus 半自动ORM
 + Swagger 后台接口自动生成
 + sa-token 安全管理