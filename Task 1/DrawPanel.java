import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DrawPanel extends JPanel{
	public DrawPanel(){
		// super(layout manager)
		super(null);
		defaultSetup(800,600);
	}

	public DrawPanel(int width, int height){
		super(null);
		defaultSetup(width,height);
	}

	private void defaultSetup(int width, int height){
		Color background = Color.blue;
		this.setSize(width,height);
		this.setBackground(background);
	}

	private void addShape(Graphics line){
		line.setColor(Color.green);
		line.drawLine(50,50,100,100);
	}
}