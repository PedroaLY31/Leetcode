public class Main {
    public static void main(String[] args) {

        int[] nums1 = {1,1,2,3,6,0,0};
        int m = 5;
        int[] nums2 = {2,5};
        int n = 2;
        int o = (m + n) - 1;


        for (int i = 0; i < nums1.length; i++) {

            while (m > 0) {

                if (nums2[n - 1] > nums1[m - 1]) {
                    System.out.println("O num2 é maior. Vou meter");
                    nums1[o] = nums2[n - 1];
                    nums2[n - 1] = 0;
                    n--;

                } else {
                    System.out.println("O num1 é maior ou igual. Vou meter");
                    nums1[o] = nums1[m - 1];
                    nums1[m - 1] = 0;
                    m--;
                }

                o--;

            }

        }

        if (m == 0 && n > 0) {

            for (o = o; o >= 0; o--) {
                nums1[o] = nums2[n - 1];
                n--;
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}