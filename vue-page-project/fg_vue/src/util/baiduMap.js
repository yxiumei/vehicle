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
    // --------------------------------------------------------------------------------- 每一条这种线的中间都代表着里面的代码可以复用
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
    // ---------------------------------------------------------------------------------
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
    // ---------------------------------------------------------------------------------
    // 初始化的时候给定图片总展示大小
    const myIcon = new BMap.Icon('/imgs/markers.jpeg', new BMap.Size(250, 200), {
      // 指定图片左上角与定位点之间的偏移距离
      anchor: new BMap.Size(130, 225),
      // 设置图片偏移即从一幅较大的图片中截取某部分作为标注图标
      imageOffset: new BMap.Size(-100, -150) // 设置图片偏移
    })
    // 创建标注对象同时设定定位点
    const carMarker = new BMap.Marker(new BMap.Point(116.372, 39.910), {
      icon: myIcon
    })
    map.addOverlay(carMarker) // 添加图片测试成功
    carMarker.addEventListener('click', () => {
      alert('您点击了图片标注')
    })
    // ----------------------------------------------------------------------------------
    // 全局点击事件 | 用户随机选择目的地坐标 | 中心点即用户坐标
    map.addEventListener('click', (e) => {
      const center = map.getCenter()
      console.log('地图中心点变更为：' + center.lng + ', ' + center.lat)
      console.log('您点击了地图', e.point.lng + ', ' + e.point.lat, '地图缩放至：' + map.getZoom() + '级')
    })
    // 点击事件测试成功
    // ----------------------------------------------------------------------------------
    // 每过一秒就重新设置点的位置 | Marker类定义说明: https://lbsyun.baidu.com/cms/jsapi/reference/jsapi_reference_3_0.html#a3b2
    let r = 116.372
    setInterval(() => {
      r = r - 0.0001
      if (r < 116.340) {
        r = 116.447
      }
      // console.log(r)
      carMarker.setPosition(new BMap.Point(r, 39.910))
    }, 10)
  }
}
