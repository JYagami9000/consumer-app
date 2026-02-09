package com.example;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bag<String> bag = new HashBag<>();
        bag.add("A");
        bag.add("A");
        int c  = bag.getCount("A"); // 2
        System.out.println( "Hello World!" );
    }
}
