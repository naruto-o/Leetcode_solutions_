class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i = 1;i<points.length;i++){
            int x = Math.abs(points[i][0]- points[i-1][0]);
            int y = Math.abs(points[i][1]- points[i-1][1]);
            int temp = Math.max(x,y);
            ans+=temp;
        }
        return ans;
    }
}
