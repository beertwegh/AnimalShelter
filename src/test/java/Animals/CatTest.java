package Animals;
import com.animals.Cat;
import com.animals.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    private Cat cat;

    @Before
    public void TestInitialize()
    {
        this.cat = new Cat("Ms. Meow", Gender.Female, "Scratches couch");

    }

    @Test
    public void TestConstructor()
    {
        assertEquals("Ms. Meow", this.cat.getName());
        assertEquals(Gender.Female, this.cat.getGender());
        assertNull(this.cat.getReservedBy());
        assertEquals("Scratches couch", this.cat.getBadHabits());
    }
    @Test
    public void TestReservation()
    {
        assertNull(this.cat.getReservedBy());
        assertTrue(this.cat.reserve("John Doe"));
        assertNotNull(this.cat.getReservedBy());
        assertEquals("John Doe", this.cat.getReservedBy().getName());
        assertFalse(this.cat.reserve("Jane Doe"));
    }
}

