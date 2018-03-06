package Animals;
import com.animals.Gender;
import com.animals.Reservor;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class ReservorTest {
    @Test
    public void TestConstructor()
    {
        LocalDate reservedAt = LocalDate.now();
        Reservor reservor = new Reservor("John Doe", reservedAt);
        assertEquals("John Doe", reservor.getName());
        assertEquals(reservedAt, reservor.getReservedAt());
    }
}
