import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import SPIndex from "../views/SPIndex.vue";
import EleTest from "../views/EleTest";

Vue.use(Router)

export default new Router({
  routes: [
      {
          path: '/',
          name: 'HelloWorld',
          component: HelloWorld
      },
      {
          path: '/index',
          component: SPIndex
      },
      {
          path: '/test',
          component: EleTest
      }
  ]
})
