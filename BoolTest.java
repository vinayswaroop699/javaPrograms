class BoolTest {
    public static void main(String args[]){
        boolean b;
        b = false;
        System.out.print("b is " + b);
        b = true;
        System.out.print("b is " + b);

        // a boolean value can control the if statement

        if(b) System.out.print("This is executed");

        b = false;

        if(b) System.out.print("This is not executed");

        //Outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
    
}
