public class NullTest {
	public static void main(String[] args) {
		String text = null;
		System.out.println("text : " + text);
		byte[] buffer = new byte[1024];
		buffer = null;
		System.out.println("buffer : " + buffer);
		String name = null;
		System.out.println("text == name : " + (text == name));
	}
}