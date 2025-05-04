import java.util.Arrays;
import java.util.Collections;

public class ReOrdenar {

    public static int ordenarDesc(final int num) {
        String nS = String.valueOf(num);
        Character[] c = new Character[nS.length()];


        for (int i = 0; i < nS.length(); i++) {
            c[i] = nS.charAt(i);
        }

        Arrays.sort(c, Collections.reverseOrder());

        StringBuilder res = new StringBuilder();
        for (char car : c) {
            res.append(car);
        }

        return Integer.parseInt(res.toString());

    }
}