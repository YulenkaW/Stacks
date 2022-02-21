
package stackinterface;

import java.util.Scanner;
import java.util.Stack;


public class Stacks {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter a unch of code, and we`ll check for balaned braces");
        
        String code = keyboard.nextLine();
        
        System.out.println ("Your code has balanced braces: " +isBalanced (code));
        
          }
    public static boolean isBalanced(String input) {
        Stack<Character> bracesStack = new Stack <Character>();
        
        for (char character : input.toCharArray() ){
            if ( character == '(' || character == '['|| character == '{'){
               bracesStack.push (character);
               
            } else if (character == ')' || character == ']'|| character == '}' ) {
                if (bracesStack.isEmpty()){
                    return false;
                }
         char openingBrace = bracesStack.pop();
         if ((openingBrace == '(' && character !=')')
                 || (openingBrace =='['&& character !=']')
                 ||(openingBrace == '{' && character !='}')){
             return false;
         }
         
            }
            
        }
            return bracesStack.isEmpty();
    }
    
}
