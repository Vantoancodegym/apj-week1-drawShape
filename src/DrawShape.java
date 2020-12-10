public class DrawShape {
    public static void main(String[] args) {
        System.out.println("Draw rectangle");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Draw triangle botton-left");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Draw triangle top-left");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("Draw isosceles triangle");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }

    }
}
