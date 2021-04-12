// JavaScript Document
var ul_img = document.getElementById("ul_img");
var tubiao = document.getElementById("tubiao");
var a = tubiao.getElementsByTagName("a");
var span = ul_img.getElementsByTagName("span");

for(let i=0;i<=a.length-1;i++){
    a[i].onmouseover=function(){
		for(var y=0;y<=a.length-1;y++){
			a[y].className="";/*这里不能用this，因为隔了一个for循环*/
			span[y].className="";
		}/*清除多余变色*/
		this.className="bianse";
		
		var index=this.getAttribute("index");
		span[index].className="ziti2";
		ul_img.style.marginTop =-600*index + "px";/*不能用i，循环执行的很快，直接执行四次*/
	}

}

let i = 1;
var fun1=function() {
	for (var y = 0; y <= a.length - 1; y++) {
		a[y].className = "";/*这里不能用this，因为隔了一个for循环*/
		span[y].className = "";
	}/*清除多余变色*/
	a[i].className = "bianse";
	span[i].className = "ziti2";
	ul_img.style.marginTop = -600 * i + "px";/*不能用i，循环执行的很快，直接执行四次*/
	ul_img.style.transition = 0.5+"s";
	i = i + 1;
	if (i == 3) {
		i = 0;
	}
}
var timer = setInterval(fun1,10000);

