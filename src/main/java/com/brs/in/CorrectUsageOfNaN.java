public class CorrectUsageOfNaN {
	public static void main(String[] args) {
		double x = 0d / 0d;
		System.out.println("x == Double.NaN : " + (x == Double.NaN));
		System.out.println("Double.isNaN(x) : " + Double.isNaN(x));
	}
}