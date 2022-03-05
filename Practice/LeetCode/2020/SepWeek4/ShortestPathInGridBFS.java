//package SepWeek4;
import java.util.*;
public class ShortestPathInGridBFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int grid[][] = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        int k = sc.nextInt();  
        int lifes[][]=new int[m][n];
        
        for(int e[]: lifes){
            Arrays.fill(e, -1);
        }
        lifes[0][0]=k;
        int ans=findShortestPathBFS(grid, lifes, k);
        System.out.println(ans);
    }

    public static int findShortestPathBFS(int grid[][],int lifes[][],int k){
        int m=grid.length;
        int n=grid[0].length;
        Queue<Data> q=new LinkedList<>();
        int direction[][]={{0,1},{1,0},{-1,0},{0,-1}};
        Data initial=new Data(0,0,k,0);
        q.add(initial);
        while(!q.isEmpty()){
            Data d=q.poll();

            if(d.row == m-1 && d.col == n-1){
                return d.dist;
            }

            if(grid[d.row][d.col]!=0){
                d.life=d.life-1;
            }

            for(int i[]: direction){
                int nr=d.row+i[0];
                int nc=d.col+i[1];

                if( nr>=0 && nr<m && nc>=0 && nc<n && lifes[nr][nc]<d.life){
                    q.add(new Data(nr,nc,d.life,d.dist+1));
                    lifes[nr][nc]=d.life;
                }
            }            
        }
        return -1;
    }
    
}

class Data{
    int row;
    int col;
    int life;
    int dist;
    public Data(int row,int col,int life,int dist){
        this.row=row;
        this.col=col;
        this.life=life;
        this.dist=dist;
    }
}
