package six_kyu.diamond;

import java.util.stream.Stream;

/**
 * Created by Hawk on 2017-04-18.
 */
public class Diamond {
    private static int increment;
    private static StringBuffer result;

    public static String print(int diamonds) {

        result = new StringBuffer();
        increment = 0;

        if (diamonds > 0 && diamonds % 2 != 0) {
            int diamond = 1;
            while(diamond >=1){
                addDiamond(diamonds, diamond, result);
                increment +=2;
                diamond += (increment >= diamonds) ? -2 : 2;
            }
            return result.toString();
        } else {
            return null;
        }
    }

    private static void addDiamond(int diamonds, int diamond, StringBuffer result) {
        String starts = addGap(diamonds,diamond);

            for (int i = 0; i < diamond; i++) {
                starts += "*";
            }

        result.append(starts + "\n");
    }
    private static String addGap(int diamonds, int diamond) {
        String gab = "";
        int totalGab = (diamonds - diamond)/2;
        for(int i = 0; i < totalGab; i++){
            gab += " ";
        }
        return gab;
    }
}
