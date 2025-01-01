public class Main {
    public static void main(String[] args) {

        int[] nums = {2,5,5,11};
        int target = 10;
        int[] indexes = new int[2];
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                System.out.println("Vou avaliar a posição " + i + " e " + j);
                System.out.println(nums[i] + " + " + nums[j]);

                if (nums[i] + nums[j] == target) {

                    indexes[0] = i;
                    indexes[1] = j;

                    System.out.println("Encontrei!");

                    found = true;
                    break;

                }
            }

            if (found) break;
        }
    }
}