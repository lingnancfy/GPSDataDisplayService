# dataDisplayService

#### 项目介绍
本项目为汽车GPS数据的显示而设置，主要用于测试前端页面

#### 软件架构
使用基于xml配置的springMVC配合mybatis-spring来查询数据，暂时没有加入dubbo，以简化测试过程。


#### 安装教程

1. Tomcat7.0.9
2. spring 4.3.18
3. 服务器端mysql（可以在properties文件中修改）  
4. 数据库iotdb  
5. gpsdata数据表  

#### 使用说明

1. 下载本项目到本地的时候应该注意，将src/main/java文件夹mark成源路径；
2. 因为git无法上传空目录，为了设计的需要，在某些空目录下放置了.gitignore文件；
3. 暂时只能在localhost:8080页面显示数据库上的数据。
