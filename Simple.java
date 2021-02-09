package experiments;


public class Simple {

 public float f1 = 40;
  private float f2 = 80;

 public Simple() {
  }

 public Simple(float f1, float f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

 public void squaref1() {
    this.f1 *= this.f1;
  }

  private void squaref2() {
    this.f2 *= this.f2;
  }

 public float getf1() {
    return f1;
  }

  private void setf1(float f1) {
    this.f1 = f1;
  }

  public float getf2() {
    return f2;
  }

 public void setf2(float f2) {
    this.f2 = f2;
  }

 public String toString() {
    return String.format("(f1:%d, f2:%d)", f1, f2);
  }
}
