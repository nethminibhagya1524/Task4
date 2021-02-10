package experiments;

import java.lang.reflect.*;

public class Reflection10 {
  public static void main(String[] args) throws Exception {
    Simple k = new Simple();
    Method m = k.getClass().getDeclaredMethod("setf1", float.class);
    m.setAccessible(true);
    m.invoke(k, 80);
    System.out.println(k);
  }
}
