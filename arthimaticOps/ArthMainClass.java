package arthimaticOps;

import java.util.Scanner;

class ArthematicOps {
    int a,b,c,q,r;
    void add(){
        System.out.println("Result of addition operation of "+a+" and "+b+" is "+(c=a+b));
    }
    void subst(){
        System.out.println("Result of substraction operation of "+a+" and "+b+" is "+(c=a-b));
    }
    void mult(){
        System.out.println("Result of multiplication operation of "+a+" and "+b+" is "+(c=a*b));
    }
    void div(){
        System.out.println("Result of division operation of "+a+" and "+b+" is "+(c=a/b));
    }
    void mod(){
        System.out.println("Result of division operation of "+a+" and "+b+" is "+(c = a % b));
    }

}

class ArthMainClass {
    public static void main(String[] args){
      int arth;
      Scanner s = new Scanner(System.in);
      ArthematicOps ao = new ArthematicOps();
      System.out.println("Enter the a value : ");
      ao.a = s.nextInt();
      System.out.println("Enter the b value : ");
      ao.b = s.nextInt();
      System.out.println("1.add, 2.subst 3.mult 4.div 5.mod ");
      System.out.println("Enter arthimetic opertions : ");
      arth = s.nextInt();
      switch (arth) {
        case 1:
            ao.add();
            break;
        case 2:
            ao.subst();
            break;
        case 3:
            ao.mult();
            break;
        case 4:
            ao.div();
            break;  
        case 5:
            ao.mod();
            break; 
        default:
            System.out.println("Invaild Operation selected ");
            break;
      }
    }
}
