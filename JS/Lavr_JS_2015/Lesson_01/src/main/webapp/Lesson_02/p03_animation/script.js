window.onload = function(){
    var some = document.querySelector('#some');
    var stop = document.querySelector('#stop');
    var timer;
    
    some.onclick = function(){
        var op = 1;
        
        timer = setInterval(function(){
            op -= 0.01;
            some.style.opacity = op;
            
            if(op == 0)
                clearInterval(timer);
        }, 20);
    }
    
    some.oncontextmenu = function(){
        var h = 300;
        
        var timer = setInterval(function(){
            h -= 3;
            some.style.height = h + 'px';
            
            if(h == 0)
                clearInterval(timer);
        }, 20);
    }
    
    stop.onclick = function(){
        if(timer != undefined)
            clearInterval(timer);
    }
    
    setTimeout(function(){
        //document.body.style.transform = 'rotate(180deg)';
    }, 3000);
    
    console.log('duck' == 0);
}


// x 10