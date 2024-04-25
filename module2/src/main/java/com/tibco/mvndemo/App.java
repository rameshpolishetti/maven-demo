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
        Module2 mod2 = new Module2();
        System.out.println("[Module2] " + mod2.getVersion());
    }
}
