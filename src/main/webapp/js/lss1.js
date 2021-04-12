// JavaScript Document

/**
 * 个人中心二级导航
 * @type {HTMLElement}
 */
var personalCenter = document.getElementById("personal-center");
var userType = window.localStorage.getItem("userType");
console.info(userType)
var html1 = "<li><a href=\"web_logistics_personal_car.html\">车辆管理</a></li>\n" +
    "\t\t\t\t\t<li><a href=\"web_logistics_personal_publish.html\">发布物流</a></li>\n" +
    "\t\t\t\t\t<li><a href=\"login.html\">退出登录</a></li>";
var html2 = "<li><a href=\"web_logistics_personal_car.html\">车辆管理</a></li>\n" +
    "\t\t\t\t\t<li><a href=\"web_logistics_personal_publish.html\">发布物流</a></li>\n" +
    "\t\t\t\t\t<li><a href=\"login.html\">退出登录</a></li>";
if(userType == 0){// 商品
    personalCenter.innerHTML = html1;
    console.info(userType)
}else if(userType == 1){// 物流
    personalCenter.innerHTML = html2;
    console.info(userType)
}
/**
 * 给input增加下拉省市
 * @type {HTMLElement}
 */
var search_open_select = document.getElementById("search-open-select");
window.onload = function(){
    $.ajax({
        url: "/api/v1/area/all", success: function (result) {
            if (result != null) {
                $.each(result, function (i, item) {
                    var  varItem = new Option(item.name,item.name);
                    search_open_select.options.add(varItem);
                });
            }
        }
    });
}
/**
 * 搜索栏
 * @type {HTMLCollectionOf<Element>}
 */
var search_button=document.getElementsByClassName("search-button");
var search_select_one=document.getElementById("search-select-one");
var search_select_two=document.getElementById("search-select-two");
var search_open=document.getElementById("search-open");
var search_end=document.getElementById("search-end");
const carTypeEnum = {
    '0': '半挂车',
    '1': '普通车',
    '2': '箱式车'
}
const paymentMethodEnum = {
    '0': '到付',
    '1': '押金',
    '2': '全款'
}
const goBackEnum = {
    '0': '非返程车',
    '1': '返程车',
}
const priceWayEnum = {
    '0': '元/车',
    '1': '元/立方米',
}
const whetherEnum = {
    '0': '否',
    '1': '是',
}
const statusEnum = {
    '0': '待货',
    '1': '已有货',
}
const typeEnum = {
    '0': '电询',
    '1': '不限',
}
const commodityTypeEnum = { // 货物类型
    '0': '普通用品',
    '1': '危险品',
    '2': '冷冻冷藏品',
    '3': '电器用品',
    '4': '电询'
}
const commodityStatusEnum = {
    '0': '待运',
    '1': '已运',
}
var searchData;
function on_search_button(){
    var one_value = search_select_one.value;
    var two_value = search_select_two.value;

    if(one_value == "车型" || one_value == "全部"){
        one_value = null;
    }
    if(two_value == "付款方式" || two_value == "全部"){
        two_value = null;
    }

    $.ajax({
        type: 'GET',
        url: "/api/v1/userCar/page",
        data: {
            carType:one_value,
            areaNameOriginal:search_open.value,
            areaNameDestination:search_end.value,
            paymentMethod:two_value
        },
        async: false,
        success: function (result) {
            if (result.code == 0) {
                var html = '';
                searchData = result.data;
                for (let i=0; i<result.data.length; i++){
                    var data = result.data[i];
                    var carType = carTypeEnum[data.carType];
                    var paymentMethod = paymentMethodEnum[data.paymentMethod];
                    var goBack = goBackEnum[data.goBack]; // 返程车:0否,1是
                    var priceWay = priceWayEnum[data.priceWay]; // 收费方式:0:元/车,1:元/立方米

                    html += '<div onclick="searchDataDivClick(this)" class="search-data-div"><div class="search-data-one"><h3>' +data.areaNameOriginal+ '</h3><h3>→</h3><h3>'
                         +data.areaNameDestination+ '</h3><div class="search-data-one-one"><span>' +carType+
                         '</span><span>载重：' +data.carLoad+ '吨</span><span>付款方式：' +paymentMethod+
                         '</span></div><div><h3 style="display: inline-block">' +data.companyName+
                         '</h3></div></div><div class="search-data-two"><span style="color: #0A8DA8">途经区域：'
                         +data.passArea+ '</span></div><div style="width: 200px;margin-top: 10px"><p style="text-align: center;color: #2F4F4F;margin-bottom: 10px">'
                        +goBack+ '</p><h2 style="color: red;text-align: center">' +data.price + priceWay + '</h2></div><div style="width: 180px">\n' +
                        '<h3 style="color: orange;font-family: 微軟正黑體;line-height: 100px;text-align: center">信誉通</h3></div></div>'
                }
                document.getElementById("search-data").innerHTML = html;
                // 赋值index
                let div = document.getElementsByClassName("search-data-div");
                for(let i=0; i<div.length; i++){
                    div[i].index = i;
                }
            } else {
                alert(result.msg);
            }
        },
        error: function (result) {
            console.info(result)
            //window.location.href = "error404.html";
        }
    });
}
// 点击跳转详情
function searchDataDivClick(event){
    window.localStorage.setItem("areaNameOriginal", searchData[event.index].areaNameOriginal);
    window.localStorage.setItem("areaNameDestination", searchData[event.index].areaNameDestination);
    window.localStorage.setItem("data", searchData[event.index].data);
    window.localStorage.setItem("passArea", searchData[event.index].passArea);
    window.localStorage.setItem("paymentMethod", searchData[event.index].paymentMethod);
    window.localStorage.setItem("service", searchData[event.index].service);
    window.localStorage.setItem("status", searchData[event.index].status);
    window.localStorage.setItem("goBack", searchData[event.index].goBack);
    window.localStorage.setItem("type", searchData[event.index].type);
    window.localStorage.setItem("price", searchData[event.index].price);
    window.localStorage.setItem("priceWay", searchData[event.index].priceWay);
    window.localStorage.setItem("companyName", searchData[event.index].companyName);
    window.localStorage.setItem("phone", searchData[event.index].phone);
    window.localStorage.setItem("realName", searchData[event.index].realName);
    window.localStorage.setItem("carType", searchData[event.index].carType);
    window.localStorage.setItem("carLoad", searchData[event.index].carLoad);
    window.localStorage.setItem("carBulk", searchData[event.index].carBulk);
    window.localStorage.setItem("companyAddress", searchData[event.index].companyAddress);
    window.localStorage.setItem("companyPhone", searchData[event.index].companyPhone);

    window.location.href = "web_logistics_search_detail.html"
}





//【跳转图标】
var beij_ol=document.getElementById("beij_ol");
var beij_ul=document.getElementById("beij_ul");
var cont_h1_1=document.getElementById("cont_h1_1");
var beij_a=beij_ol.getElementsByTagName("a");
var beij_p=beij_ol.getElementsByTagName("p");
for(let i=0;i<=beij_a.length-1;i++){
    beij_p[0].className="p_bs";//默认显示公司简介内容
    beij_a[i].onmouseover=function(){

//用index必须用到这个for循环，清除执行过的操作，不然会默认为执行过而不再次执行
        for(var k=0;k<=beij_a.length-1;k++){
            beij_p[k].className="";
        }
        var index=this.getAttribute("index");
        //console.info(index);
        beij_p[index].className="p_bs";
    }
    beij_a[i].onclick=function(){
        var index=this.getAttribute("index");
        beij_ul.style.marginTop =-54*index + "px";
        cont_h1_1.style.marginTop=-40*index + "px";
    }
}


//【办公环境展示】【大图】
var huanj_1=document.getElementById("huanj_1");
var huanj_p1=document.getElementById("huanj_p1");
var huanj_span=document.getElementById("huanj_span");
huanj_span.className="huanj_1_sp1";//第一张图span标签
huanj_1.onmouseover = function(){
    huanj_span.className="huanj_1_sp2";//第一张图span标签
    huanj_p1.className="huanj_p";//第一张图P标签
}
huanj_1.onmouseout = function(){
    huanj_p1.className="huanj_p_lk";//第一张图P标签
    huanj_span.className="huanj_1_sp1";//第一张图span标签
}
//【小图】
var huanj_ul=document.getElementById("huanj_ul");
var huanj_ul_a=huanj_ul.getElementsByTagName("a");
var huanj_ul_sp=huanj_ul.getElementsByTagName("span");
var huanj_ul_p=huanj_ul.getElementsByTagName("p");
for(var k=0;k<=huanj_ul_a.length-1;k++){
    huanj_ul_sp[k].className="huanj_ul_span1";
}
for(var k=0;k<=huanj_ul_a.length-1;k++){
    huanj_ul_a[k].onmouseover = function(){
        var index=this.getAttribute("index");//这里的this是在huanj_ul_a[k]上捕获的index，且index只能在该执行的标签上捕获，所以在执行相同操作时，可以设多个相同的index
        //console.info(index);
        huanj_ul_sp[index].className="huanj_ul_span2";
        huanj_ul_p[index].className="huanj_ul_p1";
    }
    huanj_ul_a[k].onmouseout = function(){
        var index=this.getAttribute("index");
        huanj_ul_sp[index].className="huanj_ul_span1";
        huanj_ul_p[index].className="huanj_ul_p2";
    }
}













