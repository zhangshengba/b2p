$.validator.setDefaults({
    submitHandler: function() {
	  $.ajax({
             type: "POST",
             url: "./shop/reg",
             data: {username:$("#username").val(), password:$("#password").val()},
             dataType: "json",
             success: function(data){  
                         alert()
                      },
					  
             error: function(data){  
                         alert()
                      }
         });
	  
	  
	  
	  
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