package arthimaticOps;

import java.util.Scanner;

public class ArthematicOps {
    int a,b,c;
    void add(){
        c=a+b;
    }
}

class ArthMainClass {
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      ArthematicOps ao = new ArthematicOps();
      System.out.println("Enter the a value : ");
      ao.a = s.nextInt();
      System.out.println("Enter the b value : ");
      ao.b = s.nextInt();
      ao.add();
    }
}
