package experiments;

import static KUnit.KUnit.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLException;

public class TestSimple {

	public static void main(String[] args) throws IOException, SQLException
	{
		// TODO Auto-generated method stub
		Simple s = new Simple(10, 25);
		
		checkEquals(s.getf1(),10);
		checkEquals(s.getf2(),25);
		checkNotEquals(s.getf1(),10);    
		checkNotEquals(s.getf1(),25);    

		Field field = null;
		try
		{
			field = s.getClass().getDeclaredField("f1");
		}catch(NoSuchFieldException | SecurityException e)
		{
			e.printStackTrace();
		}
		
		field.setAccessible(true);
		try
		{
			checkEquals(field.getFloat(s),25);
		}catch(IllegalArgumentException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
		
		report();
	}
}


