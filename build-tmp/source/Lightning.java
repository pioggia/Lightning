import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int x=250;
int y=0;
int x2=250;
int y2=0;
public void setup()
{
	size(500, 500);
	background(0xff1E262D);
	strokeWeight(3);
}
public void draw()
{
	if (keyPressed==true && key=='a')
	{
	background(0xff1E262D, 0.5f);
	colorMode(HSB);
	stroke(((int)(Math.random()*30)+110), ((int)(Math.random()*30)+100), ((int)(Math.random()*20)+200));
	while(y<500)
	{
		x2=x+((int)(Math.random()*11)-5);
		y2=y+(int)(Math.random()*10);
		line(x, y, x2, y2);
		x=x2;
		y=y2;
	}
}
else if (keyPressed==false)
{
	background(0xff1E262D, 0.5f);
}
x=250;
		y=0;
		x2=250;
		y2=0;
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
