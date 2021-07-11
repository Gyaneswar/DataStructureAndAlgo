public class PowerSet {
    public static void main(String[] args) {
        String str="abc";
        int len=str.length();
        int size=(int)Math.pow(2,str.length());

        for(int i=0;i<size;i++){
            //String bin=Integer.toBinaryString(i);
            //bin=String.format("%"+len+"s",bin);
            //System.out.println(bin);
            for(int k=0;k<len;k++){
                //if(bin.charAt(k)=='1')
                if((i & (1<<k))!=0)
                    System.out.print(str.charAt(k));
            }
            System.out.println();
        }
    }
}
//time complexity : 2^n * n