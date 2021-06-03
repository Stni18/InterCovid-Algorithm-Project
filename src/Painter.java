import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Painter extends JPanel {
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		if(InterCoviddk.condition == true)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				g.drawOval((int) InterCoviddk.x1_G1[i]*56,(int) InterCoviddk.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G1[i]*56, (int) InterCoviddk.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				g.drawOval((int) InterCoviddk.x1_G2[i]*56,(int) InterCoviddk.y1_G2[i]*100, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G2[i]*56, (int) InterCoviddk.y1_G2[i]*100, 10, 10);	
				
				g.setColor(Color.RED);
				g.drawOval((int) InterCoviddk.x1_G3[i]*60,(int) InterCoviddk.y1_G3[i]*60, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G3[i]*60, (int) InterCoviddk.y1_G3[i]*60, 10, 10);	
			}
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCoviddk.x1_D1[0],(int) InterCoviddk.y1_D1[0], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[0], (int) InterCoviddk.y1_D1[0], 10, 10);	
				g.drawOval((int) InterCoviddk.x1_D1[1],(int) InterCoviddk.y1_D1[1], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[1], (int) InterCoviddk.y1_D1[1], 10, 10);	
				g.drawOval((int) InterCoviddk.x1_D1[2],(int) InterCoviddk.y1_D1[2], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[2], (int) InterCoviddk.y1_D1[2], 10, 10);	
				
		}
		else if(InterCoviddk.iterations == 99 && InterCoviddk.condition == false)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				g.drawOval((int) InterCoviddk.x1_G1[i]*56,(int) InterCoviddk.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G1[i]*56, (int) InterCoviddk.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				g.drawOval((int) InterCoviddk.x1_G2[i]*56,(int) InterCoviddk.y1_G2[i]*100, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G2[i]*56, (int) InterCoviddk.y1_G2[i]*100, 10, 10);	
				
				g.setColor(Color.RED);
				g.drawOval((int) InterCoviddk.x1_G3[i]*60,(int) InterCoviddk.y1_G3[i]*60, 10, 10);
				g.fillOval((int) InterCoviddk.x1_G3[i]*60, (int) InterCoviddk.y1_G3[i]*60, 10, 10);	
			}
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCoviddk.x1_D1[0],(int) InterCoviddk.y1_D1[0], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[0], (int) InterCoviddk.y1_D1[0], 10, 10);	
				g.drawOval((int) InterCoviddk.x1_D1[1],(int) InterCoviddk.y1_D1[1], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[1], (int) InterCoviddk.y1_D1[1], 10, 10);	
				g.drawOval((int) InterCoviddk.x1_D1[2],(int) InterCoviddk.y1_D1[2], 10, 10);
				g.fillOval((int) InterCoviddk.x1_D1[2], (int) InterCoviddk.y1_D1[2], 10, 10);	
		}
		
		if(InterCovidData2.condition == true)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				
				g.drawOval((int) InterCovidData2.x1_G1[i]*36,(int) InterCovidData2.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G1[i]*36, (int) InterCovidData2.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				
				g.drawOval((int) InterCovidData2.x1_G2[i]*36,(int) InterCovidData2.y1_G2[i]*80, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G2[i]*36, (int) InterCovidData2.y1_G2[i]*80, 10, 10);	
				
				g.setColor(Color.RED);
				
				g.drawOval((int) InterCovidData2.x1_G3[i]*40,(int) InterCovidData2.y1_G3[i]*80, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G3[i]*40, (int) InterCovidData2.y1_G3[i]*80, 10, 10);
			}
			
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCovidData2.x1_D1[0],(int) InterCovidData2.y1_D1[0], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[0], (int) InterCovidData2.y1_D1[0], 10, 10);	
				g.drawOval((int) InterCovidData2.x1_D1[1],(int) InterCovidData2.y1_D1[1], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[1], (int) InterCovidData2.y1_D1[1], 10, 10);	
				g.drawOval((int) InterCovidData2.x1_D1[2],(int) InterCovidData2.y1_D1[2], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[2], (int) InterCovidData2.y1_D1[2], 10, 10);
				
			
		}
		else if(InterCovidData2.iterations == 99 && InterCovidData2.condition == false)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				
				g.drawOval((int) InterCovidData2.x1_G1[i]*36,(int) InterCovidData2.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G1[i]*36, (int) InterCovidData2.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				
				g.drawOval((int) InterCovidData2.x1_G2[i]*36,(int) InterCovidData2.y1_G2[i]*80, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G2[i]*36, (int) InterCovidData2.y1_G2[i]*80, 10, 10);	
				
				g.setColor(Color.RED);
				
				g.drawOval((int) InterCovidData2.x1_G3[i]*40,(int) InterCovidData2.y1_G3[i]*80, 10, 10);
				g.fillOval((int) InterCovidData2.x1_G3[i]*40, (int) InterCovidData2.y1_G3[i]*80, 10, 10);
				
			}
			
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCovidData2.x1_D1[0],(int) InterCovidData2.y1_D1[0], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[0], (int) InterCovidData2.y1_D1[0], 10, 10);	
				g.drawOval((int) InterCovidData2.x1_D1[1],(int) InterCovidData2.y1_D1[1], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[1], (int) InterCovidData2.y1_D1[1], 10, 10);	
				g.drawOval((int) InterCovidData2.x1_D1[2],(int) InterCovidData2.y1_D1[2], 10, 10);
				g.fillOval((int) InterCovidData2.x1_D1[2], (int) InterCovidData2.y1_D1[2], 10, 10);
				
		
		}
		
		if(InterCovidData3.condition == true)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				
				g.drawOval((int) InterCovidData3.x1_G1[i]*46,(int) InterCovidData3.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G1[i]*46, (int) InterCovidData3.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				
				g.drawOval((int) InterCovidData3.x1_G2[i]*46,(int) InterCovidData3.y1_G2[i]*80, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G2[i]*46, (int) InterCovidData3.y1_G2[i]*80, 10, 10);	
				
				g.setColor(Color.RED);
				
				g.drawOval((int) InterCovidData3.x1_G3[i]*50,(int) InterCovidData3.y1_G3[i]*80, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G3[i]*50, (int) InterCovidData3.y1_G3[i]*80, 10, 10);
			}
			
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCovidData3.x1_D1[0]*100,(int) InterCovidData3.y1_D1[0]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[0]*100, (int) InterCovidData3.y1_D1[0]*100, 10, 10);	
				g.drawOval((int) InterCovidData3.x1_D1[1]*100,(int) InterCovidData3.y1_D1[1]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[1]*100, (int) InterCovidData3.y1_D1[1]*100, 10, 10);	
				g.drawOval((int) InterCovidData3.x1_D1[2]*100,(int) InterCovidData3.y1_D1[2]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[2]*100, (int) InterCovidData3.y1_D1[2]*100, 10, 10);
			
		}
		
		if(InterCovidData3.iterations == 99 && InterCovidData3.condition == false)
		{
			for(int i = 0; i < 100; i++)
			{
				g.setColor(Color.GREEN);
				
				g.drawOval((int) InterCovidData3.x1_G1[i]*46,(int) InterCovidData3.y1_G1[i]*56, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G1[i]*46, (int) InterCovidData3.y1_G1[i]*56, 10, 10);	
				
				g.setColor(Color.BLUE);
				
				g.drawOval((int) InterCovidData3.x1_G2[i]*46,(int) InterCovidData3.y1_G2[i]*80, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G2[i]*46, (int) InterCovidData3.y1_G2[i]*80, 10, 10);	
				
				g.setColor(Color.RED);
				
				g.drawOval((int) InterCovidData3.x1_G3[i]*50,(int) InterCovidData3.y1_G3[i]*80, 10, 10);
				g.fillOval((int) InterCovidData3.x1_G3[i]*50, (int) InterCovidData3.y1_G3[i]*80, 10, 10);
			}
			
				g.setColor(Color.YELLOW);
				g.drawOval((int) InterCovidData3.x1_D1[0]*100,(int) InterCovidData3.y1_D1[0]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[0]*100, (int) InterCovidData3.y1_D1[0]*100, 10, 10);	
				g.drawOval((int) InterCovidData3.x1_D1[1]*100,(int) InterCovidData3.y1_D1[1]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[1]*100, (int) InterCovidData3.y1_D1[1]*100, 10, 10);	
				g.drawOval((int) InterCovidData3.x1_D1[2]*100,(int) InterCovidData3.y1_D1[2]*100, 10, 10);
				g.fillOval((int) InterCovidData3.x1_D1[2]*100, (int) InterCovidData3.y1_D1[2]*100, 10, 10);
		}
		//--------------------------------------------------------------------------------------------------------------------
		g.setColor(Color.GREEN);
		g.fillOval(180, 495,10, 10);
		g.drawOval(180, 495, 10, 10);
		
		g.setColor(Color.BLACK);
		g.drawLine(5, 45, 5, 450);
		
		g.setColor(Color.BLACK);
		g.drawLine(10, 450, 650, 450);
		g.drawString("Coordinates", 350, 10);
		
		
		g.drawString("Groups:", 80, 520);
		
		//draws numbers in x axes 
		g.drawString("5", 100, 470);
		g.drawString("10", 200, 470);
		g.drawString("15", 350, 470);
		g.drawString("20", 500, 470);
		
		
		g.drawString("5", 30, 180); //write 5 in y axes
		
		//Create Legend on Graph
		g.setColor(Color.BLACK);
		g.drawString("Group1", 130, 505);
		g.drawString("Group2", 130, 530);
		g.drawString("Group3", 130, 550);
		g.drawString("Center", 130, 570);
		
		g.setColor(Color.GREEN);
		g.fillOval(180, 495,10, 10);
		g.drawOval(180, 495, 10, 10);
		
		g.setColor(Color.BLUE);
		g.fillOval(180, 520,10, 10);
		g.drawOval(180, 520, 10, 10);
		
		
		g.setColor(Color.RED);
		g.fillOval(180, 540,10, 10);
		g.drawOval(180, 540, 10, 10);
		
		g.setColor(Color.YELLOW);
		g.fillOval(180, 560,10, 10);
	}

}//end Painter class
