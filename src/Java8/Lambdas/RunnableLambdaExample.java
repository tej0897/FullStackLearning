package Java8.Lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        // before Java 8
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable using Legacy");
            }
        };

        new Thread(runnable).start();

        // using Lambdas

        Runnable runnableLambdas = () -> {
            System.out.println("Inside Runnable using Lambda");
        };
        new Thread(runnableLambdas).start();


        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable using method Lambda - 1");
        new Thread(runnableLambda1).start();

    }
}
