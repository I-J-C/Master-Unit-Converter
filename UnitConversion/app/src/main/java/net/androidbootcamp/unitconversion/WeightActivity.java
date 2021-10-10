package net.androidbootcamp.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class WeightActivity extends AppCompatActivity {
    double amount;
    String convertFrom;
    String convertTo;
    double results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        final EditText quantity = findViewById(R.id.inputWeight);
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
                    case "Kilograms":
                        amount = kilogramsToGrams(amount);
                        break;
                    case "Metric Tons":
                        amount = metricTonsToGrams(amount);
                        break;
                    case "Ounces":
                        amount = ouncesToGrams(amount);
                        break;
                    case "Pounds":
                        amount = poundsToGrams(amount);
                        break;
                    case "Tons":
                        amount = tonsToGrams(amount);
                        break;
                    default:

                        break;
                }

                Weight weight = new Weight(amount);

                //retrieve conversions
                switch (convertTo) {
                    case "Grams":
                       results = weight.getGrams();
                        break;
                    case "Kilograms":
                        results = weight.getKilograms();
                        break;
                    case "Metric Tons":
                        results = weight.getMetricTons();
                        break;
                    case "Ounces":
                        results = weight.getOunces();
                        break;
                    case "Pounds":
                        results = weight.getPounds();
                        break;
                    case "Tons":
                        results = weight.getTons();
                        break;
                    default:

                        break;
                }

                DecimalFormat df2 = new DecimalFormat("#.######");
                viewResult.setText(df2.format(results) + " " + convertTo);
            }
        });
    }

    //All to grams for constructor parameter
    double kilogramsToGrams (double kg) { return kg * 1000; }

    double metricTonsToGrams (double mtons) {
        return mtons * 1000 * 1000;
    }

    double ouncesToGrams (double oz) {
        return oz * 28.3495;
    }

    double poundsToGrams (double lbs) {
        return lbs * 453.592;
    }

    double tonsToGrams (double tons) {
        return tons * 453.592 * 2000;
    }
}
