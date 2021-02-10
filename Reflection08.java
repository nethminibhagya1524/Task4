package experiments;

import java.lang.reflect.*;


public class Reflection08 {
  public static void main(String[] args) throws Exception {
	  Simple k = new Simple();
		
		Field[] fields = k.getClass().getDeclaredFields();
		System.out.printf("There are %d fields\n", fields.length);
				
		for(Field f : fields)
		{
			f.setAccessible(true);
			float w = f.getFloat(k);
			w++;
			f.setFloat(k, w);
			System.out.printf("Field Name: %s    Type: %s    Value: %f\n",
						f.getName(), f.getType(), f.getFloat(k));
		}
  }
}
