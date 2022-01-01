
package LinkedinTutorial2;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args)
    {
        String question = "Question";
    String choiceOne = "one";
    String choiceTwo = "two";
    String choiceThree = "three";
    
    String correctAnswer = "two";
    
    //write a print statement asking the question
        System.out.println(question);
        //write print statement giving the answer choice
        System.out.println("1. " + choiceOne);
        System.out.println("2. " +choiceTwo);
        System.out.println("3. " +choiceThree);
        
        //Have the user input answer
        Scanner scanner = new Scanner(System.in);
        //Retrive the user input
        String input = scanner.next();
        
        //if the user's input matches the correct answer
        if(correctAnswer.equals(input.toLowerCase())){
            
            System.out.println("Congrats!!!!  Correct Answer");
        }else{
            System.out.println("Correct anwser is " + correctAnswer );
        }
    }
     
    
}
