/**RandomStudent Program
chooses a random student from a class
Latrice Wicker
3/16/2021
*/
import java.util.Random;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    //declare and intialize variables
    Scanner in=new Scanner(System.in);
    Random ran=new Random();
    int[] randomArray=new int[21]; 
    int randomIndex;
    String[] apcsaCourse=new String[21];
    int i=0;
    int counter=1;
    String answer="Y";
  
//Loops everytime the user indicates that they want to display a new random students name
while (counter<=randomArray.length && (answer.equals("Y")|| answer.equals("y")))
  {
   randomIndex=ran.nextInt(21);
   System.out.println("random index="+randomIndex);

//check to see if this is a new random name (randomIndex) or has been chosen before
boolean isInArray=false;  
 for (int index:randomArray){
   if (randomIndex==index)
    isInArray=true;
 }

//if have random name (randomindex) that's been shown before, this loop will find a new random name(randomindex) that hasn't been chosen before
while(isInArray==true && counter<randomArray.length)
{
   randomIndex=ran.nextInt(21);
   System.out.println("next random index="+randomIndex);
 isInArray=false;  
 for (int index:randomArray){
   if (randomIndex==index)
    isInArray=true;
 }
}
   randomArray[i]=randomIndex;

    apcsaCourse[0]="Student_1";
    apcsaCourse[1]="Student_2";
    apcsaCourse[2]="Student_3";
    apcsaCourse[3]="Student_4";
    apcsaCourse[4]="Student_5";
    apcsaCourse[5]="Student_6";
    apcsaCourse[6]="Student_7";
    apcsaCourse[7]="Student_8";
    apcsaCourse[8]="Student_9";
    apcsaCourse[9]="Student_10";
    apcsaCourse[10]="Student_11";
    apcsaCourse[11]="Student_12";
    apcsaCourse[12]="Student_13";
    apcsaCourse[13]="Student_14";
    apcsaCourse[14]="Student_15";
    apcsaCourse[15]="Student_16";
    apcsaCourse[16]="Student_17";
    apcsaCourse[17]="Student_18";
    apcsaCourse[18]="Student_19";
    apcsaCourse[19]="Student_20";
    apcsaCourse[20]="Student_21";
   
   System.out.println("The random student is "+apcsaCourse[randomIndex]);

  System.out.print("Would you like another random student?");
  answer=in.next();
  i++;
  counter++;
  }
  System.out.println("Thanks, Goodbye");

  }
}