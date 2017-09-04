window.onload = function(){
	
	function print_object(obj){
		var res = '<ul>';
		
		for(i in obj)
			res += '<li><b>' + i + '</b>: ' + obj[i] + '</li>';
			
		res += '</ul>';
		document.write(res);
	}
	
	var div1 = document.body.children[0];
	div1.style.color = 'red';
	div1.style.fontSize = '30px';
	print_object(div1.style);
}