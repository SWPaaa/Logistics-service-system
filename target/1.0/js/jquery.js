// JavaScript Document
/*$(document).ready(function(e){
	$(".nav_ul>li").hover(function(){
		$(this).children(".submenu").show();
	},function(){
		$(this).children(".submenu").hide();
	});
});*/

//【这种方式很单一，要给li一个class】
/*$(document).ready(function(){
	qza();
});
function qza(){
	$(".qq").hover(function(){
		$(".submenu").show();
	},function(){
		$(".submenu").hide();
	});
}*/

/*$(document).ready(function(){
	$(".nav_ul>li").hover(function(){
		$(this).children(".submenu").fadeIn();
	},function(){//fadein渐入，淡入。fadeout淡出
		$(this).children(".submenu").fadeOut();
	});
});*/

$(document).ready(function(){
	$(".nav_ul>li").hover(function(){
		$(this).children(".nav_erji").slideDown();
	},function(){
		$(this).children(".nav_erji").slideUp();
	});
});
