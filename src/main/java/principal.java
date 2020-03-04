import java.util.Arrays;

public class principal {

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 1, 2, 3, 4};
        Arrays.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] == arr[i + 1]) {
                k++;
            } else
                i = i - 1;
        }
        System.out.println(k);
    }
}

