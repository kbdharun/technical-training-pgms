//Q6. Implement Infix to Postfix conversion using Stack

import java.util.Stack;
import java.util.Scanner;

public class InfToPosStack {
    // Function to check if a character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Function to check precedence of operators
    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an infix expression:");
        String infix = scanner.nextLine();
        scanner.close();

        Stack<Character> stack = new Stack<>();
        StringBuilder postfix = new StringBuilder();

        for (char c : infix.toCharArray()) {
            // If the character is an operand, append it to postfix
            if (!isOperator(c)) {
                postfix.append(c);
            } else {
                // If the stack is not empty and the precedence of the scanned operator is less than or equal to the top operator in the stack, pop and append to postfix
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                // Push the scanned operator to the stack
                stack.push(c);
            }
        }

        // Pop and append all remaining operators in the stack
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }

        System.out.println("Postfix expression: " + postfix);
    }
}

// Output:
// ➜  Day3 git:(main) ✗ javac InfToPosStack.java 
// ➜  Day3 git:(main) ✗ java InfToPosStack 
// Enter an infix expression:
// (((a+b)*c)/(D/E))+F
// Postfix expression: (((ab)c)*(D/E))/+F+

// Alternative code:
// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc=new Scanner(System.in) ;
// 		String str=sc.nextLine();
// 	//	System.out.println(str);
// 	//		System.out.print(str.length());
// 		System.out.println(itp(str));
	
	
// 	}
	
// 	static String itp(String str)
//     {
         
//         Stack<Character> st=new Stack<>();
//         StringBuilder res=new StringBuilder();
      
//         for(int i=0;i<str.length();i++)
//         {
            	
            
//             char c=str.charAt(i);
//             if(Character.isLetterOrDigit(c))
//                res.append(c);
//             else if(c==' '){}   
//             else if(c=='(')
//               st.push(c);
//             else if(c==')')
//             {
//                 while(!st.isEmpty() && st.peek()!='(')
//                    res.append(st.pop());
//                 st.pop();       
//             }
//             else{
//                 while(!st.isEmpty() && precedence(c)<=precedence(st.peek()))
//                     res.append(st.pop());
//                st.push(c);            
                
//             }
            
            
//         }
//         while(!st.isEmpty())
//           res.append(st.pop());
       
//      return res.toString();      
//     }
    
//     static int precedence(char c)
//     {
//         if(c=='+' || c=='-')
//           return 1;
//         if(c=='*' || c=='/')
//            return 2;
//         if(c=='^')
//          return 3;
//         return 0; 
//     }
// }
