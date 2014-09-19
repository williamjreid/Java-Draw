/*
* Author: Yi-Tung Huang a1678019
* Date Created: 16/09/2014
* Subsystem: DrawFrame is a subsystem of Draw. DrawFrame is a window where the
* DrawPanel object is placed onto.
* Date/Time updated: 18/09/2014
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
import javax.swing.KeyStroke;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


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
	* black background and size with the input width and height.
	* @param - width - width of the frame
	* @param - height - height of the frame
	*/
	private void defaultSetup(int width, int height){
		Color background = Color.black;
		this.setSize(width,height);
		this.setBackground(background);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addMenus();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.getContentPane().add(new DrawPanel());
		

	}

	/*
	* addMenus adds a menubar to the DrawFrame object with menus 
	* File and Edit with menuitems Open, Save, Close and New, 
	* Delete respectively.
	*/
	private void addMenus(){
		JMenuBar menuBar = new JMenuBar(); 

		JMenu file = new JMenu("File");
		JMenu edit = new JMenu("Edit");

		JMenuItem open = new JMenuItem("Open");
		JMenuItem save = new JMenuItem("Save");
		JMenuItem close = new JMenuItem("Close");

		JMenuItem new_menu_item = new JMenuItem("New");
		JMenuItem delete = new JMenuItem("Delete");

		/* adding shortcuts to the menuitems (accelerator for Ctrl + key, mnemonics for Alt + key)*/
		open.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O,java.awt.Event.CTRL_MASK));
		save.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S,java.awt.Event.CTRL_MASK));
		close.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X,java.awt.Event.CTRL_MASK));
		new_menu_item.setAccelerator(KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N,java.awt.Event.CTRL_MASK));

		/* adding actionlisteners to each of the menuitems */
		OpenListener open_listener = new OpenListener();
		SaveListener save_listener = new SaveListener();
		CloseListener close_listener = new CloseListener();
		NewListener new_menu_item_listener = new NewListener();
		DeleteListener delete_listener = new DeleteListener();
		open.addActionListener(open_listener);
		save.addActionListener(save_listener);
		close.addActionListener(close_listener);
		new_menu_item.addActionListener(new_menu_item_listener);
		delete.addActionListener(delete_listener);


		/* adding menus to menuBar */
		menuBar.add(file);
		menuBar.add(edit);

		/* adding menuItems to menu 'File' */
		file.add(open);
		file.add(save);
		file.add(close);

		/* adding menuItems to menu 'Edit'*/
		edit.add(new_menu_item);
		edit.add(delete);

		this.setJMenuBar(menuBar);

	}

	/*
	 * Listener class that handles action events when menu
	 * item "OPEN" is selected
	 */
	private class OpenListener implements ActionListener{
		public void actionPerformed(ActionEvent action) {
			System.out.println("Open");
		}
	}

	/*
	 * Listener class that handles action events when menu
	 * item "SAVE" is selected
	 */
	private class SaveListener implements ActionListener{
		public void actionPerformed(ActionEvent action) {
			System.out.println("Save");
		}
	}

	/*
	 * Listener class that handles action events when menu
	 * item "CLOSE" is selected
	 */
	private class CloseListener implements ActionListener{
		public void actionPerformed(ActionEvent action) {
			System.out.println("Close");
		}
	}

	/*
	 * Listener class that handles action events when menu
	 * item "NEW" is selected
	 */
	private class NewListener implements ActionListener{
		public void actionPerformed(ActionEvent action) {
			System.out.println("New");
		}
	}

	/*
	 * Listener class that handles action events when menu
	 * item "DELETE" is selected
	 */
	private class DeleteListener implements ActionListener{
		public void actionPerformed(ActionEvent action) {
			System.out.println("Delete");
		}
	}
}

