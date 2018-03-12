public class HelloWorld {

    public static void main(String[] args) {
        // Classes
        SayonaraClass sayonaraClass = new SayonaraClass();
        MyMathClass mathClass = new MyMathClass();

        // Variables
        int num1 = 2, num2 = 3;
        String name = "rae";

        // Display name
        System.out.println("hello abbey");

        // Add two numbers
        System.out.println(mathClass.addTwoNumbers(num1,num2));

        // Display name multiple times
        for(int ctr=0; ctr <5; ctr++){
            System.out.println("hello " + name);
        }

        // Display Goodbye
        sayonaraClass.printGoodbye();
    }
}
