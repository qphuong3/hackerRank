public class minimumSwapsArraySolution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int x = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != i+1) {
                int t = arr[i];
                int j = 0;
                for(; j < arr.length; j++) {
                    if(arr[j] == i+1) {
                        break;
                    }
                }
                arr[i]=arr[j];
                arr[j]=t;
                x++;
            }
        }
        return x;
    }
