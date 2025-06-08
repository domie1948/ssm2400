import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import news from '@/views/modules/news/list'
    import guahaoshoufei from '@/views/modules/guahaoshoufei/list'
    import pingguzhenduan from '@/views/modules/pingguzhenduan/list'
    import yonghu from '@/views/modules/yonghu/list'
    import messages from '@/views/modules/messages/list'
    import jianyihezhuyishixiang from '@/views/modules/jianyihezhuyishixiang/list'
    import bingshineirong from '@/views/modules/bingshineirong/list'
    import caiwuguanli from '@/views/modules/caiwuguanli/list'
    import config from '@/views/modules/config/list'
    import yaofangguanli from '@/views/modules/yaofangguanli/list'
    import users from '@/views/modules/users/list'
    import jianchajijieguo from '@/views/modules/jianchajijieguo/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
          ,{
	path: '/news',
        name: '网站资讯',
        component: news
      }
          ,{
	path: '/guahaoshoufei',
        name: '挂号收费',
        component: guahaoshoufei
      }
          ,{
	path: '/pingguzhenduan',
        name: '评估诊断',
        component: pingguzhenduan
      }
          ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
          ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
          ,{
	path: '/jianyihezhuyishixiang',
        name: '建议和注意事项',
        component: jianyihezhuyishixiang
      }
          ,{
	path: '/bingshineirong',
        name: '病史内容',
        component: bingshineirong
      }
          ,{
	path: '/caiwuguanli',
        name: '财务管理',
        component: caiwuguanli
      }
          ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
          ,{
	path: '/yaofangguanli',
        name: '药房管理',
        component: yaofangguanli
      }
          ,{
	path: '/users',
        name: '管理员',
        component: users
      }
          ,{
	path: '/jianchajijieguo',
        name: '检查及结果',
        component: jianchajijieguo
      }
        ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
