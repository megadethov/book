window.onload = function(){
	
	function print_object(obj){
		var res = '<ol>';
		
        for(i in obj)
			res += '<li><b>' + i + '</b>: ' + obj[i] + '</li>';
			
		res += '</ol>';
		document.write(res);
	}
	
	var div1 = document.body.children[0];
	print_object(div1.style);
}

