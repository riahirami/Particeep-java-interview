package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  public static int computePow(int a, int b) {
	  
	  return (int) Math.pow(a, b);

  }
	
  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
	    List<Double> result = new ArrayList<Double>();
		    for (Integer item : input) {
		        double itemAfterOperation = Math.pow(((item * 2) + 3), 5);
				result.add(itemAfterOperation);
			}
	    return result;
	}

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
	    List<String> result = new ArrayList<String>();
	    int l = input.size();
	    for (int i = 0; i < input.size(); i++) {
	        String item = input.get(i);
	        String firstChar = item.substring(0, 1).toUpperCase();
	        String restChar = item.substring(1).toLowerCase();
	        String itemAfterOperation = firstChar + restChar;
	        if (i != 0 && i != l - 1) {
	            result.add(itemAfterOperation);
	        }
	    }
	    return result;
	}


}
