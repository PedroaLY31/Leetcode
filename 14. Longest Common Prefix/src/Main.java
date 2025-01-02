import com.sun.jdi.IntegerValue;

public class Main {
    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        String out = "";
        boolean notSame = true;
        int minLenght = Integer.MAX_VALUE;

        for (String str : strs) {

            if (str.length() < minLenght) {

                minLenght = str.length();
            }
        }

        for (int j = 0; j < minLenght; j++) {

            for (int i = 0; i < strs.length - 1; i++) {

                if (strs[i].charAt(j) != strs[i + 1].charAt(j)) {

                    notSame = false;
                }
            }

            if (notSame) {
                out += strs[0].charAt(j);
            }

        }

        System.out.println(out);
    }
}