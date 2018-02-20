package com.animals;
import java.time.*;
public class Animal {
    private String Name;
    private Gender gender;
    private Reservor reservedBy;

    public String getName() {
        return Name;
    }

    public Gender getGender() {
        return gender;
    }

    public Reservor getReservedBy() {
        return reservedBy;
    }

    public Animal(String name, Gender gender) {
        Name = name;
        this.gender = gender;
    }

    public boolean Reserve(String reservedBy) {
        if (this.reservedBy == null) {
            this.reservedBy = new Reservor(reservedBy, LocalDate.now());
            return true;
        }
        return false;
    }
    public String ToString()
    {
        String reserved = "not reserved";
        if (this.reservedBy != null)
        {
            reserved = "reserved by " + this.reservedBy.getName();
        }
        return this.Name + this.gender + reserved;
    }
}
