package lab_3_3;

import org.junit.Test;

import org.junit.Assert;
import edu.iis.mto.time.CustomTime;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.OrderExpiredException;
import edu.iis.mto.time.SystemTime;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

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

    @Test (expected = OrderExpiredException.class)
     public void checkIfOrderHasBeenCancelled() throws Exception {
         Order order = new Order(new CustomTime());
         order.submit();;
         order.confirm();
         Assert.assertThat(order.getOrderState(),is(equalTo(Order.State.CANCELLED)));
     }
}