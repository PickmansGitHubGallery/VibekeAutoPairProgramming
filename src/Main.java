import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void opretNyBil() throws IOException {

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
    public static ArrayList<String>printBiler()
    {
        ArrayList<String> biler = new ArrayList<>();
        String data = "";
        File folder = new File("C:\\Users\\Arbejde\\Desktop\\Programmering med Andres\\IpFinderJavaFX\\VibekeAutoPairProgramming");
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
    public static void opretSalg() throws IOException {
        System.out.println("Indtast kundes fornavn");
        String fornavn = input.nextLine();
        System.out.println("Indtast kundes efternavn");
        String efternavn = input.nextLine();
        System.out.println("Indtast kundes tlf");
        String tlf = input.nextLine();
        System.out.println("Indtast kundes email");
        String email = input.nextLine();

        Kunde kunde = new Kunde(fornavn,efternavn,tlf,email);

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

        System.out.println("Medarbejdernavn");
        String medarbejder = input.nextLine();
        System.out.println("Dato");
        String dato = input.nextLine();
        System.out.println("Pris");
        String pris = input.nextLine();

        Salg salg = new Salg(bil, medarbejder, dato, pris,kunde);
        String fileName = "Regnskab.txt";
        FileWriter fw = new FileWriter(fileName,true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(salg.toString()+"\n");
        bw.close();

    }


    public static void main(String[] args) throws IOException {
        System.out.println("Velkommen til Vibeke Auto");
        System.out.println("1. Opret ny bil");
        System.out.println("2. Print liste over biler");
        System.out.println("3. Registrer et salg");
        int brugerInput = input.nextInt();
        String tom = input.nextLine();
        if(brugerInput == 1){
            opretNyBil();
        } else if (brugerInput == 2) {
           ArrayList<String> ListeAfBiler = printBiler();
            for (String bil: ListeAfBiler
                 ) {
                System.out.println(bil);

            }
        } else if (brugerInput == 3) {
            opretSalg();


        }
    }
}
