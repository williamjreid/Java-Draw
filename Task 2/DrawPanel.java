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

public class DrawPanel extends JPanel{
	/*
	* Description: constructor that creates DrawPanel object of
	* 			   default size 800*600
	*/
	public DrawPanel(){
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
		Color background = Color.yellow;
		this.setBackground(background);
		this.setSize(width,height);
	}

	/*
	* Description: paintComponent draws a thick red line from (30,30) to 
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
}
