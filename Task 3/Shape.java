import java.awt.Color;
import java.awt.Polygon;
import java.lang.reflect.Field;

/**
* Author: Yi-Tung Huang a1678019
* Date Created: 17/10/2014
* Subsystem: ...not sure what to write yet
* Date/Time updated: 17/10/2014
* Description: Shape is a class extended from Polygon. Shape holds information
* of all the shape we will make.
*/
public class Shape extends Polygon{
	private String type;
	private Color colour;
	private String name;

	/**
	* empty constructor
	*/
	public Shape(){
		super();
	}

	/**
	* constructor that creates Shape object of input xpoints
	* ypoints with the a number of npoints given points.
	*/
	public Shape(int[] xpoints, int[] ypoints, int npoints){
		super();
		defaultSetup("untitled", "yellow", xpoints,ypoints,npoints);
	}

	/**
	* Sets up a shape with its type, colour, x and y coordinates and the number 
	* of points that makes up of this shape.
	* @param - shape_type - type of shape to be drawn.
	* @param - shape_colour - colour of shape to be drawn.
	* @param - xpoints - an array of x coordinates.
	* @param - ypoints - an array of y coordinates.
	* @param - npoints - the number of valid points in the polygon.
	*/
	private void defaultSetup(String shape_type, String shape_colour, int[] xpoints, int[] ypoints, int npoints){
		String type = shape_type;
		
		/* converting string to colour */
		try {
		    Field field = Class.forName("java.awt.Color").getField(shape_colour);
		    colour = (Color)field.get(null);
		} catch (Exception e) {
		    colour = Color.yellow;
		}

		for (int i = 0; i < npoints; i++){
			addPoint(xpoints[i], ypoints[i]);
			this.addPoint(xpoints[i], ypoints[i]);
		}
	}

	public void setType(String shape_type){
		type = shape_type;
	}

	public String getType(){
		return type;
	}

	public void setColour(Color shape_colour){
		colour = shape_colour;
	}

	public Color getColour(){
		return colour;
	}

	public String getName(){
		return name;
	}

}