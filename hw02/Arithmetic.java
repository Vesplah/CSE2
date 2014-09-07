//Ryan Judge
//7 September 2014
//Arithmetic HW02

//define class
public class Arithmetic{
    //Add main method
    public static void main(String[] args) {
        
        //number and cost of socks
        int nSocks=3;
        double sockCost$=2.58;
        
        //Number and cost of glassess
        int nGlasses=6;
        double glassCost$=2.29;
    
        //number and cost of enevlopes
        int nEnvelopes=1;
        double envelopeCost$=3.25;
    
      //Declare tax
      double taxPercent=0.06;
      
     //output variables
      double totalsockCost$;
      double totalsocktax$;
      double totalsockcosttax$;
      
      double totalglassCost$;
      double totalglasstax$;
      double totalglasscosttax$;
      
      double totalenvelopeCost$;
      double totalenvelopetax$;
      double totalenvelopecosttax$;
      
      double totalCostnotax$;
      double totalCostwithtax$;
      double totaltaxcost$;
    
      
      //Arithmetic
      totalsockCost$=sockCost$*nSocks; //total sock cost
      totalsocktax$=totalsockCost$*taxPercent; //total sock tax
      totalsockcosttax$=totalsockCost$+totalsocktax$; //Final sock cost
      
      totalglassCost$=glassCost$*nGlasses; //  total glass cost
      totalglasstax$=totalglassCost$*taxPercent; //total tax on glass
      totalglasscosttax$=totalglassCost$+totalglasstax$; //Final cost of glasses
      
      totalenvelopeCost$=envelopeCost$*nEnvelopes; //total envelope cost
      totalenvelopetax$=totalenvelopeCost$*taxPercent; //total envelope tax
      totalenvelopecosttax$=totalenvelopeCost$+totalenvelopetax$; //Final cost for envelopes
      
      totalCostnotax$=totalsockCost$+totalglassCost$+totalenvelopeCost$;// total cost w/out tax
      totaltaxcost$=totalCostnotax$*taxPercent; //total cost of tax
      totalCostwithtax$=totalCostnotax$+totaltaxcost$; //total cost w/ tax
      totaltaxcost$=totalsocktax$+totalglasstax$+totalenvelopetax$; //combined tax
      
      //Displying results
      
      System.out.println("Total cost of socks without taxis " + totalsockCost$);
      System.out.println("Total tax on socks is " + totalsocktax$);
      System.out.println("Total cost of socks with tax is " +totalsockcosttax$);
      
      System.out.println("Total cost of glasses without tax is " + totalglassCost$);
      System.out.println("Total tax on glasses is " + totalglassCost$);
      System.out.println("Total cost of glasses with tax is " + totalglasscosttax$);
      
      System.out.println("Total cost of envelopes without tax is " +totalenvelopeCost$);
      System.out.println("Total tax on envelopes is " +totalenvelopetax$);
      System.out.println("Total cost of envelopes with tax is "+  totalenvelopecosttax$);
      
      System.out.println("Total tax on everything is " +totaltaxcost$);
      System.out.println("Total cost of everything without tax is " +totalCostnotax$);
      System.out.println("Total cost of everything with tax is " +totalCostwithtax$);
        
    
    }
        }
    
    
    
    