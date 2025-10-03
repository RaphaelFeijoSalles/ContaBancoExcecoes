package exceptions;

public class LimitExceededException extends DomainException{
    public LimitExceededException(String msg){
        super(msg);
    }
}
