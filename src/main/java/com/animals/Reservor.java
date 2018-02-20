package com.animals;

import java.time.LocalDate;

public class Reservor {
    public String getName() {
        return name;
    }

    public LocalDate getReservedAt() {
        return reservedAt;
    }

    private String name;
    private LocalDate reservedAt;

    public Reservor(String name, LocalDate reservedAt) {
        this.name = name;
        this.reservedAt = reservedAt;
    }
}
