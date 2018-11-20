# ssm-druid-demo
这是一个简单的ssm整合druid的Maven项目

测试环境为jdk8、Tomcat8.5

其他的环境未测试

# ssm
spring的版本为4.2.4

mybatis的版本为3.2.5

mybatis generator位于java下的auto包中

数据库为MySQL，先要创建ssm_druid_demo数据库，然后运行DB文件夹中sql文件，即可生成需要的表和数据。

# druid
项目部署成功后，在浏览器中输入(http://localhost:8080/ssm-druid-demo/druid )即可进入druid的登录页面

默认用户为admin,密码123456，可以在web.xml中修改

连接池配置信息在jdbc-druid-config.properties和spring-mybatis.xml中

# 项目运行注意事项
* jdbc-druid-config.properties文件中默认的MySQL数据库账户：root，密码：123456，如果和您的不一样，则需要修改为对应的账号、密码。

# PS
* QQ交流群：129835664
