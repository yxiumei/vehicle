<template>
  <div id="baiduMapContainerId"></div>
</template>

<script>
import baiduMap from '@/util/baiduMap.js'
export default {
  mounted () {
    baiduMap.initFun(this.id)
  },
  data () {
    return {
      id: 'baiduMapContainerId'
    }
  }
}
</script>

<style scoped lang='less'>
#baiduMapContainerId{
  width: 80%;
  height: 50vh;
}
/* 屏蔽百度左下角的图标信息 | vue 里面加了scoped属性代表只在当前组件有效, :deep代表允许在子组件内载入此样式 */
#baiduMapContainerId :deep(.BMap_cpyCtrl)  {
    display: none;
}
#baiduMapContainerId :deep(.anchorBL) {
    display: none;
}
</style>
