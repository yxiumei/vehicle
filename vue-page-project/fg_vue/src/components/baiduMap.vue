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
</style>
