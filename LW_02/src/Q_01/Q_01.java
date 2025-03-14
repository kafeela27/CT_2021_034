package Q_01;


public class Q_01 {
        public static void main(String[] args) {

            int A=2,B=4,C=6,X=2,Y=8,r=5;

            //Q_01_a
            double Square_root1 = Math.sqrt(B * B + 4 * A * C);
            System.out.println("Square root of B^2+4AC is :" + Square_root1);
            //Q_01_b
            double Square_root2 = Math.sqrt(X + 4 * Math.pow(Y, 3));
            System.out.println("Square root of X + 4Y^3 : " + Square_root2 );
            //Q_01_c
            double cube_root = Math.cbrt(X * Y);
            System.out.println("Cube root of the product of X and Y : " + cube_root);
            //Q_01_d
            double area = Math.PI * Math.pow(r, 2);
            System.out.println("Area of a circle :" + area);

        }
    }



