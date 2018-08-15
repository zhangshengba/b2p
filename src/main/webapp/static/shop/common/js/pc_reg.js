$.validator.setDefaults({
    submitHandler: function() {
      //alert("提交事件!");
    },
	errorPlacement: function(error, element) { 
	    for(var i= 0;i<element.length;i++){
			if(element[i].id == "emailUser"){
				$('#emailTip').html(error);
			}else if(element[i].id == "emailcodeUser"){
				$('#emailcodeTip').html(error);
			}else if(element[i].id == "mobileUser"){
				$('#mobileTip').html(error);
			}else if(element[i].id == "usernameUser"){
				$('#usernameTip').html(error);
			}else if(element[i].id == "passwordUser"){
				$('#passwordTip').html(error);
			}else if(element[i].id == "repasswordUser"){
				$('#repasswordTip').html(error);
			}
		}
    }
});
$().ready(function() {
    $("#submitForm_new").validate();
});