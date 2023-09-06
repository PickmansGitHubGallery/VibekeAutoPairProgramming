public class Salg {
    Bil bil;
    String Medarbejder;
    String dato;
    String pris;
    Kunde kunde;

    public Salg(Bil bil, String medarbejder, String dato, String pris, Kunde kunde) {
        this.bil = bil;
        Medarbejder = medarbejder;
        this.dato = dato;
        this.pris = pris;
        this.kunde = kunde;
    }
    public Salg()
    {

    }

    public Bil getBil() {
        return bil;
    }

    public void setBil(Bil bil) {
        this.bil = bil;
    }

    public String getMedarbejder() {
        return Medarbejder;
    }

    public void setMedarbejder(String medarbejder) {
        Medarbejder = medarbejder;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getPris() {
        return pris;
    }

    public void setPris(String pris) {
        this.pris = pris;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    @Override
    public String toString() {
        return "Salg{" +
                "bil=" + bil +
                ", Medarbejder='" + Medarbejder + '\'' +
                ", dato='" + dato + '\'' +
                ", pris='" + pris + '\'' +
                ", kunde=" + kunde +
                '}';
    }
}
