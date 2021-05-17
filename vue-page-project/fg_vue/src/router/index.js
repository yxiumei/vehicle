import { createRouter, createWebHashHistory } from 'vue-router'
import Home from '../views/Home.vue'
import Show from '../views/Show.vue'

const routes = [
  {
    path: '/',
    component: Home
  }, {
    path: '/show',
    component: Show
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
