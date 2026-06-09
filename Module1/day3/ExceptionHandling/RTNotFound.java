package Module1.day3.ExceptionHandling;

public class RTNotFound {

    public static class RunTimeNotFound extends RuntimeException{
        public RunTimeNotFound(String msg){
            super(msg);
        }
    }
}
