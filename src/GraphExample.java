
import javax.swing.JFrame;

public class GraphExample {

	
	public GraphExample()
	{	
		JFrame f = new JFrame("Coordinate Panel");
		
		
	    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
	    Painter draw = new Painter(); //Calls object of Painter and adds it to the frame
		
		f.add(draw);
		f.setSize(650,650);
		f.setVisible(true);
				
	}

		
}//end GraphExample