class Result {
    public static void minimumBribes(List<Integer> q) {
        int min = 0;
        for (int i = q.size() - 1; i >= 0; i--) {
            if (q.get(i)- (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
            for(int j = Math.max(q.get(i)-2, 0); j < i; j++){
                if (q.get(j) > q.get(i)) {
                    min++;
                }
            }
        }
        System.out.println(min);
    }
}