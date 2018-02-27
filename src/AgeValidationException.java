public class AgeValidationException extends Exception {
    public AgeValidationException(){
        super();
    }
    @Override
    public void printStackTrace(){
        System.out.println("Wrong age");
    }
}
