export default {
  initFun (id) {
    // 提示: 这个BMap对象在 package.json 中的 eslintConfig.globals 属性中有配置, 标记为外部对象, 所以可以随时使用
    // 提示: script脚本引入在public/index.html里面使用脚本方式引入, vue3的对应百度地图组件在npm网站中没有找到, 大部分都是vue2的组件,所以暂时使用脚本引入方式
    // 创建地图实例
    const map = new BMap.Map(id)
    // 创建点坐标
    const point = new BMap.Point(116.404, 39.915)
    // 初始化地图，设置中心点坐标和地图级别
    map.centerAndZoom(point, 15)
  }
}
