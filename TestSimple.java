
import static kunit1.KUnit.*;

import java.io.IOException;
import java.lang.reflect.Field;
import java.sql.SQLException;

public class TestSimple {

  public static void main(String[] args) throws IOException, SQLException
  {
    Record K = new Record(15, 24);
    
    checkEqualFloat(K.getTodaySales(), 15);
    checkEqualFloat(K.getYesterdaySales(), 24);
    checkNotEqualFloat(K.getYesterdaySales(), 15);    
    checkNotEqualFloat(K.getYesterdaySales(), 24);    
    
    field fields = null;
    try
    (
    	fields = K.getClass().getDeclaredField("YesterdaySales");
  }catch(NoSuchFieldException | SecurityException e )
  
  {
	  e.printStckTrace();
  }
  try {
	  checkEqualFloat(fields.getFloat(K),24);
  }catch(IllegalArgumenException | IllegalAccessException e)
  
  {
	  e.printStackTrace();
  }

  	Testreport()
  }
}

