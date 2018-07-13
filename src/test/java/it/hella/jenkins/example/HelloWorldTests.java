package it.hella.jenkins.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class HelloWorldTests {

    @Test
    public void smartTest(){
        assertEquals("test", new HelloWorld().sayHello("test"));
    }

}
