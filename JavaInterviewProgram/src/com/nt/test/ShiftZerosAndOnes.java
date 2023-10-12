package com.nt.test;

/*To shift all the 1s to the right side and all the 0s to the left side in an array,
you can use a two-pointer approach. Here's a Java program to do that:
*/public class ShiftZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 1, 0, 0, 1};
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            while (arr[left] == 0 && left < right) {
                left++;
            }

            while (arr[right] == 1 && left < right) {
                right--;
            }

            if (left < right) {
                // Swap arr[left] and arr[right]
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.print("Array after shifting 0s to the left and 1s to the right: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
