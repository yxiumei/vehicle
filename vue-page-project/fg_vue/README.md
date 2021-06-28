# 前端项目名称 fg_vue

## 安装项目全部依赖的命令
```
npm install
```

### 根据依赖编译项目并启动热部署, 默认访问 8080 端口
```
npm run serve
```

### 构建产品级
```
npm run build
```

### 检测文件是否有格式上的错误等(这个命令基本不用)
```
npm run lint
```

### 其他配置
详见 [vue cli 配置文档](https://cli.vuejs.org/config/).

### 百度地图引入信息说明
在public/index.html文件内引入了百度地图js API V3
文档地址: https://lbsyun.baidu.com/index.php?title=jspopular3.0
仅供测试, 后期上线后停用此公开ak信息

文档对应的实例代码: https://lbsyun.baidu.com/jsdemo.htm#aCreateMap 
实例中的代码都是GL版本, 也就是3D视角下的, 为了简化开发, 本次仅使用二维平面地图. 实例代码中的GL删除后就是二维的调用代码
var marker = new BMapGL.Marker(new BMapGL.Point(116.404, 39.915))  no
var marker = new BMap.Marker(new BMap.Point(116.404, 39.915))      yes

