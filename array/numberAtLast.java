import java.io.*;

class move {
public int[] posChange(int[] arr, int target){
        int i,j;

        for(i = 0, j = arr.length - 1; i<j; i++) {
                //System.out.println("i is " +i);
                while(arr[i] == target) {
                        //System.out.println("is 5");
                        if(arr[j] == target) {
                                j--;
                        }
                        else{
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                        }
                }
        }
        return arr;

}
}

public class numberAtLast {
public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {5,2,5,6,8,5,7,6,3,5,5};
        System.out.println("Enter the number to be moved to right  : ");
        int f = Integer.parseInt(br.readLine());
        move mv = new move();
        int[] sorted = mv.posChange(arr, f);
        for(int s : sorted) {
                System.out.print(s+"\t");
        }

}
}
