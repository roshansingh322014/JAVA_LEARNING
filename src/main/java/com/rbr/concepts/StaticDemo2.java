package com.rbr.concepts;


class StaticVariable{

    static  int count=0;
    public void increament(){
        count++;
    }
}
public class StaticDemo2 {

    public static void main(String[] args) {
        StaticVariable sv1=new StaticVariable();
        StaticVariable sv2=new StaticVariable();

        sv1.increament();
        sv2.increament();

        System.out.println("sv1 count value is: "+ sv1.count);
        System.out.print("sv2 count value is: " + sv2.count);



    }
}
