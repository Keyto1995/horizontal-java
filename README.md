# horizontal-java

一个用来表现Java在后台开发中效果的项目

## 环境

- jdk 17
- gradle

## 安装

```bash
$ ./gradlew build
```

## 启动

```bash
$ cd build/libs
# dev
$ java -jar horizontal-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev

# prod
$ java -jar horizontal-0.0.1-SNAPSHOT.jar --spring.profiles.active=prod
```
