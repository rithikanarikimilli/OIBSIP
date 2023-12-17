package a3;
import java.util.Scanner;
class NumberGuessing{
    public static void main(String[] args) {
        int tries=0;
       
    Scanner sc=new Scanner(System.in);
    while(true){
 
         
        System.out.println("Enter a number between 1-100 you have 3 guesses :");
         
         
       int num=sc.nextInt();
         tries++;

       if(num==7){
           System.out.println("GUESSED RIGHT!!!!!!");
           System.out.println("It took you "+tries+" tries....");
           if(tries==3) {
        	   System.out.println("100 points");
           }
           else if(tries==2) {
        	   System.out.println("200 points");
           }
           else {
        	   
            	   System.out.println("300 points");
               }
               
           
   
           
           break;
           
    }
     
       else if(num<7)
       {
           System.out.println("ENTER A HIGHER NUMBER..GUESS AGAIN");
       }
       else{
           System.out.println("ENTER A LOWER NUMBER.. GUESS AGAIN");
       }
       if(tries==3){
           
           System.out.println("SORRY TRY AGAIN NEXT TIME");
           
           break;
       }
      
       
    }
       }
}
