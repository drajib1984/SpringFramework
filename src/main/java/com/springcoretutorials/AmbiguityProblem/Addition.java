package com.springcoretutorials.AmbiguityProblem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class Addition {
    private int a;
    private int b;

    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("The value of a:"+this.a);
        System.out.println("The value of b:"+this.b);
        System.out.println("Calling Constructor with int");
    }
    public Addition(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("The value of a:"+this.a);
        System.out.println("The value of b:"+this.b);
        System.out.println("Calling Constructor with double");
    }
    public Addition(String a, String b) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        System.out.println("The value of a:"+this.a);
        System.out.println("The value of b:"+this.b);
        System.out.println("Calling Constructor with string");
    }
    public void doSum(){
        System.out.println("The sum is "+(this.a+this.b));
    }

}
