import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to sort (separated by space):");
        String input = sc.nextLine();
        String[] parts = input.split(" ");

        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Choose algorithm: (1) Quick Sort  (2) Bubble Sort");
        int choice = sc.nextInt();

        if (choice == 1) {
            QuickSort.quickSort(arr, 0, arr.length - 1);
            System.out.println("Sorted by Quick Sort:");
        } else if (choice == 2) {
            BubbleSort.bubbleSort(arr);
            System.out.println("Sorted by Bubble Sort:");
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println(Arrays.toString(arr));
    }
}
