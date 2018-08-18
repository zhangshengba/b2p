var path = getRealPath();
var token = GLOBAL_TOKEN;
var from_id;
var from_name;
var from_img;
var to_id;
var to_name;
var to_img;	
var msg_map = {};
var img_map = {};
var name_map = {};

var websocket;
websocket = new SockJS(path + "/sockjs/chat?token="+token);

websocket.onopen = function(event) {
		
};
websocket.onmessage = function(event) {
	var data=JSON.parse(event.data);
	if(data != null){
		openOChat(data['from_id'],data['from_name'],data['from_img']);
	}	
};
websocket.onerror = function(event) {
		
};
websocket.onclose = function(event) {
		
}

function send_msg_to_server(msg,to_id,type){
	rs = {};
	rs['to_id'] = to_id;
	rs['msg'] = msg;
	rs['type'] = type;
	websocket.send(JSON.stringify(rs));
}


function renderChat(id){
	$(".chat-list-people").each(function () {
		if(this['id'] == "chat-list-" + id){
			//$(".chatBox").toggle(10);
			$(this).click(function () {
				var n = $(this).index();
				if(id == null){
					return;
				}
			    data = msg_map[id];
				to_id = id;
				$('.chatBox-content-demo').html(data);
				
				$(".chatBox-head-one").toggle();
				$(".chatBox-head-two").toggle();
				$(".chatBox-list").fadeToggle();
				$(".chatBox-kuang").fadeToggle();
				$(".ChatInfoName").text($(this).children(".chat-name").children("p").eq(0).html());
				$(".ChatInfoHead>img").attr("src", $(this).children().eq(0).children("img").attr("src"));
				$(document).ready(function () {
					$("#chatBox-content-demo").scrollTop($("#chatBox-content-demo")[0].scrollHeight);
				});
			});
	}});
}
	
function openChat(seller_id,seller_nickname,seller_img){
	console.log(seller_id+seller_nickname+seller_img);
	to_id = seller_id;
	to_name = seller_nickname;
	to_img = seller_img;
	if(msg_map[seller_id] != null){
		$(".chatBox").toggle(10);
		return;
	}
	msg_map[seller_id] = "";
	img_map[seller_id] = seller_img;
	name_map[seller_id] = seller_nickname;
	$(".chatBox").toggle(10);
	$('#chat_user_img').attr("src",getRealPath() + from_img);
	$('#chat_user_name').html(from_name);
	html = "";
	html += "<div class=\"chat-list-people\" id=\"chat-list-"+seller_id+"\">";
    html += "<div><img src=\""+getRealPath()+seller_img+"\" alt=\"头像\"/></div>";
    html += "<div class=\"chat-name\">";
    html += "<p>"+seller_nickname+"</p>";
    html += "</div>";
    html += " <div class=\"message-num\">0</div>";
    html += "</div>";
	$('.chatBox-list').prepend(html);
	
	html = "";
	html += "<div class=\"chatBox-content-demo\" id=\"chatBox-content-demo\"></div>";
	$('.chatBox-content').append(html);
	renderChat(seller_id);

}
function openOChat(from_id,from_name,from_img){
	to_id = from_id;
	to_name = from_name;
	to_img = from_img;
	if(msg_map[from_id] != null){
		if($(".chatBox").is(':hidden')){
			$(".chatBox").toggle(10);
		}
		return;
	}
	msg_map[from_id] = "";
	img_map[from_id] = from_img;
	name_map[from_id] = from_name;
	$('#chat_user_img').attr("src",getRealPath() + from_img);
	$('#chat_user_name').html(from_name);
	html = "";
	html += "<div class=\"chat-list-people\" id=\"chat-list-"+from_id+"\">";
    html += "<div><img src=\""+getRealPath()+from_img+"\" alt=\"头像\"/></div>";
    html += "<div class=\"chat-name\">";
    html += "<p>"+from_name+"</p>";
    html += "</div>";
    html += " <div class=\"message-num\">0</div>";
    html += "</div>";
	$('.chatBox-list').prepend(html);
	
	html = "";
	html += "<div class=\"chatBox-content-demo\" id=\"chatBox-content-demo\"></div>";
	$('.chatBox-content').append(html);
	if($(".chatBox").is(':hidden')){
		$(".chatBox").toggle(10);
	}
	renderChat(from_id);

}

function renderChatList(data){
	for(var i in data){
		to_id = data[i]['to_id'];
		to_img = data[i]['to_img'];
		to_name = data[i]['to_name']
		
		if(msg_map[to_id] != null){
			if($(".chatBox").is(':hidden')){
				$(".chatBox").toggle(10);
			}
			return;
		}
		msg_map[to_id] = "";
		img_map[to_id] = to_img;
		name_map[to_id] = to_name;
		$('#chat_user_img').attr("src",getRealPath() + to_img);
		$('#chat_user_name').html(to_name);
		html = "";
		html += "<div class=\"chat-list-people\" id=\"chat-list-"+to_id+"\">";
		html += "<div><img src=\""+getRealPath()+to_img+"\" alt=\"头像\"/></div>";
		html += "<div class=\"chat-name\">";
		html += "<p>"+to_name+"</p>";
		html += "</div>";
		html += " <div class=\"message-num\">0</div>";
		html += "</div>";
		$('.chatBox-list').prepend(html);
	
		html = "";
		html += "<div class=\"chatBox-content-demo\" id=\"chatBox-content-demo\"></div>";
		$('.chatBox-content').append(html);
		if($(".chatBox").is(':hidden')){
			$(".chatBox").toggle(10);
		}
		renderChat(to_id);
	}
}

function getMsgList(){
	$.ajax({
		type : "POST",
		headers : {
			cdutb2p_shop_token : GLOBAL_TOKEN
		},
		url : getPath() + "/shop/chat/message/list",
		data : {},
		dataType : "json",
		success : function(data) {
			if (data['success']) {
				renderChatList(data['data']);
			}
		},
		error : function(data) {
			layer.alert('系统错误');
		}

	});
	
}

var formatDateTime = function (date) {
    var y = date.getFullYear();
    var m = date.getMonth() + 1;
    m = m < 10 ? ('0' + m) : m;
    var d = date.getDate();
    d = d < 10 ? ('0' + d) : d;
    var h = date.getHours();
    h=h < 10 ? ('0' + h) : h;
    var minute = date.getMinutes();
    minute = minute < 10 ? ('0' + minute) : minute;
    var second=date.getSeconds();
    second=second < 10 ? ('0' + second) : second;
	return y + '-' + m + '-' + d+' '+h+':'+minute+':'+second;
}

	