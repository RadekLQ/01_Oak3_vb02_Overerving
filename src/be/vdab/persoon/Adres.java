package be.vdab.overerving;

public class Adres {

    private String straat, nummer, gemeente;
    private int postcode;

    public Adres() {

    }

    public Adres(String straat, String nummer, String gemeente, int postcode) {
        this.straat = straat;
        this.nummer = nummer;
        this.gemeente = gemeente;
        this.postcode = postcode;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }

    public String getGemeente() {
        return gemeente;
    }

    public void setGemeente(String gemeente) {
        this.gemeente = gemeente;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return getStraat() + " " + getNummer() + "\n" + getPostcode() + " " + getGemeente();
    }
}
