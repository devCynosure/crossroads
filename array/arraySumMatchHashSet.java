import java.io.*;
import java.lang.*;
import java.util.HashSet;
import java.util.Set;

class find {
public int[] findSum(int[] arr, int f){
        // System.out.println(arr[1]+" "+ f);
        Set<Integer> nums = new HashSet<>();
        for(int i = 0; i<arr.length; i++) {
                int num = arr[i];
                int match = f - num;
                if(nums.contains(match)) {
                        return new int[] {num,match};
                }else{
                        nums.add(num);
                }
        }
        return new int[0];
}
}

class arraySumMatchHashSet {
public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int[] arr = new int[5];
        int[] arr = {5,4,3,6,1};
        System.out.println("Enter the number to find matching sum : ");
        int f = Integer.parseInt(br.readLine());
        find fnd = new find();
        int[] res = fnd.findSum(arr, f);
        for(int i = 0; i < res.length; i++) {
                System.out.println(res[i]);
        }

}
}
