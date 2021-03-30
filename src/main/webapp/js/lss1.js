// JavaScript Document
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
                console.info(result)
                console.info(result.data)
            } else {
                alert(result.msg);
            }
        },
        error: function (result) {
            console.info(result)
            //window.location.href = "error404.jsp";
        }
    });
}



//【跳转图标】
var beij_ol=document.getElementById("beij_ol");
var beij_ul=document.getElementById("beij_ul");
var cont_h1_1=document.getElementById("cont_h1_1");
var beij_a=beij_ol.getElementsByTagName("a");
var beij_p=beij_ol.getElementsByTagName("p");
for(var i=0;i<=beij_a.length-1;i++){
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


//【微信，QQ，支付宝】
var  weixin1=document.getElementById("weixin1");
var  weixin2=document.getElementById("weixin2");
weixin1.onmouseover = function(){
    weixin2.style.display="block";
}
weixin1.onmouseout = function(){
    weixin2.style.display="none";
}

var  shanchu=document.getElementById("shanchu");
var  rem=document.getElementById("rem");
var  rem0=document.getElementById("rem0");
var  saoma=document.getElementById("saoma");
var  shanchu2=document.getElementById("shanchu2");
rem.onclick = function(){//点击红包
    saoma.className="saoma saoma2";
    rem.style.display="none";
}
shanchu2.onclick = function(){//点击扫码关闭键
    saoma.className="saoma";
    rem.style.display="block";
}
shanchu.onclick = function(){//点击红包关闭键
    rem0.removeChild(rem);
    saoma.style.display="none";
}





















