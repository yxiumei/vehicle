export default {
  initFun (id) {
    // 提示: 这个BMap对象在 package.json 中的 eslintConfig.globals 属性中有配置, 标记为外部对象, 所以可以随时使用
    // 提示: script脚本引入在public/index.html里面使用脚本方式引入, vue3的对应百度地图组件在npm网站中没有找到, 大部分都是vue2的组件,所以暂时使用脚本引入方式
    // 创建地图实例
    const map = new BMap.Map(id)
    // 创建点坐标 | 百度BD09坐标 | 其他坐标系比如GPS转换为百度坐标系: https://lbsyun.baidu.com/index.php?title=jspopular3.0/guide/coorinfo
    const point = new BMap.Point(116.404, 39.915)
    // 初始化地图，设置中心点坐标和地图级别
    map.centerAndZoom(point, 15)
    // 地图必须经过初始化才可以执行其他操作 | 初始化完毕
    // ------------------------------------
    // 测试等待2秒后移动到新的中心点 | 有效
    /*
    window.setTimeout(() => {
      map.panTo(new BMap.Point(116.409, 30.918))
    }, 2000)
    */
    map.enableScrollWheelZoom(true) // 开启鼠标滚轮缩放
    map.disableBizAuthLogo() // 关闭JSAPI商用授权挂件(好像没啥用, 还是留着吧)
    map.addControl(new BMap.NavigationControl()) // 在展示页面添加平移缩放控件
    map.addControl(new BMap.OverviewMapControl()) // 在展示页面添加缩略地图 | 默认在地图右下角有一个小箭头, 点击后才会打开隐藏的缩略图
    // 创建点
    const marker = new BMap.Marker(new BMap.Point(116.392, 39.916))
    map.addOverlay(marker) // 在中心点附近的位置加一个标记点
    // 添加折线1
    const polyline = new BMap.Polyline(
      [
        new BMap.Point(116.399, 39.910),
        new BMap.Point(116.405, 39.920)
      ],
      {
        strokeColor: 'red',
        strokeWeight: 6,
        strokeOpacity: 0.5
      }
    )
    // 添加折线2
    const polyline2 = new BMap.Polyline(
      [
        new BMap.Point(116.379, 39.910),
        new BMap.Point(116.405, 39.920)
      ],
      {
        strokeColor: 'red',
        strokeWeight: 6,
        strokeOpacity: 0.5
      }
    )
    map.addOverlay(polyline)
    map.addOverlay(polyline2)
  }
}
