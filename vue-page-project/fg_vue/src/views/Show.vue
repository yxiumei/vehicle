<template>
  <div>
    进入地图展示页面
    <div class="contentClass">
      <BaiduMapCom/>
    </div>
  </div>
</template>
<script>
import BaiduMapCom from '@/components/baiduMap.vue'
export default {
  data () {
    return {}
  },
  components: {
    BaiduMapCom
  }
}
</script>

<style scoped lang='less'>
.contentClass{
  display: flex;
  justify-content: space-around;
  margin-top: 10%;
}
</style>
