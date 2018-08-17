var phoneid = "";
function genUserInfo() {
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/user/islogin",
		data : {},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				$('#login').hide();
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
}
function genSearch() {
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/goods/area",
		data : {},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				renderSearch(data['data']);
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
}
function renderSearch(data) {
	one = []
	two = []
	three = []
	four = []
	for ( var a in data) {
		one.push(data[a])
		for ( var b in data[a]['children']) {
			two.push(data[a]['children'][b]);
			for ( var c in data[a]['children'][b]['children']) {
				three.push(data[a]['children'][b]['children'][c]);
				for ( var d in data[a]['children'][b]['children'][c]['children']) {
					four
							.push(data[a]['children'][b]['children'][c]['children'][d]);
				}
			}
		}
	}
	html = ""
	for ( var i in two) {
		html += "<a href=\"#\">" + two[i]['areaName'] + "</a>";
	}
	$('#searchtwo').html($('#searchtwo').html() + html);
	html = ""
	for ( var j in three) {
		html += "<a href=\"#\">" + three[j]['areaName'] + "</a>";
	}
	$('#searchthree').html($('#searchthree').html() + html);
	html = ""
	for ( var k in four) {
		html += "<a href=\"#\">" + four[k]['areaName'] + "</a>";
	}
	$('#searchfour').html($('#searchfour').html() + html);

}

function genBrand() {
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/goods/brand",
		data : {
			type : "phone_brand"
		},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				renderBrand(data['data']);
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
}
function renderBrand(data) {
	one = []
	for ( var a in data) {
		one.push(data[a])
	}
	html = ""
	for ( var i in one) {
		html += "<a href=\"#\">" + one[i]['dictLabel'] + "</a>";
	}
	$('#searchbrand').html($('#searchbrand').html() + html);

}

function initGoods(type, pageNum, pageSize) {
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/goods/list",
		data : {
			type : type,
			pageNum : pageNum,
			pageSize : pageSize,
		},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				renderInitGoods(data['data']);
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
}

function renderInitGoods(data) {

	html = ""
	html1 = ""
	var page_navi_nums = data['pages'] < 12 ? data['pages'] : 12;

	data = data['list'];
	for (var i = 0; i < data.length; i++) {
		if (data[i]['goodsStatus'] == "2") {
			html += "<tr class=\"zzinfo\">";
			html += "<td class=\"img\">";
			html += "<a href=\"#\">";
			html += "<img lazy_src=\"#\" src=\"" + getPath()
					+ data[i]['goodsPics']
					+ "\" style=\"top: 0px; left: 0px;\" />";
			html += "</a>";
			html += "</td>";
			html += "<td class=\"t\">";
			html += "<a href=\"goods.html?goods_id=" + data[i]['id']
					+ "\" class=\"t\">" + data[i]['goodsTitle'];
			html += "<spanclass=\"zhiding_icon\">顶</span></a> <i class=\"clear\"></i> ";
			html += "<span class=\"pricebiao\">￥<span class=\"price\">"
					+ data[i]['goodsPresentPrice'] + "</span></span>";
			html += "<i class=\"clear\"></i> ";
			html += "<div class=\"quot\"></div> <span class=\"desc\">"
					+ data[i]['goodsDesc'] + "</span>";
			html += "<span class=\"fl\"> ";
			html += "<span>" + data[i]['goodsCity']
					+ "</span><span>- </span><span>" + data[i]['goodsArea']
					+ "</span>";
			html += "</span> <i class=\"clear\"></i>";
			html += "</td>";
			html += "<td></td>";
			html += "<td class=\"tc\">";
			html += "<div class=\"qq_attest\">";
			html += "<p class=\"img_attest\">";
			html += "<img lazy_src=\"\" src=\"" + getPath()
					+ data[i]['goodsSellerPics'] + "\" />";
			html += "</p>";
			html += "<p class=\"name_add\">" + data[i]['goodsSellerNickname']
					+ "</p>";
			html += "<p class=\"zhijian\"></p></div>";
			html += "</td>";
			html += "<td></td>";
			html += "</tr>";

		} else if (data[i]['goodsStatus'] == "0") {
			html1 += "<tr class=\"zzinfo\">";
			html1 += "<td class=\"img\">";
			html1 += "<a href=\"#\">";
			html1 += "<img lazy_src=\"#\" src=\"" + getPath()
					+ data[i]['goodsPics']
					+ "\" style=\"top: 0px; left: 0px;\" />";
			html1 += "</a>";
			html1 += "</td>";
			html1 += "<td class=\"t\">";
			html1 += "<a href=\"goods.html?goods_id=" + data[i]['id']
					+ "\" class=\"t\">" + data[i]['goodsTitle'];
			html1 += "</a> <i class=\"clear\"></i> ";
			html1 += "<span class=\"pricebiao\">￥<span class=\"price\">"
					+ data[i]['goodsPresentPrice'] + "</span></span>";
			html1 += "<i class=\"clear\"></i> ";
			html1 += "<div class=\"quot\"></div> <span class=\"desc\">"
					+ data[i]['goodsDesc'] + "</span>";
			html1 += "<span class=\"fl\"> ";
			html1 += "<span>" + data[i]['goodsCity']
					+ "</span><span>- </span><span>" + data[i]['goodsArea']
					+ "</span>";
			html1 += "</span> <i class=\"clear\"></i>";
			html1 += "</td>";
			html1 += "<td></td>";
			html1 += "<td class=\"tc\">";
			html1 += "<div class=\"qq_attest\">";
			html1 += "<p class=\"img_attest\">";
			html1 += "<img lazy_src=\"\" src=\"" + getPath()
					+ data[i]['goodsSellerPics'] + "\" />";
			html1 += "</p>";
			html1 += "<p class=\"name_add\">" + data[i]['goodsSellerNickname']
					+ "</p>";
			html1 += "<p class=\"zhijian\"></p></div>";
			html1 += "</td>";
			html1 += "<td></td>";
			html1 += "</tr>";
		}
	}
	$('#toptbody').append(html);
	$('#tbodt').append(html1);
}

function selectGoods(type, brand, min_price, max_price, area, pageNum, pageSize) {
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/goods/list",
		data : {
			type : type,
			brand : brand,
			min_price : min_price,
			max_price : max_price,
			area : area,
			pageNum : pageNum,
			pageSize : pageSize
		},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				renderGoods(data['data']);
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
}

function renderGoods(data) {
	html = ""
	if (data['pageNum'] < data['pages']) {

	}
	$('#searchbrand').html($('#searchbrand').html() + html);
}
$(document).ready(function() {
	genUserInfo();
	genSearch();
	genBrand();

	initGoods("phone", 1, 30);
});