package RecursionPattern;

public class PrintTriangle {

        public static void main(String[] args) {
            int lines = 4; // Number of lines to print
            printTriangle(lines);
        }

        public static void printTriangle(int lines) {
            if (lines == 0) {
                return;
            }
            printTriangle(lines - 1);
            printStars(lines);
            System.out.println();
        }

        public static void printStars(int stars) {
            if (stars == 0) {
                return;
            }
            System.out.print("* ");
            printStars(stars - 1);
        }
    }
