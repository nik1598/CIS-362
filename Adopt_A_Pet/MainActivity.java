package com.example.petadoptionappjhansikesireddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup petRG;
    private RadioButton fidoDogRB;
    private RadioButton fluffyCatRB;
    private ImageView petIV;
    private CheckBox adoptionFeeCB;
    private CheckBox microchipFeeCB;
    private CheckBox spayingAndNeuteringFeeCB;
    private TextView totalFeesTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    petRG = findViewById(R.id.radioGroupPet);
    fidoDogRB = findViewById(R.id.radioButtonFidoDog);
    fluffyCatRB = findViewById(R.id.radioButtonFluffyCat);
    petIV = findViewById(R.id.imageViewPet);
    adoptionFeeCB = findViewById(R.id.checkBoxAdoptionFee);
    microchipFeeCB = findViewById(R.id.checkBoxMicrochipFee);
    spayingAndNeuteringFeeCB = findViewById(R.id.checkBoxSpayingAndNeuteringFee);
    totalFeesTV = findViewById(R.id.textViewTotalFees);

    fidoDogRB.setOnClickListener(previewPetAndSetFees);
    fluffyCatRB.setOnClickListener(previewPetAndSetFees);

    }

     View.OnClickListener previewPetAndSetFees = new View.OnClickListener() {

        @Override
        public void onClick(View v) {

            if (fidoDogRB.isChecked() == true) {

                adoptionFeeCB.setText("Adoption Fee ($30)");
                microchipFeeCB.setText("Microchip Fee ($50)");
                spayingAndNeuteringFeeCB.setText("Spaying and Neutering Fee ($20)");
                petIV.setImageResource(R.drawable.fido);
            }

            else if (fluffyCatRB.isChecked() == true) {

                adoptionFeeCB.setText("Adoption Fee ($25)");
                microchipFeeCB.setText("Microchip Fee ($45)");
                spayingAndNeuteringFeeCB.setText("Spaying and Neutering Fee ($15)");
                petIV.setImageResource(R.drawable.fluffy);
            }
        }
    };

    public void onButtonAdoptAPetClick(View view) {

        int totalFeesInteger = 0;
        int radioID = petRG.getCheckedRadioButtonId();

        Pet fidoPet = new Pet();
        Pet fluffyPet = new Pet();

        switch (radioID) {
            case R.id.radioButtonFidoDog:
                if (adoptionFeeCB.isChecked() == true){
                    fidoPet.setAdoptionFee(Pet.DOG_ADOPTION);
                }
                if (microchipFeeCB.isChecked() == true) {
                    fidoPet.setMicrochipFee(Pet.DOG_MICROCHIP);
                }
                if (spayingAndNeuteringFeeCB.isChecked() == true) {
                    fidoPet.setSpayingFee(Pet.DOG_SPAYINGANDNEUTERING);
                }
                totalFeesInteger = fidoPet.getTotalFee();
                totalFeesTV.setText("The total fees for adopting Fido is: $" +
                        totalFeesInteger);
                break;
            case R.id.radioButtonFluffyCat:
                if (adoptionFeeCB.isChecked() == true){
                    fluffyPet.setAdoptionFee(Pet.CAT_ADOPTION);
                }
                if (microchipFeeCB.isChecked() == true){
                    fluffyPet.setMicrochipFee(Pet.CAT_MICROCHIP);
                }
                if (spayingAndNeuteringFeeCB.isChecked() == true){
                    fluffyPet.setSpayingFee(Pet.CAT_SPAYINGANDNEUTERING);
                }
                totalFeesInteger = fluffyPet.getTotalFee();
                totalFeesTV.setText("The total fees for adopting Fluffy is: $" +
                        totalFeesInteger);
                break;
        }
    }
}

// Clear out image upon launching app not working