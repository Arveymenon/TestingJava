package LeetCode;

public class ValidSudoku {
    

    public ValidSudoku(){

        String[][] sudoku = new String[][] {
            new String[] {"8","3",".",".","7",".",".",".","."},
            new String[] {"6",".",".","1","9","5",".",".","."},
            new String[] {".","9","8",".",".",".",".","6","."},
            new String[] {"8",".",".",".","6",".",".",".","3"},
            new String[] {"4",".",".","8",".","3",".",".","1"},
            new String[] {"7",".",".",".","2",".",".",".","6"},
            new String[] {".","6",".",".",".",".","2","8","."},
            new String[] {".",".",".","4","1","9",".",".","5"},
            new String[] {".",".",".",".","8",".",".","7","9"}
        };

        boolean op = true;

        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(sudoku[i][j] != "."){
                    boolean row = this.checkRow(sudoku,i,j);
                    boolean col = this.checkCol(sudoku,i,j);
                    boolean block = this.checkBlock(sudoku,i,j);
                    if((row || col || block)){
                        op = false;
                        break;
                    }
                }
            }
        }

        System.out.println(op);

    }

    private boolean checkRow(String [][] board, int i, int j){
        int k=0;
        while(k < 9){
            if(j != k && board[i][k] == board[i][j])
                return true;
            k++;
        }
        return false;
    }
    
    private boolean checkCol(String [][] board, int i, int j){
        int k=0;
        while(k < 9){
            if(i != k && board[k][j] == board[i][j])
                return true;
            k++;
        }
        return false;
    }
    
    private boolean checkBlock(String [][] board, int i, int j){

        int iStart = (i/3) * 3, jStart = (j/3)*3;
        int iEnd = iStart + 2, jEnd = jStart + 2;

        for(int x = iStart; x <= iEnd; x++){
            for(int y = jStart; y <= jEnd; y++){

                if(i != x && j != y && 
                    board[i][j] == board[x][y]){
                        return true;
                }

            }
        }

        return false;
    }

}
