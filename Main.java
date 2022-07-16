package cacttus.education;
//TeamLider: Albi Hoti
// ViceTeamLider: Fitore Morina
// PublicRelation(PR):
// Progammers: Enver Ismaili, Lirim Mavraj, Erion Ferizi, Drini Shehu


import java.util.Scanner;

public class Main {
  static  Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        numriKompleks();

    }
    public static void numriKompleks() {
        System.out.print("Shkruani numri e pare real: ");
        int numriReal = reader.nextInt();
        System.out.print("Shkruani numrin e pare kompleks: ");
        int numriKom = reader.nextInt();
        System.out.print("Shkruani numrin e dyte real: ");
        int numri2Real = reader.nextInt();
        System.out.print("Shkruani numrin e dyte kompleks: ");
        int numri2Kom = reader.nextInt();
        System.out.print("Zgjedhne operatorin e deshiruar (+, -, *): ");
        char operatori = reader.next().charAt(0);

        switch (operatori) {
            case '-' -> {
                int sumR = numriReal - numri2Real;
                int sumK = numriKom - numri2Kom;
                if (sumK < 0) {
                    System.out.println(sumR + " " + sumK + "i");
                } else {
                    System.out.println(sumR + " - " + sumK + "i");
                }
            }
            case '+' -> {
                int sumR = numriReal + numri2Real;
                int sumK = numriKom + numri2Kom;
                System.out.println(sumR + " + " + sumK + "i");
            }
            case '*' -> {
                int sumR = numriReal * numri2Real;
                int sumK = numriKom * numri2Kom;
                if (sumR < 0) {
                    System.out.println(sumK + "i" + "-" + sumR);
                } else {
                    System.out.println(sumK + "i" + " " + sumR);
                }
            }
        }
    }
    }
}

