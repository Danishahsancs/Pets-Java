package com.zipcodewilmington.assessment1;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {
    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     *
     */
        String name;
        Integer age;
        PetOwner owner;
     
    public Pet() {
        name = "";
        age = 0;
        owner = null;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String nm) {
        name = nm;
        age = 0;
        owner = null;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int ag) {
        name = "";
        age = ag;
        owner = null;
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String nm, int ag) {
        name = nm;
        age = ag;
        owner = null;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return owner;
    }
}
