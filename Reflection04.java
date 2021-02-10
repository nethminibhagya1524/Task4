package experiments;

import java.lang.reflect.Field;

public class Reflection04 {
	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		Simple k = new Simple();
		
		Field[] fields = k.getClass().getFields();
		System.out.printf("There are %d fields\n", fields.length);
		
		for(Field f : fields)
		{
			System.out.printf("Field Name: %s    Type: %s    Value: %f\n",
						f.getName(), f.getType(), f.getFloat(k));
			}
		}
}
