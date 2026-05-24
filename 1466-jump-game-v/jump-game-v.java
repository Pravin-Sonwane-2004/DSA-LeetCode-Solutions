class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp = new int[n];

        int answer = 1;

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, dfs(arr, d, i, dp));
        }

        return answer;
    }

    private int dfs(int[] arr, int d, int index, int[] dp) {
        if (dp[index] != 0) {
            return dp[index];
        }

        int maxJumps = 1;
        int n = arr.length;

        // jump left
        for (int step = 1; step <= d; step++) {
            int next = index - step;

            if (next < 0) {
                break;
            }

            if (arr[next] >= arr[index]) {
                break;
            }

            maxJumps = Math.max(maxJumps, 1 + dfs(arr, d, next, dp));
        }

        // jump right
        for (int step = 1; step <= d; step++) {
            int next = index + step;

            if (next >= n) {
                break;
            }

            if (arr[next] >= arr[index]) {
                break;
            }

            maxJumps = Math.max(maxJumps, 1 + dfs(arr, d, next, dp));
        }

        dp[index] = maxJumps;
        return dp[index];
    }
}