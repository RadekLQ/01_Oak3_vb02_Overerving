package be.vdab.overerving;

import java.text.NumberFormat;
import java.util.Locale;


public class Manager extends be.vdab.overerving.Werknemer {

    private static int count = 0;
    private double bonus;

    public Manager(String naam, String voornaam, be.vdab.overerving.Adres adres, String functie, double salaris) {
        this(naam, voornaam, adres, functie, salaris, 50);
    }

    public Manager(String naam, String voornaam, be.vdab.overerving.Adres adres, String functie, double salaris, double bonus) {
        super(naam, voornaam, adres, functie, salaris);
        this.bonus = bonus;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static double getProcAandeelManagers() {

        double procent = ((double) getCount() / (double) be.vdab.overerving.Werknemer.getCount()) * 100;
        NumberFormat formatter = NumberFormat.getInstance(Locale.getDefault());
        formatter.setMaximumFractionDigits(2);
        return Double.parseDouble(formatter.format(procent));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalaris() {
        return super.getSalaris() + getBonus();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
