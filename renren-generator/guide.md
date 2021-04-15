# 代码生成器使用指南
### 配置文件修改
#### application.yml文件内容修改
``` yaml
# mysql
spring:
  datasource:
    type: com.alibaba.druid.pool.DruidDataSource
    #MySQL配置
    driverClassName: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://数据库ip:3306/数据库?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai
    username: 数据库用户名
    password: 数据库密码
```

#### generator.properties 配置文件修改
``` properties
#主路径 
mainPath=com.learn.project.mall  
#包名 生成后文件防止的包名
package=com.learn.project.mall 
#模块名称 生成文件会放在 com.learn.project.mall.模块名称包下
moduleName=product
#作者
author=chenfuyuan
#Email
email=chenfuyuan0713@163.com
#表前缀(类名不会包含表前缀)
tablePrefix=pms_
```