//u10416021 張馨容
import java.util.Scanner;
import java.util.ArrayList;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    //Generating two intergers in the range 0-10 randomly.
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    //Create an arraylist
    ArrayList<Integer> list = new ArrayList<>();
	
    //Let user input the answer.
    System.out.print("What is " + number1 + " + " + number2 + "? ");
    int answer = input.nextInt(); 

    //Use while loop to judge the situation.
    while (number1 + number2 != answer) {
        System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        //Add the former answer to the arraylist
        list.add(answer);
        answer = input.nextInt();
        
        //Use if statement to know whether the answer are entered before. 
        if (list.contains(answer)) {
            System.out.println("You already entered " + answer);
        }
    }
    //If the answer is correct show this message.
    System.out.println("You got it!");
  }
}
