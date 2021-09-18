class hourglassSumResult {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        int max = arr.get(0).get(0)+arr.get(0).get(1)+arr.get(0).get(2)+arr.get(1).get(1)+arr.get(2).get(0)+arr.get(2).get(1)+arr.get(2).get(1);
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int x = arr.get(i).get(j)+arr.get(i).get(j+1)+arr.get(i).get(j+2)+arr.get(i+1).get(j+1)+arr.get(i+2).get(j)+arr.get(i+2).get(j+1)+arr.get(i+2).get(j+2);
            max = Math.max(max, x);
            }
        }
        return max;
    }

}
