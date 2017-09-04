window.onload = function(){
	
	// получение элемента по id
	/* var div1 = document.getElementById('first');
	
	div1.onclick = function(){
		//div1.style.color = 'red';
		this.style.color = 'red';
	} */
	
	// получение элементов по классу
	/*var divs = document.getElementsByClassName('item');
	
	for(var i = 0; i < divs.length; i++){
		divs[i].onclick = function(){
			this.style.color = 'red';
		}
	}  */
	
	// получение элементов по тегу
	/*var ps = document.getElementsByTagName('p');
	
	for(var i = 0; i < ps.length; i++){
		ps[i].onclick = function(){
			this.style.color = 'red';
		}
	}  */
	
	// умный селектор
	var inner = document.querySelectorAll('.item div');
	
	for(var i = 0; i < inner.length; i++){
		inner[i].onclick = function(){
			this.style.color = 'red';
		}
	}
}