package experiments;

import java.lang.reflect.*;

public class Reflection08 {
  public static void main(String[] args) throws Exception {
    Simple k = new Simple();
    Field[] fields = k.getClass().getDeclaredFields();
    System.out.printf("There are %d fields\n", fields.length);
    for (Field f : fields) {
      f.setAccessible(true);
      float w = f.getInt(k);
      w++;
      f.setInt(k, w);
      System.out.printf("field name=%s type=%s value=%d\n", f.getName(),
          f.getType(), f.getInt(k));
    }
  }
}
