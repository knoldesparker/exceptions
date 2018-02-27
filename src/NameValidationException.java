public class NameValidationException extends Exception {

    public NameValidationException(){
        super();
    }
    @Override
    public void printStackTrace(){
        System.out.println("Wrong name");
    }
}
