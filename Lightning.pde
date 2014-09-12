int x=250;
int y=0;
int x2=250;
int y2=0;
void setup()
{
	size(500, 500);
	colorMode(RGB);
	background(30, 38, 45);
	strokeWeight(3);
}
void draw()
{
	if (keyPressed==true && key=='a')
	{
		colorMode(RGB);
	background(30, 38, 45);
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
	colorMode(RGB);
	background(30, 38, 45);
}
x=250;
		y=0;
		x2=250;
		y2=0;
}

