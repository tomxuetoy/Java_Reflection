// The code is from link below:
// http://www.roseindia.net/java/reflect/calling-method.shtml
package MyTest;

import java.lang.reflect.*;

public class CallingMethod {
	public static void main(String[] args) {
		String firstName = new String("Deepak");
		String lastName = new String("Kumar");
		String result = new String("");

		Class<String> cls = String.class;
		Class[] parametertype = new Class[] { String.class };
		Object[] arguments = new Object[] { lastName };
		try {
			// String class has a method concat
			// concat(String str): Concatenates the specified string to the end
			// of this string.
			Method concatMethod = cls.getMethod("concat", parametertype);
			result = (String) concatMethod.invoke(firstName, arguments);
			System.out.println(" Concatenated String is => " + result);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}