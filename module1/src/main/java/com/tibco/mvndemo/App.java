package com.tibco.mvndemo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello from Module1" );
        Module1 mod1 = new Module1();
        System.out.println("[Module1] " + mod1.getVersion());
    }
}
