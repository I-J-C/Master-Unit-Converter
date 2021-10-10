package net.androidbootcamp.unitconversion;

public class Weight {
    double grams;
    double kilograms;
    double metricTons;
    double ounces;
    double pounds;
    double tons;

    public Weight(double grams) {
        this.grams = grams;
        gramsToKilograms(grams);
        gramsToMetricTons(grams);
        gramsToOunces(grams);
        gramsToPounds(grams);
        gramsToTons(grams);
    }

    //Grams to all for constructor methods
    void gramsToKilograms (double g) {
        this.kilograms = g / 1000;
    }

    void gramsToMetricTons (double g) {
        this.metricTons = g / 1000 / 1000;
    }

    void gramsToOunces (double g) {
        this.ounces = g / 28.3495;
    }

    void gramsToPounds (double g) {
        this.pounds = g / 453.592;
    }

    void gramsToTons (double g) {
        this.tons = g / 453.592 / 2000;
    }


    //Getters
    public double getGrams() {
        return grams;
    }

    public double getKilograms() {
        return kilograms;
    }

    public double getMetricTons() {
        return metricTons;
    }

    public double getOunces() {
        return ounces;
    }

    public double getPounds() {
        return pounds;
    }

    public double getTons() {
        return tons;
    }
}
