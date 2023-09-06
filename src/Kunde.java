public class Kunde {
    String fornavn;
    String efternavn;
    String telefonnummer;
    String mailAdresse;

    public Kunde(String fornavn, String efternavn, String telefonnummer, String mailAdresse) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.telefonnummer = telefonnummer;
        this.mailAdresse = mailAdresse;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public String getMailAdresse() {
        return mailAdresse;
    }

    public void setMailAdresse(String mailAdresse) {
        this.mailAdresse = mailAdresse;
    }

    @Override
    public String toString() {
        return "Kunde{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", telefonnummer='" + telefonnummer + '\'' +
                ", mailAdresse='" + mailAdresse + '\'' +
                '}';
    }
}
