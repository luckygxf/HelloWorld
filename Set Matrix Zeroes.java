public class Solution {
    public void setZeroes(int[][] matrix) {
    	int temp[][] = new int[matrix.length][matrix[0].length];
    	for(int i = 0 ; i < matrix.length; i++){
    		for(int j = 0; j < matrix[0].length; j++){
    			temp[i][j] = matrix[i][j];
    		}
    	}
    	for(int i = 0 ; i < matrix.length; i++){
    		for(int j = 0; j < matrix[0].length; j++){
    			if(temp[i][j] == 0)
    				setRowAndcColumn(matrix, i, j);
    		}
    	}
        
    }
    /**
     * 把第row行和第column列设为0
     * @param row
     * @param column
     */
    public void setRowAndcColumn(int matrix[][], int row, int column){
    	for(int i = 0; i < matrix[0].length; i++){
    		matrix[row][i] = 0;
    	}
    	for(int i = 0 ; i < matrix.length ; i++){
    		matrix[i][column] = 0;
    	}
    }
}