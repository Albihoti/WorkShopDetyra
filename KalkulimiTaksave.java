

import java.util.Scanner;

public class KalkulimiTaksave {
    static Scanner user = new Scanner(System.in);

    public static void main(String[] args) {
//                rrogaBruto();
//                rrogaNeto();
//                pagesaTaksave();
//                rataMujore();
//                pagesaTvsh();
//                fitimiDitor();
//                faturERrymes();
//                shpenzimiWat();



    }

    public static int rrogaBruto() {
        System.out.println("Shkuani rrogen tuaj neto: ");
        int netoSalary = user.nextInt();
        int grosSalary;
        grosSalary = netoSalary + (netoSalary * 18 / 100);
        System.out.println("Rroga juaj bruto eshte: " + grosSalary);
        return grosSalary;
    }

    public static void rrogaNeto() {

        System.out.println("Shkruani rrogen e juaj bruto: ");
        double grosSalary = user.nextDouble();
        double payment = (grosSalary - (grosSalary * 30) / 100);
        System.out.println("Rroga juaj neto eshte: " + payment);

    }

    public static void pagesaTaksave() {
        System.out.println("Shkruani rrogen tuaj: ");
        double rroga = user.nextDouble();
        System.out.println("Nga " + rroga + " ne muaj qe ju pagueni. Ju paguani " + (rroga * 30) / 100 + " taksa ne muaj.");

    }

    public static double rataMujore() {
        System.out.println("Shkruani sa deshironi te merrni kredi.");
        double loan = user.nextDouble();
        System.out.println("Per sa vite doni ta paguani kredin: ");
        int paymentTime = user.nextInt();
        paymentTime = paymentTime * 12;
        double rate = 8;
        rate = (rate / 100) / 12;
        System.out.println("Ju doni te merrni " + loan + "euro, dhe keni vendosur ta paguani per " + paymentTime + " muaj.");
        System.out.println("Interesi i pageses eshte 8%.");
        double kestiMujor = (loan * rate) / (1 - Math.pow(1 + rate, -paymentTime));
        System.out.println("Ju do te paguani " + kestiMujor + "euro ne muaj");
        double totaliPageses = kestiMujor * paymentTime;
        System.out.println("Totali juaj eshte: " + totaliPageses);
        return kestiMujor;

    }

    public static void pagesaTvsh() {
        System.out.println("Shkruani qarkullimin ditor: ");
        double qarkullimiDitor = user.nextDouble();
        double tvsh = 0.18;
        System.out.println("Ju gjat dites keni bere shitje " + qarkullimiDitor);
        System.out.println("Nga kjo shum ju do te paguani " + qarkullimiDitor * tvsh + "TVSH.");

    }

    public static void fitimiDitor() {
        System.out.println("Shkruani sa keni bere shitje: ");
        double shitjeDitore = user.nextDouble();
        double pagesaTVSH = 0.18;
        double pareTpaqta = shitjeDitore - (shitjeDitore * pagesaTVSH);
        System.out.println("Pas pagesave qe i detyoheni shtetit ju gjate dites keni fituar " + pareTpaqta);


    }

    public static int faturERrymes() {
        System.out.println("Shkruani sa kilovat keni hargjuar tere muajin: ");
        int kvMujor = user.nextInt();
        int pagesaPerOr = 6;
        int shpenzimi = kvMujor * pagesaPerOr;
        int faktura = shpenzimi / 24;
        System.out.println("Ju keni shpenzuar " + kvMujor + "kilovat, dhe do te paguani " + faktura + "euro kete muaj.");
        return faktura;

    }

    public static int shpenzimiWat() {
        System.out.println("Shkruani nje pajisje qe deshironi tja llogaritni shpenzimet:\n" +
                "1-Frigorifer\n 2-Laptop\n3-Televizor\n4-Kompjuteri\n5-Bojleri\n6.Llampa. ");
        int pajisja = user.nextInt();
        System.out.println("Ju keni zgjedhur: " + pajisja);
        System.out.println("Shkruani se sa ka kapacitet (ne volt)?");
        int shpenzimiPerOr = user.nextInt();
        System.out.println("Sa ore ka punuar pajisja?");
        int orPunuese = user.nextInt();
        System.out.println("Shkruani se sa dit ka punuar kete muaj pajisja: ");
        int ditMuaji = user.nextInt();
        int totaliShpenzimit = shpenzimiPerOr * orPunuese*ditMuaji;
        System.out.println("Pajisja qe ju keni zgjedhur e cila ka punuar per " + shpenzimiPerOr + "ore kete muaj dhe ka shpenzuar " + totaliShpenzimit + " vat");
        System.out.println("");
        return totaliShpenzimit;
    }


}



