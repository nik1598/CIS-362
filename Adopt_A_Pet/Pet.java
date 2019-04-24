package com.example.petadoptionappjhansikesireddy;

public class Pet {

    // Declare constants for all six combinations of pets and fee types
    static int DOG_ADOPTION = 30;
    static int DOG_MICROCHIP = 50;
    static int DOG_SPAYINGANDNEUTERING = 20;
    static int CAT_ADOPTION = 25;
    static int CAT_MICROCHIP = 45;
    static int CAT_SPAYINGANDNEUTERING = 15;

    // Declare private fields for the adoption fee, microchip fee,
    // spaying and neutering fee, and total fees
    private int mAdoptionFee;
    private int mMicrochipFee;
    private int mSpayingAndNeuteringFee;
    private int mTotalFee;

    // Add a constructor method to initialize all field (member variable) values to 0
    public Pet(){
        mAdoptionFee = 0;
        mMicrochipFee = 0;
        mSpayingAndNeuteringFee = 0;
        mTotalFee = 0;
    }

    // Add three setter methods to set each fee type
    public void setAdoptionFee (int adoptionFeeInt) {

        mAdoptionFee = adoptionFeeInt;
    }
    public void setMicrochipFee (int microchipFeeInt) {

        mMicrochipFee = microchipFeeInt;
    }
    public void setSpayingFee (int spayingAndNeuteringFeeInt) {

        mSpayingAndNeuteringFee = spayingAndNeuteringFeeInt;
    }

    // Add one getter method to return the total fees
    public int getTotalFee(){
        mTotalFee = mAdoptionFee + mMicrochipFee + mSpayingAndNeuteringFee;
        return mTotalFee;
    }

}
