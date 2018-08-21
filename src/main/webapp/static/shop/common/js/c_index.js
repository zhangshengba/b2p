$.ajax({
	type:"POST",
	headers: {
        cdutb2p_shop_token: GLOBAL_TOKEN
    },
    dataType: "json",
    url:"/b2p/shop/customerCenter/myInfo",
    data: {},
    success:function(data){
		if(GLOBAL_TOKEN == ""){
			window.location.href="./login.html";
		}
    	if(data.model.Customer.userNickname!=null||data.model.Customer.userNickname!=""){
    		$("#userNameOne").html(data.model.Customer.userNickname);
    	}
    },
    error:function(data){
    	alert("发生错误");
    }
});
function myCollection(){
	$("#menu7").removeClass();
	$("#menu8").removeClass();
	$("#menu3").addClass("li-selected");
	//
	$("#order").hide();
	$("#c_message").hide();
	$("#collection").css("display","block");
}
function myOrder(){
	$("#menu3").removeClass();
	$("#menu8").removeClass();
	$("#menu7").addClass("li-selected");
	//
	$("#collection").hide();
	$("#c_message").hide();
	$("#order").css("display","block");
}
function customerMessage(){
	$("#menu3").removeClass();
	$("#menu7").removeClass();
	$("#menu8").addClass("li-selected");
	//
	$("#order").hide();
	$("#collection").hide();
	$("#c_message").css("display","block");
}