import org.junit.Assert;
import org.junit.Test;

public class Test1 {
    @Test
    public void test100RefundTicketPricePercent() {
        int actualResult = getRefundTicketPricePercent(100, false, true);
        Assert.assertEquals(30, actualResult);
    }

    @Test
    public void test120RefundTicketPricePercent() {
        int actualResult = getRefundTicketPricePercent(120, false, false);
        Assert.assertEquals(30, actualResult);
    }

    @Test
    public void test210RefundTicketPricePercent() {
        int actualResult = getRefundTicketPricePercent(210, false, false);
        Assert.assertEquals(50, actualResult);
    }

    @Test
    public void test290RefundTicketPricePercent() {
        int actualResult = getRefundTicketPricePercent(290, false, true);
        Assert.assertEquals(100, actualResult);
    }

    @Test
    public void test240RefundTicketPricePercent() {
        int actualResult = getRefundTicketPricePercent(240, false, true);
        Assert.assertEquals(50, actualResult);
    }




    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)
    {


        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert>240) return 100;
        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
        return 0;
    }
}
