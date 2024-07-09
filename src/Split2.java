import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Split2 {
    public static void main(String[] args) {
        System.out.println("* exemploListaSplit2 *");
        String str = "Antonio, Cesar, Bruno, Daiane, Fabio";
        String[] arrOfStr = str.split(", ");
        for (String a : arrOfStr) {
            Arrays.sort(a.toCharArray());
            System.out.println(a);
        }
    }
}
