/*
* Author: Yi-Tung Huang a1678019
* Date Created: 16/09/2014
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
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class DrawFrame extends JFrame{
	/*
	* Description: constructor that creates DrawFrame object of default
	* 			   size 800*600
	*/
	public DrawFrame(){
		super("Draw Window");
		defaultSetup(800,600);
	}

	/*
	* Description: constructor that creates DrawFrame object with size of
	* 			   input width and height
	* @param width - width of the frame
	* @param height - height of the frame 
	*/
	public DrawFrame(int width, int height){
		super("Draw Window");
		defaultSetup(width,height);

	}

	/*
	* Description: defaultSetup sets up the JFrame with default settings:
	* 			   black background and size with the input width and height.
	* @param - width - width of the frame
	* @param - height - height of the frame
	*/
	private void defaultSetup(int width, int height){
		Color background = Color.black;
		this.setSize(width,height);
		this.setBackground(background);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(new DrawPanel());
		this.addMenus();

	}

	/*
	* Description: addMenus adds a menubar to the DrawFrame object with menus 
	*              File and Edit with menuitems Open, Save, Close and New, 
	*              Delete respectively.
	*/
	private void addMenus(){
		JMenuBar menuBar = new JMenuBar(); 
		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");
		JMenuItem open = new JMenuItem("Open <Ctrl-o>");
		JMenuItem save = new JMenuItem("Save <Ctrl-s>");
		JMenuItem close = new JMenuItem("Close <Ctrl-x>");
		JMenuItem new_menuItem = new JMenuItem("New <Ctrl-n>");
		JMenuItem delete = new JMenuItem("Delete");

		/* adding menus to menuBar */
		menuBar.add(file);
		menuBar.add(edit);

		/* adding menuItems to menu 'File' */
		file.add(open);
		file.add(save);
		file.add(close);

		/* adding menuItems to menu 'Edit'*/
		edit.add(new_menuItem);
		edit.add(delete);

		this.setJMenuBar(menuBar);

	}
}