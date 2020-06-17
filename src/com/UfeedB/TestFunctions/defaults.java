package com.UfeedB.TestFunctions;

public class defaults {
    @FunctionalInterface
    interface StringOperation{
        int getAmount();

        default void operate(String text){
            int x=getAmount();
            while (x-- >0){
                System.out.println(text);
            }
        }
    }

    @FunctionalInterface
    interface DoSomething{
        void take(String text);

        default void execute(int numRepeat, String Print){
            while (numRepeat-- >0){
                System.out.print(numRepeat+": ");
                take(Print);
            }
        }
        default void otherMethod(){

        }
    }

    public static void main(String[] args) {
        StringOperation six=()->6;
        six.operate("DoSomething");

        DoSomething five=Print-> System.out.println(Print);
        five.execute(5,"Test");
    }
}
