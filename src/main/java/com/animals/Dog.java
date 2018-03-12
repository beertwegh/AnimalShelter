package com.animals;


import java.time.LocalDate;

public class Dog extends Animal {
    private LocalDate LastWalk;

    public LocalDate getLastWalk() {
        return LastWalk;
    }
    public boolean needsWalk()
    {
        return (LocalDate.now().compareTo(LastWalk))> 0;
    }

    public Dog(String name, Gender gender) {
        super(name, gender);
        this.LastWalk = LocalDate.now();
    }
    @Override
    public String toString()
    {
        return super.toString() +
                ", last walk:  "+this.LastWalk.toString();
    }
}