const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmf48d5/",
            name: "ssmf48d5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmf48d5/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "医院医患管理系统"
        } 
    }
}
export default base
