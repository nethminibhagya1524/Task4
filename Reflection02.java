package experiments;

public class Reflection02 {
  public static void main(String[] args) {
    Simple k = new Simple();
    k.squareA();
    // k.squareB(); // if you uncomment this you will get a compiler error
    float f1 = k.f1
    // float f2 = k.f2; // if you uncomment this you will get a compiler error
    System.out.println("k=" + k);
  }
}
