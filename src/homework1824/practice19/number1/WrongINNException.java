package homework1.practice19.number1;

public class WrongINNException extends Exception {

    public WrongINNException(int inn){
        super("ИНН с номером "+ inn + " не действителен!");
    }


}
