window.onload = function(){

    var btnNext = document.querySelector('.button_forward');
    var btnBack = document.querySelector('.button_back');
    var images = document.querySelector('.slider').children;
    //var images = document.querySelectorAll('.slider img');
    
    var i = 0;
    
    function next(){
        images[i].style.display = 'none';
        i++;
        
        if(i == images.length)  
            i = 0;
        
        images[i].style.display = 'block';
    }  
    
    function prev(){
        images[i].style.display = 'none';
        i++;
        
        if(i == images.length)  
            i = 0;
        
        images[i].style.display = 'block';
    } 
    
    btnNext.onclick = next;   
    btnBack.onclick = prev;
    // setInterval(next, 3000);
}
