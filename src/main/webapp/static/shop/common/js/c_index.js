function myCollection(){
	$("#menu7").removeClass();
	$("#menu8").removeClass();
	$("#menu4").removeClass();
	$("#menu3").addClass("li-selected");
	//
	$("#order").hide();
	$("#c_message").hide();
	$("#cart").hide();
	$("#collection").css("display","block");
}
function myCart(){
	$("#menu7").removeClass();
	$("#menu8").removeClass();
	$("#menu3").removeClass();
	$("#menu4").addClass("li-selected");
	$("#order").hide();
	$("#c_message").hide();
	$("#collection").hide();
	$("#cart").css("display","block");
}

function myOrder(){
	$("#menu3").removeClass();
	$("#menu8").removeClass();
	$("#menu4").removeClass();
	$("#menu7").addClass("li-selected");
	//
	$("#collection").hide();
	$("#c_message").hide();
	$("#cart").hide();
	$("#order").css("display","block");
}
function customerMessage(){
	$("#menu3").removeClass();
	$("#menu7").removeClass();
	$("#menu4").removeClass();
	$("#menu8").addClass("li-selected");
	//
	$("#order").hide();
	$("#collection").hide();
	$("#cart").hide();
	$("#c_message").css("display","block");
}