package lab_3_3;

import org.junit.Test;

import edu.iis.mto.time.CustomTime;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.SystemTime;

public class OrderTest {
	@Test
     public void checkIfOrderIsNotExpired() throws Exception {
         Order order = new Order(new SystemTime());
         order.submit();
         order.confirm();
      }

    @Test (expected = OrderExpiredException.class)
    public void checkIfOrderIsExpired() throws Exception {
        Order order = new Order(new CustomTime());
        order.submit();
        order.confirm();
    }
}