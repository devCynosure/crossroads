import java.lang.*;
import java.io.*;

class arraySumMatch{
  public static void main(String[] args) throws IOException{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int s,found=0;
    s = Integer.parseInt(br.readLine());
    int[] arr = {5,5,3,2,5};

    for(int i=0; i< ( arr.length -1 ) && found == 0 ; i++){
      for(int j = i+1; j< arr.length; j++){
        if(arr[i] + arr[j] == s){
          System.out.println("Found at arr["+i+"] + arr["+j+"] = " + arr[i] +" + "+ arr[j] + " = " + (arr[i]+arr[j]) +"\n");
          found = 1;
          break;
        }

      }
    }
    if(found == 1){
      System.out.println("Sum found..");
    }
    else{
      System.out.println("Sum not found..");
    }
  }
}
