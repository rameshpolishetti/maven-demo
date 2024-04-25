package com.tibco.mvndemo;

import com.tibco.mvndemo.Module1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Maven Demo Application" );
        Module1 m1 = new Module1();
        System.out.println("Module1 = " + m1.getModule());
    }
}
