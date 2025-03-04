import model.ComputerRepairRequest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ComputerRepairRequestTest {
    @Test
    @DisplayName("Test Exemplu")
    public void testExemplu(){
        assertEquals(5, 5, "Numerele ar trebui sa fie egale!");
    }

    @Test
    @DisplayName("Test Exemplu 2")
    public void testExemplu2(){
        ComputerRepairRequest crr = new ComputerRepairRequest();
        crr.setOwnerName("Pop Ion");
        assertEquals("Pop Ion", crr.getOwnerName(), "Numele nu este setat corect!");
    }
}
