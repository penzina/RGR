
import static org.junit.Assert.*;

import org.junit.Test;

public class test6 {

	@org.junit.Test
	public void test6() {

		Tour a = new Tour(2, 10, 1.28,1.6, 2000, 5000, 200);
		assertEquals(a.getResult(),"110400.0");
	}

}
