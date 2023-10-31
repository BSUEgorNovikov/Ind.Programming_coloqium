import java.util.Vector;

public class FactorialCalc {
    private Vector<Long> containerOfFactorials;

    public FactorialCalc() {
        this.containerOfFactorials = new Vector<>();
    }

    public Vector<Long> getContainerOfFactorials() {
        return containerOfFactorials;
    }

    public void setContainerOfFactorials(Vector<Long> containerOfFactorials) {
        this.containerOfFactorials = containerOfFactorials;
    }

    public Vector<Long> calculateFactorials(long n) {
        long results = 1;

        for(int i = 1; i <= n; i++) {
            try {
                results *= i;
                this.containerOfFactorials.add(results);

                if (results < 0)
                {
                    throw new ArithmeticException();
                }
            } catch (ArithmeticException e) {
                System.out.println("Проблема вычисления факториала для числа:" + i);
                throw new ArithmeticException();
            }
        }

        return this.containerOfFactorials;
    }

    @Override
    public String toString() {
        return "Факториалы для заданного числа:" +
                containerOfFactorials;
    }
}
