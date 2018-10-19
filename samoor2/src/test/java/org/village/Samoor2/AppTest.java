package org.village.Samoor2;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;


public class AppTest 
{ 
    @Test
    public static void Test()
    {
    	int a =3;
    	int b =4;
    	int c = a+b;
    	assertEquals(c, 7);
    	System.out.println( "Hello World!" );
    }
    
    @Test
    public static void Test1()
    {
    	int a =4;
    	int b =5;
    	int c = a+b;
    	assertEquals(c, 9);
    	System.out.println( "Hello World!" );
    }
    
    
}


