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
System.out.println("randomIndex="+randomIndex);

//check to see if this is a new random name (randomIndex) or has been chosen before
boolean isInArray=false;  
 for (int index:randomArray){
   if (randomIndex==index)
    isInArray=true;
 }

//if have random name (randomindex) that's been shown before, this loop will find a new random name(randomindex) that hasn't been chosen before
while(isInArray==true && counter<21)
{
   randomIndex=ran.nextInt(21);
   System.out.println("new random index="+randomIndex);
 isInArray=false;  
 for (int index:randomArray){
   if (randomIndex==index)
    isInArray=true;
 }
}
   randomArray[i]=randomIndex;

    apcsaCourse[0]="Lucas";
    apcsaCourse[1]="Aayush";
    apcsaCourse[2]="Ben";
    apcsaCourse[3]="Smera";
    apcsaCourse[4]="Aryan";
    apcsaCourse[5]="Ivy";
    apcsaCourse[6]="Liam";
    apcsaCourse[7]="Evan";
    apcsaCourse[8]="Adriana";
    apcsaCourse[9]="Harsh";
    apcsaCourse[10]="Daniel";
    apcsaCourse[11]="Aleks";
    apcsaCourse[12]="Mohnish";
    apcsaCourse[13]="Zac";
    apcsaCourse[14]="AJ";
    apcsaCourse[15]="Alisha";
    apcsaCourse[16]="Vachan";
    apcsaCourse[17]="Vraj";
    apcsaCourse[18]="Aidan";
    apcsaCourse[19]="Matthew";
    apcsaCourse[20]="Yash";
   
   System.out.println("The random student is "+apcsaCourse[randomIndex]);

  System.out.print("Would you like another random student?");
  answer=in.next();
  i++;
  counter++;
  }
  System.out.println("Thanks, Goodbye");

  }
}