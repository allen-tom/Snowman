//************************
//  Snowman.java    Author: Allen Tom
//
//  Demonstrates basic drawing methods and the use of color.
//************************

import java.awt.*;
import java.applet.*;

public class Snowman extends applet
{
    //-------------------
    //Draws a snowman
    //-------------------
    
    public void paint(Graphics page)
    {
        final int MID = 150;
        final int TOP = 50;

        setBackground(Color.cyan);

        page.setColor(Color.green);
        page.fillRect(0, 175, 300, 50); //ground

        page.setColor(Color.yellow);
        page.fillOval(-40, -40, 80, 80);

        page.setColor(Color.white);
        page.fillOval(MID-20, TOP, 40, 40); //head
        page.fillOval(MID-35, TOP+35, 70, 50);  //upper torso
        page.fillOval(MID-50, TOP+80, 100, 60); //lower torso

        page.setColor(Color.black);
 	    page.fillOval(MID-10, TOP+10, 5, 5);   //left eye
 	    page.fillOval(MID+5, TOP+10, 5, 5);	//right eye
	 
 	    page.drawArc(MID-10, TOP+20, 20, 10, 190,160);  //smile
	 
 	    page.drawLine(MID-25, TOP+60, MID-50, TOP+40);  //left arm
 	    page.drawLine(MID+25, TOP+60, MID+55, TOP+60);   //right arm
	 
 	    page.drawLine(MID-20,TOP+5,MID+20,TOP+5); 	//brim of hat
 	    page.fillRect(MID-15, TOP-20, 30, 25);    	//top of hat
	 
 	    page.setColor(Color.red);
 	    page.fillOval(MID-5,TOP+15,10,10);	//nose
	 
 	    page.setColor(Color.black);
 	    page.fillOval(MID-5,TOP+50, 10,10);   //Button1
 	    page.fillOval(MID-5,TOP+65,10,10);	//Button2
 	    page.fillOval(MID-5,TOP+80,10,10);	//Button3
	 
 	    page.setColor(Color.green);
 	    page.drawLine(MID-10,TOP-20,MID-10,TOP+5); //Stripe1
 	    page.drawLine(MID-5,TOP-20,MID-5,TOP+5);   //Stripe2
 	    page.drawLine(MID,TOP-20,MID,TOP+5);   	//Stripe3
 	    page.drawLine(MID+5,TOP-20,MID+5,TOP+5);   //Stripe4
 	    page.drawLine(MID+10,TOP-20,MID+10,TOP+5);   //Stripe5
	 
 	    page.setColor(Color.MAGENTA);
 	    page.drawString("Allen Tom",120,210);  	//String
	 
 	    page.setColor(Color.yellow);
 	    page.drawLine(0,-5,110,20);     	//Ray0
 	    page.drawLine(0,0,100,30);      	//Ray1
 	    page.drawLine(0,5,90,40);      	//Ray2
 	    page.drawLine(0,10,80,50);     	//Ray3
 	    page.drawLine(0,15,70,60);     	//Ray4
 	    page.drawLine(0,20,60,70);     	//Ray5
 	    page.drawLine(0,25,50,80);     	//Ray6
 	    page.drawLine(0,30,40,90);     	//Ray7
 	    page.drawLine(0,35,30,100);    	//Ray8
 	    page.drawLine(0,40,15,110);    	//Ray9
 	    page.drawLine(0,45,5,120);    	//Ray10

        page.setColor(Color.MAGENTA);
	    Font myFont = new Font("Jokerman", Font.BOLD, 16);
        page.drawString("Allen Tom",120,210);  	//String
	    page.setFont(myFont);
    
	    page.setColor(Color.white); 	//Snowflake 1
	    page.drawLine(150,10,150,20);
	    page.drawLine(145,15,155,15);
	    page.drawLine(145,10,155,20);
	    page.drawLine(145,20,155,10);
    
	    page.drawLine(200,80,200,90);	//SnowFlake 2
	    page.drawLine(195,85,205,85);
	    page.drawLine(195,80,205,90);
	    page.drawLine(195,90,205,80);
   
        page.drawLine(250,40,250,50);
	    page.drawLine(245,45,255,45);	//SnowFlake 3
	    page.drawLine(245,40,255,50);
	    page.drawLine(245,50,255,40);
        
	    page.drawLine(300,70,300,80);
	    page.drawLine(295,75,305,75); 	//SnowFlake 4
	    page.drawLine(295,70,305,80);
	    page.drawLine(295,80,305,70);
    
	    page.drawLine(20,120,20,130);
	    page.drawLine(15,125,25,125); 	//SnowFlake 5
	    page.drawLine(15,120,25,130);
	    page.drawLine(15,130,25,120);
    
	    page.drawLine(70,110,70,120);   //SnowFlake 6
	    page.drawLine(65,115,75,115);
	    page.drawLine(65,110,75,120);
	    page.drawLine(65,120,75,110);

    }
}
