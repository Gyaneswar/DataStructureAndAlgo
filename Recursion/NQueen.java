import java.util.Arrays;

public class NQueen {

    public static void main(String[] args) {
        
    int board[][]={{0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0},
                    {0,0,0,0}};
        NQ(board,0);
        for(int i=0;i<4;i++)
        System.out.println(Arrays.toString(board[i]));
    }

    public static boolean NQ(int board[][],int row){
    
        if(row>=4){
            return true;
        }
            
        
        for(int i=0;i<4;i++){
            if(isValid(board, row, i)){
                board[row][i]=1;
                if(NQ(board, row+1)== true)
                    return true;
                board[row][i]=0;
            }            
        }
        return false;
        
    }

    public static boolean isValid(int board[][],int row,int col){
        //check col
        for(int i=0;i<4;i++){
            if(board[i][col]==1 && i!=row)
                return false;
        }
        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]==1 && i!=row && j!=col){
                return false;
            }
        }

        for(int i=row,j=col;i<4 && j<4;i++,j++){
            if(board[i][j]==1 && i!=row && j!=col){
                return false;
            }
        }

        for(int i=row,j=col;i>=0 && j<4;i--,j++){
            if(board[i][j]==1 && i!=row && j!=col){
                return false;
            }
        }

        for(int i=row,j=col;i<4 && j>=0;i++,j--){
            if(board[i][j]==1 && i!=row && j!=col){
                return false;
            }
        }

        return true;
    }
    
}
