package net.androidbootcamp.unitconversion;

public class Distance {
    double millimeters;
    double centimeters;
    double meters;
    double kilometers;
    double inches;
    double feet;
    double yards;
    double miles;


    Distance(double millimeters) {
        this.millimeters = millimeters;
        millimetersToCentimeters(millimeters);
        millimetersToMeters(millimeters);
        millimetersToKilometers(millimeters);
        millimetersToInches(millimeters);
        millimetersToFeet(millimeters);
        millimetersToYards(millimeters);
        millimetersToMiles(millimeters);
    }

    //methods for constructor
    void millimetersToCentimeters(double mm) {
        this.centimeters = mm / 10;
    }

    void millimetersToMeters(double mm) {
        this.meters = mm / 1000;
    }

    void millimetersToKilometers (double mm) {
        this.kilometers = mm / 1000 / 1000;
    }

    void millimetersToInches (double mm) {
        this.inches = mm / 25.4;
    }

    void millimetersToFeet (double mm) {
        this.feet = mm / 25.4 / 12;
    }

    void millimetersToYards (double mm) {
        this.yards = mm / 25.4 / 12 / 3;
    }

    void millimetersToMiles (double mm) {
        this.miles = mm / 25.4 / 12 / 5280;
    }



    //getters (no need for setters)
    public double getMillimeters() {
        return millimeters;
    }

    public double getCentimeters() {
        return centimeters;
    }

    public double getMeters() {
        return meters;
    }

    public double getKilometers() {
        return kilometers;
    }

    public double getInches() {
        return inches;
    }

    public double getFeet() {
        return feet;
    }

    public double getYards() {
        return yards;
    }

    public double getMiles() {
        return miles;
    }
}
