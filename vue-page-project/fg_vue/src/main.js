import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import ElementPlus from 'element-plus'
import 'element-plus/lib/theme-chalk/index.css'
import 'dayjs/locale/zh-cn'
import locale from 'element-plus/lib/locale/lang/zh-cn'

const app = createApp(App)
app.use(store)
app.use(router)
app.use(ElementPlus, { locale })
// ak: 'YfX1BIGUyla2g1iStyrAZy36Ss9xX4SL'
app.mount('#app')
