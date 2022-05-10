public class Q5CommonElementsInArray {

    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,10,12,};
        int[] arr2 = {5,6,7,8,12,14,};
        for (int j : arr1) {
            for (int k : arr2) {
                if (j == k) {
                    System.out.println(j);

                }
            }

        }
    }
}
