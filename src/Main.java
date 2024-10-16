import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ll = new Scanner(System.in);
        char[] grade = {'A', 'B', 'C', 'D', 'F'};
        double[] point = {4, 3, 2, 1, 0};
        double gpa = 0;
        String input = ll.next();
        for (int i = 0; i < grade.length; i++) {
            char gd = input.charAt(0);


            if (gd == grade[i]) {
                gpa = grade[i];
                if (input.length() > 1) {
                    char pm = input.charAt(1);
                    if (pm == '+') {
                        System.out.println(point[i] + 0.3);
                    } else if (pm == '-') {
                        System.out.println(point[i] - 0.3);
                    }
                }else {
                    System.out.println(point[i]);
                }
            }
        }
    }
}
