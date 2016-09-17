import java.math.BigDecimal;
import java.math.MathContext;
public class BigDecimalUsage {
	public static void main(String[] args) {
		MathContext mathContext = new MathContext(5);
		BigDecimal x = new BigDecimal("3.145", mathContext);
		BigDecimal y = new BigDecimal("1.792", mathContext);
		BigDecimal add = x.add(y, mathContext);
		BigDecimal subtract = x.subtract(y, mathContext);
		BigDecimal multiply = x.multiply(y, mathContext);
		BigDecimal divide = x.divide(y, mathContext);
		System.out.print(add + " " + subtract + " " + multiply + " " + divide);
	}
}