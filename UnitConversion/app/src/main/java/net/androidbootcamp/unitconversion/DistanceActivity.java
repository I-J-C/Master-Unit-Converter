package net.androidbootcamp.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class DistanceActivity extends AppCompatActivity {
    double amount;
    String convertFrom;
    String convertTo;
    double results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);
        final EditText quantity = findViewById(R.id.inputDistance);
        final Spinner input = findViewById(R.id.spnFrom);
        final Spinner output = findViewById(R.id.spnTo);
        Button convert = findViewById(R.id.btnConvert);
        final TextView viewResult = findViewById(R.id.txtResults);
        convert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                amount = Double.parseDouble(quantity.getText().toString());
                convertFrom = input.getSelectedItem().toString();
                convertTo = output.getSelectedItem().toString();

                //collect the initial condition
                switch (convertFrom) {
                    case "Inches":
                        amount = inchesToMillimeters(amount);
                        break;
                    case "Feet":
                        amount = feetToMillimeters(amount);
                        break;
                    case "Yards":
                        amount = yardsToMillimeters(amount);
                        break;
                    case "Miles":
                        amount = milesToMillimeters(amount);
                        break;
                    case "Centimeters":
                        amount = centimetersToMillimeters(amount);
                        break;
                    case "Meters":
                        amount = metersToMillimeters(amount);
                        break;
                    case "Kilometers":
                        amount = kilometersToMillimeters(amount);
                        break;
                    default:

                        break;
                }

                //create the Distance object
                Distance distance = new Distance (amount);

                //retrieve conversion
                switch (convertTo) {
                    case "Millimeters":
                        results = distance.getMillimeters();
                        break;
                    case "Inches":
                        results = distance.getInches();
                        break;
                    case "Feet":
                        results = distance.getFeet();
                        break;
                    case "Yards":
                        results = distance.getYards();
                        break;
                    case "Miles":
                        results = distance.getMiles();
                        break;
                    case "Centimeters":
                        results = distance.getCentimeters();
                        break;
                    case "Meters":
                        results = distance.getMeters();
                        break;
                    case "Kilometers":
                        results = distance.getKilometers();
                        break;
                    default:

                        break;
                }

                DecimalFormat df2 = new DecimalFormat("#.######");
                viewResult.setText(df2.format(results) + " " + convertTo);
            }
        });

    }

    //Methods to convert to Millimeters

    double centimetersToMillimeters (double cm) {
        return cm * 10;
    }

    double metersToMillimeters (double m) {
        return m * 1000;
    }

    double kilometersToMillimeters(double km) {
        return km * 1000 * 1000;
    }

    double inchesToMillimeters(double in) {
        return in * 25.4;
    }

    double feetToMillimeters(double ft) {
        return ft * 25.4 * 12;
    }

    double yardsToMillimeters(double yd) {
        return yd * 25.4 * 12 * 3;
    }

    double milesToMillimeters(double mi) {
        return mi * 25.4 * 12 * 5280;
    }
}
