package com.zipcodewilmington.assessment1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    String ownerName;
    List<Pet> ownerpets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        ownerName = name;
        ownerpets = Arrays.asList(pets);
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        ownerpets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        ownerpets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return ownerpets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngest = ownerpets.get(0).getAge();

        for(int i = 0; i < ownerpets.size();i++){
            if(ownerpets.get(i).getAge()<youngest)
                youngest = ownerpets.get(i).getAge();
        }
        
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldest = ownerpets.get(0).getAge();

        for(int i = 0; i < ownerpets.size();i++){
            if(ownerpets.get(i).getAge()>oldest)
                oldest = ownerpets.get(i).getAge();
        }
        
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float totalAge = 0;

        for(int i = 0; i < ownerpets.size();i++){
            totalAge+=ownerpets.get(i).getAge();
        }
        
        return totalAge/ownerpets.size();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return ownerpets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return ownerName;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return ownerpets.toArray(new Pet[0]);
    }
}
