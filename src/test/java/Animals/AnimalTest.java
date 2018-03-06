package Animals;
import com.animals.Animal;
import com.animals.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    private Animal animal;
    @Before
    public void TestInitialize() {
        this.animal = new Animal("ugly ducking", Gender.Male);

    }
    @Test
    public void testConstructor()
    {
        assertEquals("ugly ducking", this.animal.getName());
        assertEquals(Gender.Male, this.animal.getGender());
        assertNull(this.animal.getReservedBy());
    }
    @Test
    public void testReservation()
    {
        assertNull(this.animal.getReservedBy());
        assertTrue(this.animal.reserve("John Doe"));
        assertNotNull(this.animal.getReservedBy());
        assertEquals("John Doe", this.animal.getReservedBy().getName());
        assertFalse(this.animal.reserve("Jane Doe"));

    }

}
