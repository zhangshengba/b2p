$.validator.setDefaults({
    submitHandler: function() {
         $.ajax({
             type: "POST",
             url: "./shop/login",
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
			if(element[i].id == "usernameUser"){
				$('#usernameTip').html(error);
			}else if(element[i].id == "passwordUser"){
				$('#passwordTip').html(error);
			}
		}
        
    }
});
$().ready(function() {
    $("#submitForm_new").validate();
});

// layer.open({
  // type: 1,
  // title: false,
  // closeBtn: 0,
  // shadeClose: true,
  // area: ['666px', '333px'], //宽高
  // content: $('#regValidcodeBox').html()
// });