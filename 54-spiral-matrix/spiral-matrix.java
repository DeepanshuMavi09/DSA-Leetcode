class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        int startingRow =0;
        int endingRow = m-1;
        int startingColumn = 0;
        int endingColumn = n-1;

        while(startingRow <= endingRow && startingColumn<= endingColumn){
            // row wise left to right ---- starting col to ending column
            for(int column = startingColumn; column<=endingColumn; column++){
                result.add(matrix[startingRow][column]);
            } 
            startingRow++;
            // column wise top to bottom----- startingRow to endingRow
            for(int row = startingRow; row<=endingRow; row++){
                result.add(matrix[row][endingColumn]);
            } 
            endingColumn--;
            // row wise right to left ----- endingColumn to startingColumn
            if (startingRow <= endingRow) {
                for (int column = endingColumn; column >= startingColumn; column--) {
                    result.add(matrix[endingRow][column]);
                } 
                endingRow--;
            }
            //  column bottom to top -----endingRow to startingRow 
            if (startingColumn <= endingColumn) {
                for (int row = endingRow; row >= startingRow; row--) {
                    result.add(matrix[row][startingColumn]);
                } 
                startingColumn++;
            }
        }
        return result;
    }
}