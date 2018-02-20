import com.animals.*;

import java.util.ArrayList;

public class Reservation {
    public ArrayList<Animal> Animals = new ArrayList();


    public void NewCat(String name, Gender gender, String badHabits)
    {
        this.Animals.add(new Cat(name, gender, badHabits));
    }
    public void NewDog(String name, Gender gender)
    {
        this.Animals.add(new Dog(name,gender));
    }
}
