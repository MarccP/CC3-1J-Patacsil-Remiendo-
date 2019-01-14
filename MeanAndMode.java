package meanandmode;
import java.util.*;

public class MeanAndMode {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter how many grades : ");
        
        int newSize = sc.nextInt();
       
        Input(newSize);
        System.out.println("---------------------------------");
        System.out.println("");
                   
    }
    public static void Input(int sizeLength){
        int[] size;
        size = new int[sizeLength];
        int sum = 0;
        
        for(int i = 0;i < size.length;i++){
            System.out.print("Enter Grade for element "+(i)+" : " );
            int grade = sc.nextInt();         
            size[i] = grade;           
        }
        for(int x : size) sum+=x;
        
        
        Arrays.sort(size);
        System.out.println("---------------------------------");
        System.out.println(" The Sorted Dataset : ");
        System.out.print("{ ");
        for(int x = 0;x < size.length;x++){
            
            System.out.print(" "+size[x]);
        }
        System.out.print(" }");
        System.out.println("");
        System.out.println("The size of the array is : "+size.length);
        
        System.out.println("---------------------------------");
        
        System.out.print("The mean of the grade is : " +getMean(size.length,sum));
        
        System.out.println();
        
        System.out.print("The mode is : "+getMode(size));
        
        System.out.println();
        
      
    }
    
    
    public static double getMean(int numberSize,int grade){
        double mean = grade / numberSize;
        return mean;
    }
    
    public static int getMode(int[] test){
        int mode = 1;
        int maxCount = 0;
        
        for (int i = 0; i < test.length; i++) {
        int value = test[i];
        int count = 1;
        for (int j = 0; j < test.length; j++) {
            if (test[j] == value) count++;
            if (count > maxCount) {
                mode = value;
                maxCount = count;
            }
        }
    }
    return mode;
}
        
        
    
}


 
    

