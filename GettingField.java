package MyTest;

import java.awt.*;
import java.lang.reflect.*;

public class GettingField {
	public static void main(String[] args) throws Exception {
		Rectangle rect = new Rectangle(50, 60);
		// getClass(): Returns the runtime class of this Object.
		// getField(): Returns a Field object that reflects the specified public
		// member field of the class or interface represented by this Class
		// object.
		Field xfield = rect.getClass().getField("x");
		Field yfield = rect.getClass().getField("y");
		Field heightField = rect.getClass().getField("height");
		Field widthField = rect.getClass().getField("width");
		System.out.println("X Value = " + xfield.getInt(rect));
		System.out.println("Y Value = " + yfield.getInt(rect));
		System.out.println("Height Value = " + heightField.getInt(rect));
		System.out.println("Width Value = " + widthField.getInt(rect));
	}
}
