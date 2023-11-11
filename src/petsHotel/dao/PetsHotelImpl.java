package petsHotel.dao;

import petsHotel.model.Pet;

import java.util.ArrayList;
import java.util.List;

public class PetsHotelImpl implements PetsHotel {
    private Pet[] pets;
    private int size;


    @Override
    @Override
    public boolean addPet(Pet pet) {
        return false;
    }

    @Override
    public Pet removePet(int id) {
        return null;
    }

    @Override
    public Pet findPetByBreed(String breed) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double calculateStayCost(Pet pet, int days) {
        return 0;
    }

    @Override
    public double calculateTotalRevenue() {
        return 0;
    }

    @Override
    public void printPets() {

    }
}
