$(document).ready(function() {
	init();
			
});
function init(){
	var last_id=getQueryString("last_id");
	var now_id=getQueryString("now_id");
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		dataType : "json",
		url : "/b2p/shop/customerCenter/show",
		data : {
			last_id:last_id,
			now_id:now_id,
		},
		success : function(data) {
			set(data);
		},
		error : function(data) {
			alert("请登录");
		}
	});
}
function set(data){
	$("#img1").attr('src','../..'+data.model.ShopGoodsInfo1.goodsPics);
	$("#brand1").html(data.model.ShopGoodsInfo1.goodsBrand);
	$("#model1").html(data.model.ShopGoodsInfo1.goodsBrandModel);
	$("#originalPrice1").html(data.model.ShopGoodsInfo1.goodsOriginalPrice);
	$("#presentPrice1").html(data.model.ShopGoodsInfo1.goodsPresentPrice);
	$("#leve1").html(data.model.ShopGoodsInfo1.goodsOldLevel);
	$("#describe1").html(data.model.ShopGoodsInfo1.goodsDesc);
	
	$("#img2").attr('src','../..'+data.model.ShopGoodsInfo2.goodsPics);
	$("#brand2").html(data.model.ShopGoodsInfo2.goodsBrand);
	$("#model2").html(data.model.ShopGoodsInfo2.goodsBrandModel);
	$("#originalPrice2").html(data.model.ShopGoodsInfo2.goodsOriginalPrice);
	$("#presentPrice2").html(data.model.ShopGoodsInfo2.goodsPresentPrice);
	$("#leve2").html(data.model.ShopGoodsInfo2.goodsOldLevel);
	$("#describe2").html(data.model.ShopGoodsInfo2.goodsDesc);
}
function getQueryString(name) {
	var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	var r = window.location.search.substr(1).match(reg);
	if (r != null)
		return unescape(r[2]);
	return null;
}