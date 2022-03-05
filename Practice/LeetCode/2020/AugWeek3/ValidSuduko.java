import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        int k=0;
        int l=0;
        for(int i=0;i<3;i++){            
            for(int j=0;j<3;j++){
                if(!subBox(board,l,k))
                    return false;
                k=k+3;
            }
            l=l+3;
            k=0;            
        }
        
        for(int i=0;i<9;i++){
            if(!rowColumn(board,i,0,true))
                return false;
        }
        
        for(int i=0;i<9;i++){
            if(!rowColumn(board,0,i,false))
                return false;
        }
        return true;
    }
    
    public boolean rowColumn(char [][]board,int starti,int startj,boolean row){
        HashSet<Character> set=new HashSet<>();
        if(row){
            for(int j=0;j<9;j++){
                if(board[starti][j]!='.' && !set.add(board[starti][j]))
                    return false;
            }
        }else{
            for(int i=0;i<9;i++){
                if(board[i][startj]!='.' && !set.add(board[i][startj]))
                    return false;
            }
        }
        return true;
    }
    
    public boolean subBox(char [][]board,int starti,int startj){
        HashSet<Character> set=new HashSet<>();
        
        for(int i=starti;i<starti+3;i++){
            for(int j=startj;j<startj+3;j++){
                if(board[i][j]!='.'){
                    if(!set.add(board[i][j]))
                        return false;
                }
            }
        }
        return true;
    }
}