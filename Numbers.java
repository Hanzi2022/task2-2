/* Online Java Compiler and Editor */
public class Numbers{

     public static void main(String []args){
        int[] arr = {1,2,3,4,5};
        System.out.println(Calculate(arr,6));
     }
     public static String Calculate(int [] array, int sum) {
         int a=-1;
         int b=-1;
         for (int i=0;i<array.length-1;i++){
             for (int j=i+1;j<array.length;j++){
                 if (array[i]+array[j]==sum) {
                     a=i;
                     b=j;
                     break;
                 }
             }
         }
         return "["+array[a]+", "+array[b]+"]";
     }
}