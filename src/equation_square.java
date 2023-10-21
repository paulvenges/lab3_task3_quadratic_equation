import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class equation_square {
    public static void main(String[] args) throws IOException {
        double a = 0, b , c ,x1 ,x2;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (a==0) {
            System.out.print("a  can not be equal to zero: ");
            System.out.print("Enter the value of a : ");
            a = Float.parseFloat(reader.readLine());
        }

        System.out.print("Enter the value of b : ");
        b = Float.parseFloat(reader.readLine());

        System.out.print("Enter the value of c : ");
        c = Float.parseFloat(reader.readLine());

        double d= (b * b) - (4.0 * a * c);

        if (d> 0.0)
        {
            x1 = (-b + Math.sqrt(d)) / (2.0 * a);
            x2 = (-b - Math.sqrt(d)) / (2.0 * a);

            System.out.println("a = " + a + "b =" + b + "c =" + c );


            System.out.println("x1 =" + x1 + " and x2 =" + x2);
        }
        else if (d == 0.0)
        {
            x1 = -b / (2.0 * a);
            System.out.println("The root is " + x1);
        }
        else
        {
            System.out.println("Roots are not real.");
        }
    }
}






