public class Q7Maximumandminimumvalue {

        public static void main(String args[]) {
            int arr[] = {2, 5, 4, 1, 3};
            int max = arr[0];
            int min = arr[0];

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];

                if (arr[i] < min)
                    min = arr[i];
            }
            System.out.println("Minimum value: " + min);
            System.out.println("Maximum value: " + max);
        }
}
