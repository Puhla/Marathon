package petsHotel.dao;

import petsHotel.model.Pet;

public interface PetsHotel {

    //Pets (Cat, Dog) - Hotel, стоимость пребывания, выручка от отеля, найти по породе
    boolean addPet(Pet pet);
    Pet removePet(int id);
    Pet findPetByBreed(String breed);
    int  quantity();
    double calculateStayCost(Pet pet, int days);
    double calculateTotalRevenue();
    void printPets();

}
