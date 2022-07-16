

import java.util.Arrays;
import java.util.Scanner;

public class MenaxhimiFaturave {
    static Scanner reader = new Scanner(System.in);
    static double neto[];
    static double vat[];
    static String konsumatoret[];
    static double gross[];
    static int n = 0;
    static double percentageVat[];
    static double MeEvogelse10[];
    static double temp;

    public static void main(String[] args) {

        System.out.print("Shkruani numrin e elementeve qe do te permbaje fatura:  ");
        n = reader.nextInt();
        MbusheVargun();
        shumaFaturave();
      Max();
        System.out.println("Fatura me vlere me te vogel te TVSH: " + Min());
        findLongestName();




    }

    public static void MbusheVargun() {
        neto = new double[n];
        vat = new double[n];
        gross = new double[n];
        konsumatoret = new String[n];
        percentageVat = new double[n];

        for (int i = 0; i < n; i++) {
            reader.nextLine();
            System.out.printf("Shkruani Emrin e konsumatorit %s : ", i);
            konsumatoret[i] = reader.nextLine();
            System.out.printf("Shkruani vleren ne neto %d : ", i);
            neto[i] = reader.nextDouble();
            System.out.printf("Shkruani vleren ne vat %d : ", i);
            vat[i] = reader.nextDouble();
            gross[i] = neto[i] + vat[i];

            percentageVat[i] = (vat[i] * 100) / neto[i];


        }
        System.out.println(Arrays.toString(konsumatoret));
        System.out.println(Arrays.toString(neto));
        System.out.println(Arrays.toString(vat));
        System.out.println("Vlerat gross: " + Arrays.toString(gross));
        System.out.println(Arrays.toString(percentageVat));


    }


    public static void shumaFaturave() {
        double sum = 0;
        int value = 10;
        for (int i = 0; i < percentageVat.length; i++) {
            if (percentageVat[i] <= value) {
                sum = sum + gross[i];

            }
//            System.out.println("Numrat vat me % me te vogel ose te barabart me 10: " + percentageVat[i]);


        }
        System.out.println("Shuma e faturave me % te vat me te vogel ose barabart me 10: " + sum);
    }

    public static void Max() {
        double maxValue = 0;
        String konsumatoriFatura ="";

        for (int i = 0; i < percentageVat.length; i++) {
            if (percentageVat[i] > maxValue) {
                maxValue = gross[i];

                System.out.println("Vlera Maksimale eshte:" +maxValue);
                System.out.println("Konsumatori me me se shumti fatura:" +konsumatoret[i]);

            }
        }

    }

    public static double Min() {
        double minValue = 0;
        for (int i = 0; i < percentageVat.length; i++) {
            if (percentageVat[i] < minValue) {
                minValue = gross[i];
            }
        }
        return minValue;
    }
public static void findLongestName(){
    int size =konsumatoret.length;
    String longestName = konsumatoret[0];

    for(int i = 0; i <= konsumatoret.length; i++){
        if(konsumatoret[i].length() > longestName.length()){
            longestName = konsumatoret[i];
            System.out.println("Konsumatori me e emrin me te gjate eshte: "+konsumatoret[i]);
            System.out.println(gross[i]);
            System.out.println(neto[i]);
            System.out.println(vat[i]);
        }}


}
}















