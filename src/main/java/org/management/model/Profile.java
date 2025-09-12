package org.management.model;

import java.util.UUID;

public class Profile {
    UUID id;
    String name;
    float money;
    Property[] properties;

    public Profile(String name, float money){
        this.name=name; this.money=money; this.id=UUID.randomUUID();
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public float getMoney() {
        return money;
    }

    public UUID getId() {
        return id;
    }
}
