package be.vdab.persoon;

public class Persoon {

    private String naam, voornaam;
//    private String voornaam;
    private be.vdab.persoon.Adres adres;

    public Persoon(String naam, String voornaam, String straat, String nummer, int postcode, String gemeente) {
        this(naam, voornaam, new be.vdab.persoon.Adres(straat, nummer, gemeente, postcode));
    }

    public Persoon(String naam, String voornaam, be.vdab.persoon.Adres adres) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.adres = adres;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public be.vdab.persoon.Adres getAdres() {
        return adres;
    }

    public void setAdres(be.vdab.persoon.Adres adres) {
        this.adres = adres;
    }

    public void voegVoornamenToe(String... voornamen) {
        StringBuilder builder = new StringBuilder(voornaam);
        for (String vn : voornamen) {
            builder.append(" ").append(vn);
        }
        this.setVoornaam(builder.toString());
    }

    @Override
    public String toString() {
        return getVoornaam() + " " + getNaam() + "\n" + getAdres();
    }
}
