
function checkNhomUCName(bienThis){
	var dem = 0;
	var value = $(bienThis).val();
	 $('.nhomUCName').each(function(){
		 if(value != null && value == $(this).val()){
			 dem++;
			 if(dem > 1){
				alert('Tên nhóm Use-case đã tồn tại.');
    			$(bienThis).focus();
			 }
		 }
	 }); 
}
