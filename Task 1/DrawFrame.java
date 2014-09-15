import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;


public class DrawFrame extends JFrame{
	public DrawFrame(){
		super("Draw window");
		defaultSetup(800,600);
	}

	public DrawFrame(int width, int height){
		super("Draw window");
		defaultSetup(width,height);
	}

	private void defaultSetup(int width, int height){
		Color background = Color.white;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setBackground(background);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		// add JPanel to the contentPane
		this.getContentPane().add(new DrawPanel());
		
	}
}