public class AllocateMinimumNumberOfPages {
    public static void main(String[] args) {
        int pages[] = {10,20,30,40};
        int k = 2;
    }

    public static int countMinPages(int pages[],int k,int n){        

        if(k == 1)
            return sum(pages,0,(n-1));

        if(n == 1)
            return pages[0];

        int res = Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            res = Math.min(res,Math.max(sum(pages,i,n-1),countMinPages(pages, k-1, i)));
        }

        return res;
    }

    public static int sum(int pages[],int startIndex,int endIndex){
        int sum = 0;
        for(int i=index;i<=endIndex;i++){
            sum += pages[i];
        }

        return sum;
    }
}
