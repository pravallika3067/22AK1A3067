import java.util.Arrays;
public class ClosestSumToZero {

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 4, -3, 6, -2, 7, 5, -1};

        // Find andimport java.util.Arrays;
 display the two elements with sum closest to zero
        findClosestSumToZero(array);
    }

    public static void findClosestSumToZero(int[] array) {
        if (array.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        // Sort the array
        Arrays.sort(array);

        int left = 0;
        int right = array.length - 1;
        int closestSum = Integer.MAX_VALUE;
        int bestLeft = left;
        int bestRight = right;

        while (left < right) {
            int sum = array[left] + array[right];
            if (Math.abs(sum) < Math.abs(closestSum)) {
                closestSum = sum;
                bestLeft = left;
                bestRight = right;
            }

            // Move pointers based on the sum
            if (sum < 0) {
                left++;
            } else if (sum > 0) {
                right--;
            } else {
                // If the sum is zero, we've found the closest possible result
                break;
            }
        }

        System.out.println("The two elements with the sum closest to zero are:");
        System.out.println(array[bestLeft] + " and " + array[bestRight]);
        System.out.println("Their sum is: " + closestSum);
    }
}
