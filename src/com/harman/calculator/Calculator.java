package com.harman.calculator;

public class Calculator {
    public static void main(String[] args) {
        Subraction subobj = new Subraction();
        Multiply mulobj = new Multiply();
        int x = 3;
        int y =2;
        int c = x +y;
        System.out.println(c);
       int subresult = subobj.sub2numbers(x,y);
        System.out.println(subresult);
        int mulresult = mulobj.multi2num(x,y);
        System.out.println(mulresult);



    }
}
