https://leetcode.com/problems/set-matrix-zeroes/
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer>x  = new ArrayList<>();
        ArrayList<Integer>y = new ArrayList<>();
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    x.add(i);
                    y.add(j);
                }
            }
        }
        for(int i = 0;i<x.size();i++){
            int index = x.get(i);
            for(int j = 0 ; j<matrix[0].length;j++){
                matrix[index][j]=0;
            }
        }
           for(int i = 0;i<y.size();i++){
            int index = y.get(i);
            for(int j = 0 ; j<matrix.length;j++){
                matrix[j][index]=0;
            }
        }
    }
}
