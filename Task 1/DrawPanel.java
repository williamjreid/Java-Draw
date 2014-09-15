/*
* Author: Yi-Tung Huang a1678019
* Date Created:
* Subsystem: ?
* Date/Time updated
* Description: 
* DrawPanel is a class extended from JPanel
*/
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;

public class DrawPanel extends JPanel{
	/*
	* Description: constructor that creates DrawPanel object of
	* 			   default size 800*600
	*/
	public DrawPanel(){
		// super(layout manager)
		super(null);
		defaultSetup(800,600);
	}

	/*
	* Description: constructor that creates DrawPanel object with size of
	* 			   input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawPanel(int width, int height){
		super(null);
		defaultSetup(width,height);
	}

	/*
	* Description: defaultSetup sets up the JPanel with default settings:
	* blue background and size with the input width and height.
	* @param - width
	* @param - height
	*/
	private void defaultSetup(int width, int height){
		Color background = Color.blue;
		this.setSize(width,height);
		this.setBackground(background);
	}

	/*
	* Description: paintComponent draws a thick green line from (50,50) to 
	* (100,100) on the JPanel object.
	* @param - g - Graphics object to paint objects on.
	*/
	protected void paintComponent(Graphics g){
		Color color = Color.green;
		g.setColor(color);
		Graphics2D g2D = (Graphics2D) g;
		g2D.setStroke(new BasicStroke(10));
		g2D.drawLine(50,50,100,100);
	}

}