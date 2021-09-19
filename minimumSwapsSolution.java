public class minimumSwapsSolution {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        Arrays.sort(nums);  
         
        boolean[] visited = new boolean[nums.length];
        Arrays.fill(visited, false);
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(visited[i] || map.get(nums[i]) == i)
                continue;  
            int j = i
            int cycle_size = 0;
            while(!visited[j]) {
                visited[j] = true;
                j = map.get(nums[j]);
                cycle_size++;
            }
            if(cycle_size > 0) {
                ans += (cycle_size - 1);
            }
        }
        return ans;
    }
}
