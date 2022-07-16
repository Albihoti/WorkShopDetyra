


import java.util.*;

public class DeetyraMeVektore {


    public static void main(String[] args) {
        int a[] = {1, 2, 5, 6, 2, 3, 5, 6, 9};
        int b[] = {2, 4, 5, 6, 8, 9, 4, 6, 5};
        int c[] = {12, 4, 6, 4, 3, 1,4,23,5, 20};

        ArrayList<Integer> array = getUnionOfArrays(a,b,c);
        Collections.sort(array);
        for (Integer integer : array) {
            System.out.println(integer);
        }

        System.out.println("3thd lowest element is: " + array.get(2));
        shumaQiftAndTek(array, true);
        printVektor(array);
    }


    static void shumaQiftAndTek(ArrayList<Integer> array, boolean isQift) {
        int tek = 0;
        int qift =  0;
        for (int i = 0; i < array.size(); i++) {
            if(isQift && array.get(i) % 2 == 0) {
                System.out.println(array.get(i));
                qift++;
            } else if (!isQift && array.get(i) % 2 > 0) {
                tek++;
            }
        }

        if(isQift) {
            System.out.println("Mesatarja QIFT:" + ((qift * 100) / array.size()) + " %" );
        } else {
            System.out.println("Mesatarja TEK:" + ((tek * 100) / array.size()) + " %");
        }
    }
    private static ArrayList<Integer> getUnionOfArrays(int[] a,
                               int[] b,
                               int[] c) {
        ArrayList<Integer> arrayUnion = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            if(!arrayUnion.contains(a[i])){
                arrayUnion.add(a[i]);
            }

        }
        for (int i = 0; i < b.length; i++) {
            if(!arrayUnion.contains(b[i])) {
                arrayUnion.add(b[i]);
            }
        }
        for (int i = 0; i < c.length; i++) {
            if(!arrayUnion.contains(c[i])) {
                arrayUnion.add(c[i]);
            }
        }

        return arrayUnion;
    }

    static void printVektor(ArrayList<Integer> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sheno numrin: ");
        int numri = sc.nextInt();

        for(Integer var : array) {
           if(var <= numri) {
               System.out.println(var);
           }
        }
    }
}


