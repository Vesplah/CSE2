//Ryan Judge

//December 5

//hw11 program 2

//This program is designed to help us manipulate arrays
import java.util.Arrays;

//givens
public class MatrixSorter{
  public static void main(String arg[]){
    int mat3d[][][];
    mat3d=buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is "+
  			findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
    
   }
   
   
   
public static int[][][] buildMat3d ()
{
    int[][][] mainArray= new int [3][0][0]; //declaring the array with arrays inside of it
    for (int x=0; x<mainArray.length; x++)
    {
        mainArray[x]=new int [x*2+3][];
        for (int y=0; y<((x*2)+3); y++)
        {
            mainArray[x][y]=new int [x+y+1];
            for (int z=0; z<x+y+1; z++)
            {
                mainArray[x][y][z] = (int)(Math.random()*99+1); //random number generator
            }
        }
    }
    return mainArray;
}
   
   //find min
public static int findMin(int [][][] mainArray)
{
int min = mainArray[0][0][0];//min is the first value
   for (int x=0; x<3; x++)//search the array
   {
       for (int y =0; y<(x*2)+3; y++)
       {
           for (int z =0; z < x+y+1; z++)
           {
               if (mainArray[x][y][z] < min)
               {
                   min = mainArray[x][y][z];//replaces a value if it finds a smaller one
               }
           }
       }
       
   }
   return min;
}
//printing the arrays
 public static void show(int [][][] mainArray)
 {
     for (int x =0; x<3; x++)
     {
         System.out.println("-----------------------Slab "+ (x+1));//seperate the slabs
         for (int y =0; y<mainArray[x].length; y++)
         {
             for (int z =0; z < mainArray[x][y].length; z++)
             {
                 System.out.print(mainArray[x][y][z]+"  "); //prints the individual elements
             }
             System.out.println();
        }
        System.out.println();
     }
     System.out.println("--------------------------");
 }//end method
//sorting arrays
public static void sort(int [][] columns)   
{
    for (int x=0; x<3; x++)  {//loops and sorts through the arrays
               for (int y=0; y<(x*2)+3; y++ )
               {
                 for (int z=0; z<x+y+1; z++)  
                  {
                     for(int a=z+1; z<x+y+1; a++) 
                     {   
                        if (columns[y][z]<columns[y][z]) 
                        {    
                            int temp= columns[y][z]; //temporary values for storage  
                            columns[y][z]=columns[y][a];  //swtich values
                            columns[y][a]=temp;    //make sure temp is the correct value
                         }
                     }
                  }
               }
        }
         for (int b=1; b<columns.length; b++)  //sorting the columns 
         {
             int [] temp=columns[b];   //temporary arrays for storage
             int c=columns[b][0];  
             int row=b; 
             while(row>0 && columns[row-1][0]>c)  
             {
                columns[row]=columns[row-1];  //reseting values
                row--;  //limits the loop
             }
                columns[row]=temp; //replace the value
            
        }
    } //method  

  
}//class
