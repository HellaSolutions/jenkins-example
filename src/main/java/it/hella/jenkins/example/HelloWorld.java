package it.hella.jenkins.example;

public class HelloWorld {

    public String sayHello(String hello){
        System.out.println(hello);
        return hello;
    }

    public static void main(String[] args){
        new HelloWorld().sayHello("Hello");
    }

}
