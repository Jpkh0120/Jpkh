// This program calculate the distance between two coordinates
// start class 
public class F3P01A_POH_KOK_HAO_LabTask7 { 
//method
   public static void main (String []  args) { 
   //x value of first coordinates
   double coordinate_x1 = 1; 
    //y value of first coordinates
   double coordinate_y1= 1;
   //x value of first coordinates
   double coordinat_x2 =1 ; 
   //y value of second coordinates
   double coordinate_y2 =1 ;
   //calculate distance between x2 and x1 
   double delta_x = coordinat_x2 - coordinate_x1 ; 
   //calculate distance between y2 and y2 
   double delta_y = coordinate_y2- coordinate_y1 ;
   //by using formula of distance calculate distance between two coordinates 
   double distance = Math.sqrt(Math.pow(delta_x,2) + Math.pow(delta_y,2));
   //print final answer of distance
   System.out.print ("Distance between two coordinates is: " +distance );
   //end method
   }
    
} //end class 