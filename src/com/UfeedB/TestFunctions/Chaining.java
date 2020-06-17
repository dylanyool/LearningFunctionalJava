package com.UfeedB.TestFunctions;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append("Hello").append(" there").append(" Madafaka");

        Chainer chainer= new Chainer();
        chainer.sayHi().sayBye();
        System.out.println("\n"+stringBuilder);
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Helouda");
            return this;
        }

        public Chainer sayBye(){
            System.out.println("adiosini banbini");
            return this;
        }
    }
}
