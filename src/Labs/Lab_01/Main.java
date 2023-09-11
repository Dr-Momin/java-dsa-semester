package Labs.Lab_01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Peak");
        int peak = 0;

        int[] arr = {1, 1, 3, 4, 2, 3, 5, 7, 0};

        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                peak = arr[i];
            }
        }

        System.out.println(peak);

    }
}
