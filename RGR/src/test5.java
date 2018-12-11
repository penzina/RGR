
import static org.junit.Assert.*;

import org.junit.Test;


public class test5 {

	@org.junit.Test
	public void test5() {

		Tour a = new Tour(7,4,1.28,1.4, 1000, 7000, 150);
		assertEquals(a.getResult(),"69720.0");
	}

}
