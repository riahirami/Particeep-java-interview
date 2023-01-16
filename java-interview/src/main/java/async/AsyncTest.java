package async;
import java.util.List;
import io.vavr.*;
import io.vavr.control.Option;
import java.util.concurrent.CompletableFuture;

/**
 * You should complete the function in this class
 */
class AsyncTest {

  private static List<Enterprise> enterprises = List.of(
      new Enterprise("ent_1", "Google", "ceo_2"),
      new Enterprise("ent_2", "Facebook", "ceo_1")
  );

  private static List<Ceo> ceos = List.of(
      new Ceo("ceo_1", "Mark"),
      new Ceo("ceo_2", "Sundar"),
      new Ceo("ceo_3", "Bill")
  );

  public static CompletableFuture<Option<Ceo>> getCeoById(String ceo_id) {
	    for (Ceo myceo : ceos) {
	        if (myceo.id == ceo_id) {
	            return CompletableFuture.completedFuture(Option.of(myceo));
	        }
	    }
	    return CompletableFuture.completedFuture(Option.of(null));
	  }


  public static CompletableFuture<Option<Enterprise>> getEnterpriseByCeoId(String ceo_id) {
	    for (Enterprise enterprise : enterprises) {
	        if (enterprise.ceo_id == ceo_id) {
	            return CompletableFuture.completedFuture(Option.of(enterprise));
	        }
	    }
	    return CompletableFuture.completedFuture(Option.of(null));
	}


  public static CompletableFuture<Tuple2<Option<Ceo>, Option<Enterprise>>> getCEOAndEnterprise(String ceo_id) {
	    Ceo myCeo = null;
	    Enterprise myEnterprise = null;
	    for (Ceo c : ceos) {
	        if (c.id ==ceo_id) {
	        	myCeo = c;
	            break;
	        }
	    }
	    for (Enterprise e : enterprises) {
	        if (e.ceo_id == ceo_id) {
	        	myEnterprise = e;
	            break;
	        }
	    }
	    return CompletableFuture.completedFuture(Tuple.of(Option.of(myCeo), Option.of(myEnterprise)));
	}


}
