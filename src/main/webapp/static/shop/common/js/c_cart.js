$.ajax({
	type : "POST",
	headers : {
		cdutb2p_shop_token : GLOBAL_TOKEN
	},
	dataType : "json",
	url : "/b2p/shop/customerCenter/selectMyCart",
	data : {},
	success : function(data) {
		$.each(data.model.CartList, function(index, item) {
				
			$("#tbody").append('<tr>' +
					'<td><input name="checkbox" type="checkbox" /></td>' +
					'<td>'+item.remarks+'</td>'+
					'<td>'+item.createDate+'</td>'+ 
					'<td>'+item.createBy+'</td>'+
					'<td><input type="hidden" id="id'+index+'" value='+item.id+'>'+
					'<td><button>已读</button></td>'+
				    '</tr>');
		});
		$("#tbody").append('<tr>' +
				'<td><input type="checkbox" name="answer" onclick="checkAll(this)"/>全选<td>'+
				'<td><input type="button" onclick="isCheck()" value="删除">'+
				'</tr>');
	},
	error : function(data) {
		alert("请登录");
	}
});