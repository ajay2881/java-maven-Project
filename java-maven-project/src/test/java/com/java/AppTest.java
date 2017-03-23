package com.java;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
   
@Test
public void testinsufficientbalance()
{


App obj=new App(10);
double amount=obj.debit(5);
Assert.assertEquals(5.0,amount);

} 
}



