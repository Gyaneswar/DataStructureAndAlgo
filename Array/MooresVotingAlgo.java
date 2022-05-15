//package Array;

public class MooresVotingAlgo {
    public static void main(String[] args) {
        int arr[] = {8,8,6,6,6,4,6};

        int count = 1, res = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[res] == arr[i])
                count++;
            else
                count--;

            if(count == 0){
                count = 1;
                res = i;
            }
        }


        //confirm the majority
        count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[res] == arr[i])
                count++;
        }

        if(count >= arr.length/2)
            System.out.println("Majority element : "+arr[res]);
        else 
            System.out.println("No majority element");

    }
}
