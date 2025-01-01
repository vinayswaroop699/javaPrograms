/* Demonstrates the if.
   call this fike  "ifSample.java".
*/
class IfSample {
    public static void main(String args []) {
        int x, y;
        x=10;
        y=12;
        if(x<y) System.out.println("x is less than y");

        x=x*2;
        if(x == y) System.out.println("x now equals to y");

        x=x*2;
        if(x > y) System.out.println("x now greater than y");

        //this won't display anything
        if(x == y) System.out.println("You won't see this");
      }

}