package petsHotel.model;

import java.util.Objects;

//Задача 1. Создайте дочерние от класса Pet классы Cat и Dog c
// дополнительными полями: порода, рост, вес.
// Создайте метод voice, который выдает "Мяу!" для класса Cat и и "Гав-гав!" для класса Dog.
// Создайте HouseAppl, в котором есть метод main. Поселите в доме 2 собаки и 3 кошки.
// Смоделируйте жизнь в этом доме в течение дня.
public abstract class Pet {
    private int id;
    private String pet;


    public Pet(int id, String pet) {
        this.id = id;
        this.pet = pet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", pet='" + pet + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet1 = (Pet) o;
        return id == pet1.id && Objects.equals(pet, pet1.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, pet);
    }
    public abstract double calculateStayCost(int days);
}


