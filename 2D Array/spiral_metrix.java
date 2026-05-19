class spiral_metrix{
    
    public static void print_spiral_matrix (int arr [][]){
        int sr = 0; // start row
        int er = arr.length - 1; // end row
        int sc = 0; //start column
        int ec = arr[0].length - 1; // end column
        
        while (sr <= er && sc <= ec) {
            // print top column is variable
            for (int j = sc; j <= ec; j++){
                System.out.print(arr[sr][j]+" ");
            }
            
            // print right row is variable
            for (int i = sr + 1; i <= er; i++){ // sr + 1 because first element was printed in top
                System.out.print(arr[i][ec]+" ");
            }
            
            // print bottom
            for (int j = ec - 1; j >= sc; j--){
                System.out.print(arr[er][j]+" ");
            }
            
            // print left
            for (int i = er -1; i >= sr + 1; i--){
                System.out.print(arr[i][sc]+" ");
            }
            
            sc ++; sr ++; er --; ec--;
            
        }
    }
    
    public static void main (String args[]){
      
      int matrix [][] = {
          {1,2,3,4},
          {5,6,7,8},
          {9,10,11,12},
          {13,14,15,16}
      };  
      
      print_spiral_matrix(matrix);
    }
    
}
