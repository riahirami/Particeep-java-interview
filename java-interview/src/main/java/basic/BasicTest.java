package basic;
import io.vavr.control.Option;

/**
 * For this basic test, you should not use any library. e.g. you should not use Math.pow for power method
 */
public class BasicTest {

  /**
   * return i ^ n for positive Integer, None otherwise
   * alse return None in case of errors
   */
	public static Option<Integer> power(Integer i, Integer n) {
	    if (i <= 0) {
	        System.out.println("Please enter a positive number");
	        return Option.none();
	    }
	    int result = 1;
	    while (n != 0) {
	        result *= i;
	        n--;
	    }
	    return Option.of(result);
	}
  
  

}
