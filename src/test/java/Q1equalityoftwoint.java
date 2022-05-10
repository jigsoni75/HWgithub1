public class Q1equalityoftwoint {

        public static void main(String[] strings) {

            int[] array1 = {2, 5, 7, 9, 11};
            int[] array2 = {2, 5, 7, 9, 11,};
            String state = "equal";
            System.out.println("the state of equality between array1 and array2 :");
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    state = "equal";
                } else {
                    state = "not equal";
                    break;
                }
            }
            if (state.equals("equal")) {
                System.out.println("the two array are equal.");
            } else {
                System.out.println("the two array are not equal.");
            }


        }

}
