import JavaOOPDoneRightExamples.Bill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BillTest {
    @Test
    public void testThatTotalAmountIsZero() {
        // Arrange
        var bill = new Bill();

        // Act
        double total = bill.getTotal();

        // Assert
        assertEquals(total, 0.0);
    }

    @Test
    public void testCorrectTotalForOneItem() {
        //Arrange
        var bill = new Bill();
        // Act
        bill.add(12.95);
        double total = bill.getTotal();

        // Assert
        assertEquals(total, 12.95);
    }

    @Test
    public void testCorrectTotalForTwoItems() {
        // Arrange
        var bill = new Bill();

        // Act
        bill.add(12.95);
        bill.add(2.05);
        double total = bill.getTotal();

        // Assert
        assertEquals(total, 12.95 + 2.05);
    }
}
