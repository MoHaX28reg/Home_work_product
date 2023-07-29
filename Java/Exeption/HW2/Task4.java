package Java.Exeption.HW2;


import java.util.Scanner;

public class Task4 {    
    public static void main(String[] args) {
        System.out.println("Введити что хоите: ");
        Scanner sc = new Scanner(System.in);
        try {            
            String text = sc.nextLine();
            Text1.emptyLine(text);
        } catch (EmptyLineException ex) {
            System.out.println(ex.getMessage());
        }
        sc.close();
    }   
}

class EmptyLineException extends Exception{
        public EmptyLineException(String message){
            super(message);
        }
    }

class Text1 {
    public static void emptyLine(String text) throws EmptyLineException {            
        System.out.println(text);
        if (text == "") throw new EmptyLineException("Введено недопустимое значенае."); {
        }  
}    
              
    } 
    
    
