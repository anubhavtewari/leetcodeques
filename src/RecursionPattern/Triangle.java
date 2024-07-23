package RecursionPattern;

/*
Print this pattern:
*
**
***
****

and

****
***
**
*
 */
public class Triangle {
    public static void main(String[] args) {
        triangle2(4, 0);
    }

    static void triangle2(int r, int c) {
        //base condition
        if (r == 0) {
            return;
        }
        if (c < r) {
            triangle2(r, c + 1);
            System.out.print("*"); // So instead of printing it before, print it later on. Means, when function call is returning, print it.
            //this line and line no. 25 will only execute when the above fun returns. Why? Becoz fun will return from above always before printing. When the fun has stopped executing, it will get removing from the stack, then the  print line will execute.
        } else { //it means we have reached end of line
            triangle2(r - 1, 0); // go to next row and reset the column
            System.out.println(); // print a new line to get to next row
        }
    }

    static void triangle(int r, int c) {
        //base condition
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("*");
            triangle(r, c + 1);
        } else { //it means we have reached end of line
            System.out.println(); // print a new line to get to next row
            triangle(r - 1, 0); // go to next row and reset the column
        }
    }
}

