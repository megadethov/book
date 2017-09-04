function some_x(){
    x = 10;
    alert(x);
}

window.onload = function(){
    var x = 100;
    
   /*  alert(x); // 100
    some_x(); // 10
    alert(x); //  */
    
    var arr = [2, 4, 5];
    arr.length;  // count(arr)
    arr.push(5); // arr[] =
    var x = arr.pop() // array_pop  x = 5
    // shift unshift
    
    //console.log(arr);
    
    var obj = {
        a: 1,
        b: 2,
        c: 'ура',
        'x-6': 'aaa'
    };
    
    obj['a'];
    obj.a;
    
    var key = 'a';
    obj[key];
    
    // foreach(onj as key => nz)
    for(key in obj){
        console.log(obj[key]);
    }
    
    // ВНИМАНИЕ!!! у объекта нет длины!!!
    console.log(obj.length);
    
    var a = 5;
    var b = 5.5;
    
    console.log(typeof a);
    console.log(typeof b);
    
    console.log(a == parseInt(a)); // (int)a
    console.log(b == parseInt(b));
    
    var n = parseInt('привет! 25');
    console.log(n);
    
    if(isNaN(n))   
        console.log('эй');
}


// x 10