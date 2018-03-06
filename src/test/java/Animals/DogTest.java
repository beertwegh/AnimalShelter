package Animals;
import com.animals.Dog;
import com.animals.Gender;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DogTest {
    private Dog dog;

    @Before
    public void testInitialize()
    {
        this.dog = new Dog("Sgt. Woof", Gender.Male);

    }
    @Test
    public void testConstructor()
    {
        assertEquals("Sgt. Woof", this.dog.getName());
        assertEquals(Gender.Male, this.dog.getGender());
        assertNull(this.dog.getReservedBy());
        assertEquals(LocalDate.now(), this.dog.getLastWalk());
        assertFalse(this.dog.needsWalk());
    }
    @Test
    public void TestReservation()
    {
        assertNull(this.dog.getReservedBy());
        assertTrue(this.dog.reserve("John Doe"));
        assertNotNull(this.dog.getReservedBy());
        assertEquals("John Doe", this.dog.getReservedBy().getName());
        assertFalse(this.dog.reserve("Jane Doe"));
    }
}
