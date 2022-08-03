
/**
 * Write a description of class totobola here.
 *
 * @author (Francisco Moreira)
 * @version (18/06/2019)
 */
import java.util.*;
  public class totobola
  {
     public static void main()
      { 
       Random numeroaleatorio = new Random();
       
       
       int array[]=new int [13];
       
       String[]Totobola1={"1.Porto x Arouca", "2.Maritimo x Sporting", "3.Académica x Nacional", "4.G.Vicente x Moreirense", "5.Penafiel x Rio Ave","6.Feirense x Braga B","7.SP.Covilhã x Trofense", "8.Oriental x Freamunde", "9.U.Madeira x Tondela", "10.Portimonense x V.Guimaraes B", "11.Espanhol x At.Madrid", "12.Man.Utd xTottenham", "13.Leixões x Atlético" };
       
       
       for(int i=0;i<13;i++){
            array [i] = numeroaleatorio.nextInt(3);
        }
       System.out.println("TOTOBOLA");
       for(int i=0;i<13;i++){
           if(array[i]==0){
               
               System.out.println(Totobola1[i]+"|x| | |");
            
            }else if(array[i]==1){
                System.out.println(Totobola1[i]+"| |x| |");
                
         }else{ 
            System.out.println(Totobola1[i]+"| | |x|");
        }
       
        
       
   }
   
 }
}
         
            
      
          
  


       
      
   
    


