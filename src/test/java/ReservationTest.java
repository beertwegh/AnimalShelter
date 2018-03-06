import com.animals.Gender;
import org.junit.Before;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
public class ReservationTest {

    private Reservation reservation;

    @Before
    public void TestInitialize()
    {
        this.reservation = new Reservation();
    }
    @Test
    public void TestNewCat()
    {
        assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewCat("Kat", Gender.Female, "scratches couch");
        assertEquals(1, this.reservation.Animals.size());
    }
    @Test
    public void TestNewDog()
    {
        assertEquals(0, this.reservation.Animals.size());
        this.reservation.NewDog("hond", Gender.Male);
        assertEquals(0, this.reservation.Animals.size());
    }
}
