class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] left= new int[n];
        int[] right = new int [m];
        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){

                
                left[i]=1;
                right[j]=1;

            }
        }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(left[i]==1 || right[j]==1){
                    matrix[i][j] =0;
                }

            }
        }
        
    }
}