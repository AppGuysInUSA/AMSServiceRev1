package com.amsvans.amsservicerev1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.io.File;

/**
 * Created by Greg on 8/28/2015.
 */
public class Warranty extends Activity{

    //Capture User Inputs
    EditText nameInput;
    EditText phoneInput;
    EditText emailInput;
    EditText cityStateInput;
    EditText vehVinInput;
    EditText vehMileageInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warranty);

//        nextButton = (Button) findViewById(R.id.nextButton);
        nameInput = (EditText) findViewById(R.id.nameInput);
        phoneInput = (EditText) findViewById(R.id.phoneInput);
        emailInput = (EditText) findViewById(R.id.emailInput);
        cityStateInput = (EditText) findViewById(R.id.cityStateInput);
        vehVinInput = (EditText) findViewById(R.id.vehVinInput);
        vehMileageInput = (EditText) findViewById(R.id.vehMileageInput);

        //////////////// Create folder under internal root to store files ///////////
        File storagePath = new File(Environment.getExternalStorageDirectory()+ "/AMS Vans");
        if (!storagePath.exists()) {
            storagePath.mkdirs();
        }

        /**
         ***   Start of Year Spinner
         **/
        Spinner spinnerYear = (Spinner) findViewById(R.id.spinner1);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> yearAdapter = ArrayAdapter
                .createFromResource(this, R.array.year_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        yearAdapter
                .setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinnerYear.setAdapter(yearAdapter);
        /**
         ***   Start of Model Spinner
         **/
        Spinner spinnerModel = (Spinner) findViewById(R.id.spinner2);

        // Create an ArrayAdapter using the string array and a default spinner
        ArrayAdapter<CharSequence> modelAdapter = ArrayAdapter
                .createFromResource(this, R.array.model_array,
                        android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        modelAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinnerModel.setAdapter(modelAdapter);


    }

    public void backButton (View view){
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);

    }

    public void captureImage1 (View view){
        /*Intent intent = new Intent(.this, SplashActivity.class);
        startActivity(intent);*/

    }

    public void captureImage2 (View view){


    }

    public void captureImage3 (View view){


    }

    public void captureImage4 (View view){


    }

}

