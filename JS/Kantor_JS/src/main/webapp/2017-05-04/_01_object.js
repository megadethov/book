/*eslint indent:0*/
let user = {
    name: "Vasya",
    // sayHi: function () {        // классик вариант
    sayHi() {                      // современный JS
        alert("Hello");
    },
    ownName(){
       alert(this.name); // Вывести свое имя. this - обращение к своим полям, методам.
    }
};





