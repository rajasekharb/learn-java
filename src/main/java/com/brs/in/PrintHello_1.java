public class PrintHello {
	public static void main(String[] args) {
		String suffix = "River";
		for (String riverName : args) {
			System.out.println(riverName + suffix);
		}
	}
}