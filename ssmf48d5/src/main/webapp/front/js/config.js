
var projectName = '医院医患管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '建议和注意事项',
	url: './pages/jianyihezhuyishixiang/list.html'
}, 

{
	name: '网站资讯',
	url: './pages/news/list.html'
},
{
	name: '留言反馈',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/ssmf48d5/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["新增","查看","修改","删除","打印"],"menu":"病史内容","menuJump":"列表","tableName":"bingshineirong"}],"menu":"病史内容管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"检查及结果","menuJump":"列表","tableName":"jianchajijieguo"}],"menu":"检查及结果管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"评估诊断","menuJump":"列表","tableName":"pingguzhenduan"}],"menu":"评估诊断管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"建议和注意事项","menuJump":"列表","tableName":"jianyihezhuyishixiang"}],"menu":"建议和注意事项管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"挂号收费","menuJump":"列表","tableName":"guahaoshoufei"}],"menu":"挂号收费管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"财务管理","menuJump":"列表","tableName":"caiwuguanli"}],"menu":"财务管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"药房管理","menuJump":"列表","tableName":"yaofangguanli"}],"menu":"药房管理"},{"child":[{"buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"管理员","tableName":"users"}],"menu":"管理员管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"网站资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"建议和注意事项列表","menuJump":"列表","tableName":"jianyihezhuyishixiang"}],"menu":"建议和注意事项模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"buttons":["查看","打印"],"menu":"病史内容","menuJump":"列表","tableName":"bingshineirong"}],"menu":"病史内容管理"},{"child":[{"buttons":["查看"],"menu":"检查及结果","menuJump":"列表","tableName":"jianchajijieguo"}],"menu":"检查及结果管理"},{"child":[{"buttons":["查看"],"menu":"评估诊断","menuJump":"列表","tableName":"pingguzhenduan"}],"menu":"评估诊断管理"},{"child":[{"buttons":["查看"],"menu":"建议和注意事项","menuJump":"列表","tableName":"jianyihezhuyishixiang"}],"menu":"建议和注意事项管理"},{"child":[{"buttons":["查看"],"menu":"挂号收费","menuJump":"列表","tableName":"guahaoshoufei"}],"menu":"挂号收费管理"}],"frontMenu":[{"child":[{"buttons":["查看"],"menu":"建议和注意事项列表","menuJump":"列表","tableName":"jianyihezhuyishixiang"}],"menu":"建议和注意事项模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
