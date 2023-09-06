import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void opretNyBil() throws IOException {


        System.out.println("Indtast en ny bil");
        Scanner input = new Scanner(System.in);
        System.out.println("Indtast Mærke");
        String mærke = input.nextLine();
        System.out.println("Indtast Model");
        String model = input.nextLine();
        System.out.println("Regnr");
        String regnr = input.nextLine();
        System.out.println("km");
        String km =  input.nextLine();
        System.out.println("årstal");
        String årstal = input.nextLine();
        System.out.println("farve");
        String farve = input.nextLine();

        Bil bil = new Bil(mærke,model,regnr,årstal,km,farve);
        bil.opretBil();

    }
    public static ArrayList<String> hentBiler()
    {
        ArrayList<String> biler = new ArrayList<>();
        String data = "";
        File folder = new File("C:/Users/Kevin/Documents/GitHub/VibekeAutoPairProgramming");
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++) {
            File file = listOfFiles[i];
            if (file.isFile() && file.getName().endsWith(".txt")) {
                try {
                    Scanner myReader = new Scanner(file);
                    while (myReader.hasNextLine()) {
                        data = myReader.nextLine();
                    }
                    biler.add(data);
                    myReader.close();
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return biler;
    }




    public static void main(String[] args) throws IOException {
        Bil bil = new Bil();
        bil.setRegnr("1234");

        Bil bil2 = new Bil();

        Bil bil3 = new Bil();

        bil2.setRegnr("555");

        bil3.setRegnr("asdefa2");

        bil.opretBil();
        bil2.opretBil();
        bil3.opretBil();


        ArrayList<String> minebiler = hentBiler();

        System.out.println(minebiler);
    }
}
