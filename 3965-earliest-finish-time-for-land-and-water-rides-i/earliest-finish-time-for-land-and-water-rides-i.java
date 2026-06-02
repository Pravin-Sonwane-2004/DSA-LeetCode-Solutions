class Solution {
    public int earliestFinishTime(int[] landStartTime,
                                  int[] landDuration,
                                  int[] waterStartTime,
                                  int[] waterDuration) {

        int n = landStartTime.length;
        int m = waterStartTime.length;

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                // Land -> Water
                int landFinish = landStartTime[i] + landDuration[i];
                int waterBegin = Math.max(landFinish, waterStartTime[j]);
                ans = Math.min(ans, waterBegin + waterDuration[j]);

                // Water -> Land
                int waterFinish = waterStartTime[j] + waterDuration[j];
                int landBegin = Math.max(waterFinish, landStartTime[i]);
                ans = Math.min(ans, landBegin + landDuration[i]);
            }
        }

        return ans;
    }
}