import java.util.Scanner;

public class CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter salary");
        int salary =scanner.nextInt();
        System.out.println("income tax amount is "+ incomeTax(salary));
    }

    public static float incomeTax(int salary) {

        if (salary <= 50000)
            return 0;
        else if (salary <= 60000)
            return (salary - 50000) *10/ 100;
        else if (salary <= 150000)
            return (salary - 60000)*20 / 100 + 1000;

        return (salary - 150000) *30/ 100+19000;
    }
}
