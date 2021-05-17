<template>
  <div>
    <h1>登录主界面</h1>
    <div>
      <el-button @click="toShowPageFun" type="success">登录</el-button>
    </div>
  </div>
</template>

<script>
export default {
  data () {
    return {}
  },
  methods: {
    toShowPageFun () {
      this.$router.push('/show')
    }
  }
}
</script>

<!-- 添加"scoped" 属性限制css样式只属于当前组件 -->
<style scoped lang="less">

</style>
