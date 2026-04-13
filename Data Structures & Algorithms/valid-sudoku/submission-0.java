class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int row=0;row<9;row++){
          Set<Character> checkingSet = new HashSet<>();
          for(int i=0;i<9;i++){
            if(board[row][i]=='.') continue;
            else{
                if(checkingSet.contains(board[row][i])) return false;
                checkingSet.add(board[row][i]);
            }
            
          }
        }

        for(int col=0;col<9;col++){
          Set<Character> checkingSet = new HashSet<>();
          for(int i=0;i<9;i++){
            if(board[i][col]=='.') continue;
            else{
            if(checkingSet.contains(board[i][col])) return false;
            checkingSet.add(board[i][col]);
            }
          }
        }

        for(int sq_row=0;sq_row<9;sq_row+=3){
            for(int sq_col=0;sq_col<9;sq_col+=3){
                Set<Character> checkingSet = new HashSet<>();
                for(int i=sq_row;i<sq_row+3;i++){
                    for(int j=sq_col;j<sq_col+3;j++){
                        if(board[i][j]=='.') continue;
                        else{
                        if(checkingSet.contains(board[i][j])) return false;
                        checkingSet.add(board[i][j]);
                        }
                    }
                }
            }
        }
        return true;


    }
}
/*
Brute force?
get all rows , do check
get all columns, do check

get 3x3 matrix
- 

do check
- add chars into set
- if set already contains char, return false
*/