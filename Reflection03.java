package experiments;

public class Reflection03 {
	public static void main(String[] args) {
		Simple k = new Simple();
		System.out.println("class = " + k.getClass());
		System.out.println("class name = " + k.getClass().getName());
	}
}
