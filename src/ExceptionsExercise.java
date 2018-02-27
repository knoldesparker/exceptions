// Exercise 1
/** Exception Exercise file Start */
public class ExceptionsExercise {
    public static void main(String[] args) {
        //Unchecked exception / runtime exception
        //Checked exceptions
        /*
        Catch the exceptions and be specific
         */
        try {
            testException();
            Thread.sleep(1000);
        } catch (InterruptedException eIE) {
            eIE.printStackTrace();
            System.out.println("Interrupted exception");
        }


        //Nested catch
        try {
            Thread.sleep(1000);

        } catch (InterruptedException eIE) {
            eIE.printStackTrace();
        }
        try{
            String[] strings = {"første string på plads 0", "anden string på plads 1"};
            System.out.println(strings[2]);
        } catch (IndexOutOfBoundsException iOOBE){
            System.out.println("Ikke noget på den plads");
        }


        System.out.println("Hej");
    try{
        int a = 10;
        int b = 0;
        double result = a / b;
    } catch (ArithmeticException aEE) {
        System.out.println("divided by z3r0");
        aEE.printStackTrace();

    }


    try{
        validateAge(17);
    } catch (AgeValidationException AVE){
        AVE.printStackTrace();
    }

    try{
        validateName("Bo");
    } catch (NameValidationException NVE){
      NVE.printStackTrace();
    }

    }

    public static void testException() throws InterruptedException
    {
        try {
            String[] strings = {"første string på plads 0", "anden string på plads 1"};
            System.out.println(strings[2]);
        } catch (IndexOutOfBoundsException iOOBE){
            System.out.println("Der er intet på den plads");
        }
    }

    public static void validateAge(int age) throws AgeValidationException
    {
        if(age<18)
        {
            throw new AgeValidationException();
        }
        else
        {
            System.out.print("All good");
        }
    }

    public static void validateName(String name) throws NameValidationException
    {
        if(name.length()<3)
        {
            throw new NameValidationException();
        }
    }
}
    /** Exception Exercise file Slut */

// Exercise 2
    //Create your own exception it could be Gender-/Age-/-Name-Exception.
        //extend exception and override the printStackTrace() method
        //catch the Exception and print the message you created!?!