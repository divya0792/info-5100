package Question1;

public class ExceptionGenerator {
    public void generateException(int[] arr) {
        int i = arr.length;
     try{
         while(i >= 0) {
             System.out.println(arr[i]);
             i--;
         }

     }catch(Exception e) {
         throw new MyIndexOutOfBoundException(0, arr.length - 1, i);
     }
    }
}
