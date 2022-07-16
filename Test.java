import java.util.ArrayList;
import java.util.List;

public class Test {

    static List<String> consecutiveNumbers(int[] a) {
        int length = 1;
        List<String> list = new ArrayList<String>();


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
        
        int[] arr = {1, 3, 6, 7, 8, 12, 13, 14, 15, 21, 22, 23, 24, 31};
        System.out.print(consecutiveNumbers(arr));
    }
}
