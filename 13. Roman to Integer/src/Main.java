public class Main {
    public static void main(String[] args) {

        String s = "MCMXCIV";
        int n = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            switch (s.charAt(i)) {
                case 'M': n += 1000; break;
                case 'D': n += 500; break;
                case 'C':
                    if (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        n -= 100; break;
                    } else {
                        n += 100; break;
                    }
                case 'L': n += 50; break;
                case 'X':
                    if (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        n -= 10; break;
                    } else {
                        n += 10; break;
                    }
                case 'V': n += 5; break;
                case 'I':
                    if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        n -= 1; break;
                    } else {
                        n += 1; break;
                    }
            }
        }

        switch (s.charAt(s.length() - 1)) {
            case 'M': n += 1000; break;
            case 'D': n += 500; break;
            case 'C': n += 100; break;
            case 'L': n += 50; break;
            case 'X': n += 10; break;
            case 'V': n += 5; break;
            case 'I': n += 1; break;
        }

        System.out.printf(s + " is " + n);

    }
}