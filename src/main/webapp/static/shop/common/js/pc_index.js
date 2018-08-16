         $.ajax({
             type: "POST",
             headers: {
                 cdutb2p_shop_token: GLOBAL_TOKEN
             },
             url: getPath() + "/shop/user/info",
             data: {},
             dataType: "json",
             success: function(data){  
                         if(data['success']){
							
							layer.alert(data['msg']);
						
							
						 }else{
						    layer.alert(data['msg']);
						 }
                      },
					  
             error: function(data){  
                        layer.alert('系统错误');
                      }
         });