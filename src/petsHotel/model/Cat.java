package petsHotel.model;

public class Cat extends Pet {
    private String breed;

    public Cat(int id, String pet, String breed) {
        super(id, pet);
        this.breed = breed;
    }

    @Override
    public double calculateStayCost(int days) {
        return days * 10;
    }
}