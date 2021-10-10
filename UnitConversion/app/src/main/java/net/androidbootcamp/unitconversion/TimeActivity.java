package net.androidbootcamp.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class TimeActivity extends AppCompatActivity {
    double amount;
    String convertFrom;
    String convertTo;
    double results;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);
        final EditText quantity = findViewById(R.id.inputTime);
        final Spinner input = findViewById(R.id.spnFrom);
        final Spinner output = findViewById(R.id.spnTo);
        final TextView viewResult = findViewById(R.id.txtResults);
        Button convert = findViewById(R.id.btnConvert);
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amount = Double.parseDouble(quantity.getText().toString());
                convertFrom = input.getSelectedItem().toString();
                convertTo = output.getSelectedItem().toString();

                //collect the initial condition
                switch (convertFrom) {
                    case "Minutes":
                        amount = minutesToSecs(amount);
                        break;
                    case "Hours":
                        amount = hoursToSecs(amount);
                        break;
                    case "Days":
                        amount = daysToSecs(amount);
                        break;
                    case "Weeks":
                        amount = weeksToSecs(amount);
                        break;
                    case "Fortnights":
                        amount = fortnightsToSecs(amount);
                        break;
                    case "Months":
                        amount = monthsToSecs(amount);
                        break;
                    case "Years":
                        amount = yearsToSecs(amount);
                        break;
                    default:

                        break;
                }

                //New Time Object
                Time time = new Time(amount);

                //retrieve conversion
                switch (convertTo) {
                    case "Seconds":
                        results = time.getSeconds();
                        break;
                    case "Minutes":
                        results = time.getMinutes();
                        break;
                    case "Hours":
                        results = time.getHours();
                        break;
                    case "Days":
                        results = time.getDays();
                        break;
                    case "Weeks":
                        results = time.getWeeks();
                        break;
                    case "Fortnights":
                        results = time.getFortnights();
                        break;
                    case "Months":
                        results = time.getMonths();
                        break;
                    case "Years":
                        results = time.getYears();
                        break;
                    default:

                        break;
                }

                DecimalFormat df2 = new DecimalFormat("#.######");
                viewResult.setText(df2.format(results) + " " + convertTo);
            }
    });
}

    //Methods to convert all initial conditions to seconds
    public double minutesToSecs(double minutes) {
        return minutes * 60;
    }

    public double hoursToSecs(double hours) {
        return hours * 60 * 60;
    }

    public double daysToSecs(double days) {
        return days * 60 * 60 * 24;
    }

    public double weeksToSecs(double weeks) {
        return weeks * 7 * 24 * 60 * 60;
    }

    public double fortnightsToSecs(double fortnights) {
        return fortnights * 2 * 7 * 24 * 60 * 60;
    }

    public double monthsToSecs(double months) {
        return months * 30.4167 * 24 * 60 * 60;
    }

    public double yearsToSecs(double years) {
        return years * 365 * 24 * 60 * 60;
    }

}
