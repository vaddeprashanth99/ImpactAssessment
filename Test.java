import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<String> consecutiveNumbers(int[] a) {
        int length = 1;
        List<String> list  = new ArrayList<String>();


        if (a.length == 0) {
            return list;
        }

        for (int i = 1; i <= a.length; i++) {

            if (i == a.length || a[i] - a[i - 1] != 1) {


                if (length == 1) {
                    list.add(String.valueOf(a[i - length]));
                } else {

                    list.add(a[i - length] + " - " + a[i - 1]);
                }

                length = 1;
            } else {
                length++;
            }
        }

        return list;
    }


    public static void main(String args[]) {

        // Test Case 1:
        int[] arr1 = {1, 2, 3, 6, 7};
        System.out.print(consecutiveNumbers(arr1));
        System.out.println();

        // Test Case 2:
        int[] arr2 = {-1, 0, 1, 2, 5, 6, 8};
        System.out.print(consecutiveNumbers(arr2));
        System.out.println();

        // Test Case 3:
        int[] arr3 = {-1, 3, 4, 5, 20, 21, 25};
        System.out.print(consecutiveNumbers(arr3));
    }
}
