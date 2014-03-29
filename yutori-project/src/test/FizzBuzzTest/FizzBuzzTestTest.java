/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test.FizzBuzzTest;

import main.fizzbuzz.FizzBuzzTest;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author udumbara
 */
public class FizzBuzzTestTest {
    
    public FizzBuzzTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testTimes3(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Fizz", fzt.calc(3));
    }
    
    @Test
    public void testTimes5(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Buzz", fzt.calc(5));
    }

    @Test
    public void testTimes15(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Fizz Buzz", fzt.calc(15));
    }
    
    @Test
    public void testTimes30(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Fizz Buzz", fzt.calc(30));
    }
    
    @Test
    public void testTimes10(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Buzz", fzt.calc(10));
    }
    
    @Test
    public void testTimes9(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("Fizz", fzt.calc(9));
    }
    
    @Test
    public void testNotFizzBuzz(){
        FizzBuzzTest fzt = new FizzBuzzTest();
        assertEquals("2", fzt.calc(2));
    }
    
    //@Test
    // This test is not specification
    //public void testTimesZero(){
    //    FizzBuzzTest fzt = new FizzBuzzTest();
    //    assertEquals("0", fzt.calc(0));
    //}
}

