package net.androidbootcamp.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class VolumeActivity extends AppCompatActivity {
    double amount;
    String convertFrom;
    String convertTo;
    double results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume);
        final EditText quantity = findViewById(R.id.inputVolume);
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
                    case "Liters":
                        amount = litersToMilliliters(amount);
                        break;
                    case "Cubic Meters":
                        amount = cubicMetersToMilliliters(amount);
                        break;
                    case "Teaspoons":
                        amount = teaspoonsToMilliliters(amount);
                        break;
                    case "Tablespoons":
                        amount = tablespoonsToMilliliters(amount);
                        break;
                    case "Fluid Ounces":
                        amount = fluidOuncesToMilliliters(amount);
                        break;
                    case "Cups":
                        amount = cupsToMilliliters(amount);
                        break;
                    case "Pints":
                        amount = pintsToMilliliters(amount);
                        break;
                    case "Quarts":
                        amount = quartsToMilliliters(amount);
                        break;
                    case "Gallons":
                        amount = gallonsToMilliliters(amount);
                        break;
                    case "Cubic Inches":
                        amount = cubicInchesToMilliliters(amount);
                        break;
                    case "Cubic Feet":
                        amount = cubicFeetToMilliliters(amount);
                        break;
                    default:

                        break;
                }

                            //New Volume Object
                Volume volume = new Volume(amount);

                //retrieve conversions

                switch (convertTo) {
                    case "Milliliters":
                        results = volume.getMilliliters();
                        break;
                    case "Liters":
                        results = volume.getLiters();
                        break;
                    case "Cubic Meters":
                        results = volume.getCubicMeters();
                        break;
                    case "Teaspoons":
                        results = volume.getTeaspoons();
                        break;
                    case "Tablespoons":
                        results = volume.getTablespoons();
                        break;
                    case "Fluid Ounces":
                        results = volume.getFluidOunces();
                        break;
                    case "Cups":
                        results = volume.getCups();
                        break;
                    case "Pints":
                        results = volume.getPints();
                        break;
                    case "Quarts":
                        results = volume.getQuarts();
                        break;
                    case "Gallons":
                        results = volume.getGallons();
                        break;
                    case "Cubic Inches":
                        results = volume.getCubicInches();
                        break;
                    case "Cubic Feet":
                        results = volume.getCubicFeet();
                        break;
                    default:

                        break;
                }


                 DecimalFormat df2 = new DecimalFormat("#.######");
                viewResult.setText(df2.format(results) + " " + convertTo);
            }
        });
    }

    //All to Milliliters for constructor parameter
    double litersToMilliliters (double l) {
        return l * 1000;
    }

    double cubicMetersToMilliliters (double m3) {
        return m3 * 1000 * 1000;
    }

    double teaspoonsToMilliliters (double ts) {
        return ts * 4.929;
    }

    double tablespoonsToMilliliters (double tbs) {
        return tbs * 4.929 * 3;
    }

    double fluidOuncesToMilliliters (double floz) {
        return floz * 4.929 * 3 * 2;
    }

    double cupsToMilliliters (double cups) {
        return cups * 236.588;
    }

    double pintsToMilliliters (double pints) {
        return pints * 236.588 * 2;
    }

    double quartsToMilliliters (double quarts) {
        return quarts * 236.588 * 4;
    }

    double gallonsToMilliliters (double gals) {
        return gals * 236.588 * 4 * 4;
    }

    double cubicInchesToMilliliters (double in3) {
        return in3 * 16.387;
    }

    double cubicFeetToMilliliters (double ft3) {
        return ft3 * 16.387 * 1728;
    }
}
