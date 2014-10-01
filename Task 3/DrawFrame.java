public class DrawFrame extends JFrame{
	/**
	* constructor that creates DrawFrame object of default
	* size 800*600
	*/
	public DrawFrame(){
		super("Draw Window");
		defaultSetup(800,600);
	}


	/**
	* constructor that creates DrawFrame object with size of
	* input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawFrame(int width, int height){
		super("Draw Window");
		defaultSetup(width,height);
	}


	/**
	* defaultSetup sets up the JFrame with default settings:
	* black background and size with the input width and height.
	* @param - width - width of the frame
	* @param - height - height of the frame
	*/
	private void defaultSetup(int width, int height){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE());
		this.setSize(width,height);
		this.setColor(Color.Cyan);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		this.getContentPane().add(new DrawPanel());
	}


	/**
	* addMenus adds a menubar to the DrawFrame object with menus 
	* File and Edit with menuitems Open, Save, Close and New, 
	* Delete respectively.
	*/
	private void addMenus(){
		
	}




}