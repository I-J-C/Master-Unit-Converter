package net.androidbootcamp.unitconversion;

public class Volume {
    double milliliters;
    double liters;
    double cubicMeters;
    double teaspoons;
    double tablespoons;
    double fluidOunces;
    double cups;
    double pints;
    double quarts;
    double gallons;
    double cubicInches;
    double cubicFeet;

    Volume(double milliliters) {
        this.milliliters = milliliters;
        millilitersToLiters(milliliters);
        millilitersToCubicMeters(milliliters);
        millilitersToTeaspoons(milliliters);
        millilitersToTablespoons(milliliters);
        millilitersToFluidOunces(milliliters);
        millilitersToCups(milliliters);
        millilitersToPints(milliliters);
        millilitersToQuarts(milliliters);
        millilitersToGallons(milliliters);
        millilitersToCubicInches(milliliters);
        millilitersToCubicFeet(milliliters);
    }

    //Milliliters to others for constructor
    void millilitersToLiters (double ml) {
        this.liters = ml / 1000;
    }

    void millilitersToCubicMeters (double ml) {
        this.cubicMeters = ml / 1000 / 1000;
    }

    void millilitersToTeaspoons (double ml) {
        this.teaspoons = ml / 4.929;
    }

    void millilitersToTablespoons (double ml) {
        this.tablespoons = ml / 4.929 / 3;
    }

    void millilitersToFluidOunces (double ml) {
        this.fluidOunces = ml / 4.929 / 3 / 2;
    }

    void millilitersToCups (double ml) {
        this.cups = ml / 236.588;
    }

    void millilitersToPints (double ml) {
        this.pints = ml / 236.588 / 2;
    }

    void millilitersToQuarts (double ml) {
        this.quarts = ml / 236.588 / 4;
    }

    void millilitersToGallons (double ml) {
        this.gallons = ml / 236.588 / 4 / 4;
    }

    void millilitersToCubicInches (double ml) {
        this.cubicInches = ml / 16.387;
    }

    void millilitersToCubicFeet (double ml) {
        this.cubicFeet = ml / 16.387 / 1728;
    }

    //Getters
    public double getMilliliters() {
        return milliliters;
    }

    public double getLiters() {
        return liters;
    }

    public double getCubicMeters() {
        return cubicMeters;
    }

    public double getTeaspoons() {
        return teaspoons;
    }

    public double getTablespoons() {
        return tablespoons;
    }

    public double getFluidOunces() {
        return fluidOunces;
    }

    public double getCups() {
        return cups;
    }

    public double getPints() {
        return pints;
    }

    public double getQuarts() {
        return quarts;
    }

    public double getGallons() {
        return gallons;
    }

    public double getCubicInches() {
        return cubicInches;
    }

    public double getCubicFeet() {
        return cubicFeet;
    }
}
