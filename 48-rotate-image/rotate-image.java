class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        //   step 1--transposing of the matrix but we are not creating a new array, we will awap then elemnts
        for(int row = 0; row<n; row++){
            for(int column = row+1; column< n; column++){
                // swapping the matrix  through diagonally only so we are taking upward digaoanl [i][j] to [j][i]
                int temp = matrix[row][column];
                matrix[row][column] = matrix[column][row];
                matrix [column][row] = temp;
            }
        }
        //  step 2 -- now reversing that transposed array to get rotated matrix by 90 degree
        for(int row = 0; row<n; row++){
            // starting the reverse 
            int startCol = 0;
            int endCol = n-1;
            while(startCol<=endCol){
                int temp = matrix[row][startCol];
                matrix[row][startCol] = matrix[row][endCol];
                matrix[row][endCol] = temp;
                startCol++;
                endCol--; 
            }
        }
    }
}