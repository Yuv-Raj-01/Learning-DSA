import java.util.Scanner;

public class two_d_input_output {
    
    public static void input_2d(int arr[][]){
        // no of row
        int n = arr.length;
        // no of conumn
        int m = arr[0].length;
        
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++){
                System.out.print("Please enter value of arr [" +i + "]["+ j+ "]: ");
                arr [i][j] = sc.nextInt();
            }
        }
    }
    
    public static void print_2d(int arr[][]){
        // no of row
        int n = arr.length;
        // no of conumn
        int m = arr[0].length;
        
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++){
                System.out.print(arr [i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean search (int arr[][], int target){
        
        for (int i = 0; i < arr.length; i ++){
            for (int j = 0; j < arr[0].length; j++){
                if (arr[i][j]== target){
                System.out.println(target +" found at index : "+i+","+j);
                return true;   
                }
            }
        }
        System.out.println(target + " not found");
        return false;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter the number rows of : ");
        int n = sc.nextInt();
        System.out.print("Please enter the number column of : ");
        int m = sc.nextInt();
        
        int matrix [][] = new int [n][m];
        
        // for input
        input_2d (matrix);
        
        // for output
        print_2d (matrix);

        // search
        search (matrix, 0);
        
    }
}