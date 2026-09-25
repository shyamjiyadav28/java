

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {

            // Find minimum in current row
            int min = matrix[i][0];
            int col = 0;

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    col = j;
                }
            }

            // Find maximum in that column
            int max = min;

            for (int k = 0; k < m; k++) {
                if (matrix[k][col] > max) {
                    max = matrix[k][col];
                }
            }

            // Check lucky number
            if (min == max) {
                ans.add(min);
            }
        }

        return ans;
    }
}