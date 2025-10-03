package exceptions;

public class NotEnoughBalanceException extends DomainException{
    public NotEnoughBalanceException (String msg){
        super(msg);
    }
}
