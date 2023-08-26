package Arrays;

public class MyArray2D {

    int[][] arr;

    MyArray2D(int row, int col){
        arr = new int[row][col];
    }

    public void insert(int rowIndex, int colIndex, int data){
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = 0; j <= colIndex; j++) {
                arr[i][j] = data;
            }
        }
    }






}
