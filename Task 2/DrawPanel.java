/*
* Author: Yi-Tung Huang a1678019
* Date Created: 16/09/2014
* Subsystem: DrawPanel is a subsystem of Draw. DrawPanel is a platform where objects
* are drawn onto and it is placed on the object DrawFrame.
* Date/Time updated: 16/09/2014
* Description: DrawPanel is a class extended from JPanel. The draw functions 
* of JPanel are overridden. DrawPanel is a platform where objects are drawn onto.
*/
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawPanel extends JPanel{
	/*
	* constructor that creates DrawPanel object of default 
	* size 800*600
	*/
	public DrawPanel(){
		super(null);
		defaultSetup(800,600);
	}

	/*
	* constructor that creates DrawPanel object with size of
	* input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawPanel(int width, int height){
		super(null);
		defaultSetup(width,height);
	}

	/*
	* defaultSetup sets up the JPanel with default settings:
	* blue background and size with the input width and height.
	* @param - width
	* @param - height
	*/
	private void defaultSetup(int width, int height){
		MyMouseListener mouse_listener = new MyMouseListener();
		Color background = Color.yellow;
		this.setBackground(background);
		this.setSize(width,height);
		this.addMouseListener(mouse_listener);
	}

	/*
	* paintComponent draws a thick red line from (30,30) to 
	* (150,150) on the JPanel object.
	* @param - g - Graphics object to paint objects on.
	*/
	protected void paintComponent(Graphics g){
		Color color = Color.red;
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(color);
		g2D.setStroke(new BasicStroke(10));
		g.drawLine(30,30,150,150);
	}

	/*
	*/
	private class MyMouseListener implements MouseListener{
		/* function called when mouse is pressed (returns the
		 * coordinates of the mouse) */
		public void mousePressed(MouseEvent e){
			printClick("Mouse pressed",e);
		}

		/* function called when mouse is released (returns the
		 * coordinates of the mouse) */
		public void mouseReleased(MouseEvent e){
			printClick("Mouse released",e);
		}

		/* function called when mouse is clicked (returns the
		 * coordinates of the mouse) */
		public void mouseClicked(MouseEvent e){
			printClick("Mouse clicked",e);
		}

		/* function called when mouse enters the panel (returns 
		 * the coordinates of the mouse) */
		public void mouseEntered(MouseEvent e){
			printClick("Mouse entered",e);
		}

		/* function called when mouse exits the panel (returns 
		 * the coordinates of the mouse) */
		public void mouseExited(MouseEvent e){
			printClick("Mouse exited",e);
		}

		/* function that prints out the description and the 
		 * coordinates of the mouse event. */
		public void printClick(String event_description, MouseEvent e){
			int x = e.getX();
			int y = e.getY();
			String output = event_description + " at: ("+x+","+y+")";
			System.out.println(output);
		}
	}
}
