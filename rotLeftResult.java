class rotLeftResult {

    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        for (int i = 0; i<d; i++) {
            a.add(a.get(0));
            a.remove(0); 
        }
        return a;
    }

}
