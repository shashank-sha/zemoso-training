var xPosition;
var yPosition;
var i=0,j,text="";
var xArray=[],yArray=[];


// Set up!
var a_canvas = document.getElementById("a");
var context = a_canvas.getContext("2d");


function getClickPosition(e) {
    xPosition = e.clientX;
    yPosition = e.clientY;
    //var coords = "X coords: " + xPosition + ", Y coords: " + yPosition;
    //document.getElementById("demo").innerHTML = coords;
    
    
/*len=xArray.length;
for (j = 0; j < len; j++) {
    text += ""+ xArray[j] +" "+yArray[j]+" ";
    
}*/
//text +=". ";
//document.getElementById("demo").innerHTML = text;
if(existingPoint(xPosition,yPosition))
{
	
	delPoint(xPosition,yPosition);
}
else{
    xArray[i]=xPosition;
    yArray[i]=yPosition;
    i++;
	drawPoint(xPosition,yPosition);
}
    
//    context.beginPath();
//context.arc(xPosition, yPosition, 2, 0, 2*Math.PI);
//context.closePath();
//context.fill();
//context.fillStyle("white");
}

function drawPoint(x,y){
context.fillStyle = "black";    
context.beginPath();
context.arc(x, y, 2, 0, 2*Math.PI);
context.closePath();
context.fill();
//context.fillStyle("white");

}

function delPoint(x,y){
context.fillStyle = "white";
context.beginPath();
context.arc(x, y, 3, 0, 2*Math.PI);
context.closePath();
context.fill();
//context.fillstyle("pink");
}

function existingPoint(x,y){
len=xArray.length;
for (j = 0; j < len; j++) {
    if(xArray[j]===x)
    {
        if(yArray[j]===y){
	    delete xArray[j];
	    delete yArray[j];
            return true;
	}
    }
}
return false;
}




