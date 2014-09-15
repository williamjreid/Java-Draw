/*
* Author: Yi-Tung Huang a1678019
* Date Created:
* Subsystem: ?
* Date/Time updated
* Description: 
* DrawPanel is a class extended from JPanel
*/
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class DrawFrame extends JFrame{
	/*
	* Description: constructor that creates DrawFrame object of default
	* 			   size 800*600
	*/
	public DrawFrame(){
		super("Draw window");
		defaultSetup(800,600);
	}

	/*
	* Description: constructor that creates DrawFrame object with size of
	* 			   input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawFrame(int width, int height){
		super("Draw window");
		defaultSetup(width,height);
	}

	/*
	* Description: defaultSetup sets up the JFrame with default settings:
	* 			   cyan background and size with the input width and height.
	* @param - width - width of the frame
	* @param - height - height of the frame
	*/
	private void defaultSetup(int width, int height){
		Color background = Color.cyan;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setBackground(background);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		// add JPanel to the contentPane
		this.getContentPane().add(new DrawPanel());
		
	}
}