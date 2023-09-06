import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Bil {
    String mærke;
    String model;
    String regnr;
    String årstal;
    String km;
    String farve;

    public Bil(String mærke, String model, String regnr, String årstal, String km, String farve) {
        this.mærke = mærke;
        this.model = model;
        this.regnr = regnr;
        this.årstal = årstal;
        this.km = km;
        this.farve = farve;
    }
    public Bil(){

    }

    public void opretBil() throws IOException {

        FileWriter fileWriter = new FileWriter(regnr + ".txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.printf("Mærke: %s model %s regnr %s årstal %s km %s farve %s",mærke,model,regnr,årstal,km,farve);
        printWriter.close();
    }





    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getÅrstal() {
        return årstal;
    }

    public void setÅrstal(String årstal) {
        this.årstal = årstal;
    }

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getFarve() {
        return farve;
    }

    public void setFarve(String farve) {
        this.farve = farve;
    }
}
