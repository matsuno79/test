//　演習　関数

//問1
/*
function menseki(hankei, ritu=3.14){
    return(hankei*hankei*ritu);
    }

document.write(menseki(5)+"<br>");
document.write(menseki(7)+"<br>");
document.write(menseki(10)+"<br>");
*/

//問2
/*
function ryoukin(onin, konin,ad=500, ch=200){
    return(onin*ad+konin*ch);
}

document.write(ryoukin(2,4)+"円です<br>");
document.write(ryoukin(1,5)+"円です<br>");
document.write(ryoukin(3,7)+"円です<br>");

*/
//★の出力
//問１
/*for(var i = 1; i<=5; i++){
    document.write("★");
    }
*/

//問２
/*
for(var i = 1; i<=2; i++){
    for(var a = 1; a<=3; a++){
    
        
    document.write("★");
    }
    document.write("<br>");
}
*/

//問3
/*
for(var i = 1; i<=2; i++){
    for(var a = 1; a<=5; a++){
    
        
    document.write("☆");
    }
    document.write("<br>");
}*/


//問4
/*
for(var i = 1; i<=5; i++){
    for(var a = 1; a<=5; a++){
    
        
    document.write("★");
    }
    document.write("<br>");
}*/


//問5
/*
for(var i = 1; i<=4; i++){
    for(var a = 1; a<=3; a++){
    
        
    document.write("★");
    }
    document.write("<br>");
}
*/


//問6
/*
for(var a = 1; a<=3; a++){
for(var i = 0; i<3; i++){
    
    if(i%2 == 0){
    document.write("★"); }

    else{document.write("☆");}
}
    document.write("<br>");
}
*/

//問7
/*
for(var a = 1; a<=5; a++){
for(var i = 0; i<5; i++){
    
    if(i%2 == 0){
    document.write("★"); }

    else{document.write("☆");}
}
    document.write("<br>");
}
*/


//問8
for(var i =0; i<5; i++){
    
    for(var y = 0; y<=i; y++){
        document.write("★");
    }
    
    document.write("<br>");
}