public class DrawFrame extends Jframe{
	public DrawFrame(){

	}

	public DrawFrame(int a, int b){
		int width = 800;
		int height = 600;
		Color background = Color.white;

		Jframe frame = new JFrame("Draw Window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setBackground(background);

		
	}
}