/*
* Author: Yi-Tung Huang a1678019
* Date Created: 09/09/2014
* Subsystem: DrawFrame is a subsystem of Draw. DrawFrame is a window where the
* DrawPanel object is placed onto.
* Date/Time updated: 16/09/2014
* Description: DrawFrame is a class extended from JFrame. DrawFrame creates a
* coloured window object where the DrawPanel object is placed onto.
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class DrawFrame extends JFrame{
	/*
	* constructor that creates DrawFrame object of default
	* size 800*600
	*/
	public DrawFrame(){
		super("Draw Window");
		defaultSetup(800,600);
	}

	/*
	* constructor that creates DrawFrame object with size of
	* input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawFrame(int width, int height){
		super("Draw Window");
		defaultSetup(width,height);
	}

	/*
	* defaultSetup sets up the JFrame with default settings:
	* grey background and size with the input width and height.
	* @param - width - width of the frame
	* @param - height - height of the frame
	*/
	private void defaultSetup(int width, int height){
		Color background = Color.gray;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setBackground(background);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		// add JPanel to the contentPane
		this.getContentPane().add(new DrawPanel());
		
	}
}