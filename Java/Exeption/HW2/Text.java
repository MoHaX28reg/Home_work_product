package Java.Exeption.HW2;

public class Text {
    public class EmptyLineException extends Exception{
        public EmptyLineException(String message){
            super(message);
        }

    public void emptyLine(String text) throws EmptyLineException {            
        System.out.println(text);
        if (text == "") throw new EmptyLineException("Введено недопустимое значенае."); {
        }        
    } 
    
    
    }
}
