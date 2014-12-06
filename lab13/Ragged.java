public class Ragged {
    public static void main(String [] args)  {
        
        int[][] array= new int[5][];    //declare and allocate array containign five arrays
        for (int i=0; i<5; i++) {   //for loop that runs 5 times
            array[i]= new int[i*3+5];   //allocate space for inner arrays, starting at 5, differing by 3
                for (int j=0; j<array[i].length; j++)    {
                    array[i][j] = (int)(Math.random()*40);  //fill with random numbers from 0 to 39
                }
        }
        //print out array
        for(int i=0; i<5; i++)  {  
            for(int j=0; j<array[i].length; j++)  {
                System.out.print(array[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        
        //sort the array
        for (int m=0; m<5; m++) {
            selectionSort(array[m]);    //call this method to sort each line
            System.out.println();
        }
        
    }   //end of main method
    
    
    public static void selectionSort(int[] list) {
        for (int i=0; i<list.length-1; i++) {
            //find the minimum in the list [i... list.length-1]
            int currentMin= list[i];
            int currentMinIndex=i;
            
            for (int j=i+1; j<list.length; j++) {
                if (currentMin>list[j]) {
                    currentMin=list[j];
                    currentMinIndex=j;
                }
            }
            
            //swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i)   {
                list[currentMinIndex]=list[i];
                list[i]= currentMin;
            }
        }
        for (int j=0;j<list.length;j++)    {   //loop that print out all the values inputed
            System.out.print(list[j]+"  ");
        }
    }
    
    
    
}   //end of class