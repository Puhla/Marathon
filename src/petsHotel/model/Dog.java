package petsHotel.model;
//порода, рост, вес
public class Dog extends Pet {

    private String breed;

    public Dog(int id, String pet, String breed) {
        super(id, pet);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public double calculateStayCost(int days) {
        return days * 15;
    }
}

