class arrayManipulationResult {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];
        for (List<Integer> i : queries) {
            arr[i.get(0) - 1] += i.get(2);
            if (i.get(1) != n){
                arr[i.get(1)] -= i.get(2);
            }
        }
        long maxval = 0;
        long itt = 0;
        for (long q : arr){
            itt += q;
            if (itt > maxval)
                maxval = itt;
        }
        return maxval;
    }
}
