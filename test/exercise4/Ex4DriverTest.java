/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

import java.util.ArrayList;
import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author suhrda01
 */
public class Ex4DriverTest {
    
    public Ex4DriverTest() {
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

    /**
     * Test of task1 method, of class Ex4Driver.
     */
    @Test
    public void testTask1() {
        System.out.println("task1");
        Integer n = 4;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 8;
        Integer result = instance.task1(n);
        assertEquals(expResult, result);
        n = 0;
        expResult = 0;
        result = instance.task1(n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task2 method, of class Ex4Driver.
     */
    @Test
    public void testTask2() {
        System.out.println("task2");
        String text = "Hello World";
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 11;
        Integer result = instance.task2(text);
        assertEquals(expResult, result);
        text = "Daniel";
        expResult = 6;
        result = instance.task2(text);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task3 method, of class Ex4Driver.
     */
    @Test
    public void testTask3() {
        System.out.println("task3");
        Character letter = 'A';
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 65;
        Integer result = instance.task3(letter);
        assertEquals(expResult, result);
        letter = 'b';
        expResult = 98;
        result = instance.task3(letter);
        assertEquals(expResult, result);
    }

    /**
     * Test of task4 method, of class Ex4Driver.
     */
    @Test
    public void testTask4() {
        System.out.println("task4");
        String text = "Hello";
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'H';
        Character result = instance.task4(text);
        assertEquals(expResult, result);
        text = "World";
        expResult = 'W';
        result = instance.task4(text);
        assertEquals(expResult, result);
    }

    /**
     * Test of task5 method, of class Ex4Driver.
     */
    @Test
    public void testTask5() {
        System.out.println("task5");
        Integer n = 5;
        Integer m = 3;
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 15;
        Integer result = instance.task5(n, m);
        assertEquals(expResult, result);
        n = 2;
        m = 9;
        expResult = 18;
        result = instance.task5(n, m);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task6 method, of class Ex4Driver.
     */
    @Test
    public void testTask6() {
        System.out.println("task6");
        String text = "Hello";
        Integer n = 6;
        Ex4Driver instance = new Ex4Driver();
        Character expResult = 'H';
        Character result = instance.task6(text, n);
        assertEquals(expResult, result);
        text = "World";
        n = 4;
        expResult = 'd';
        result = instance.task6(text, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task7 method, of class Ex4Driver.
     */
    @Test
    public void testTask7() {
        System.out.println("task7");
        Integer[] intArr = new Integer[10];
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 10;
        Integer result = instance.task7(intArr);
        assertEquals(expResult, result);
        intArr = new Integer[5];
        expResult = 5;
        result = instance.task7(intArr);
        assertEquals(expResult, result);
    }

    /**
     * Test of task8 method, of class Ex4Driver.
     */
    @Test
    public void testTask8() {
        System.out.println("task8");
        Integer[] intArr = new Integer[10];
        Integer n = 15;
        Ex4Driver instance = new Ex4Driver();
        Boolean expResult = false;
        Boolean result = instance.task8(intArr, n);
        assertEquals(expResult, result);
        n = 5;
        expResult = true;
        result = instance.task8(intArr, n);
        assertEquals(expResult, result);
    }

    /**
     * Test of task9 method, of class Ex4Driver.
     */
    @Test
    public void testTask9() {
        System.out.println("task9");
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Hello");
        arrList.add("World");
        arrList.add("Daniel");
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task9(arrList);
        assertEquals(expResult, result);
        arrList.add("Suhr");
        expResult = 4;
        result = instance.task9(arrList);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of task10 method, of class Ex4Driver.
     */
    @Test
    public void testTask10() {
        System.out.println("task10");
        HashMap<Integer, Integer> hash = new HashMap();
        hash.put(1,1);
        hash.put(2,2);
        hash.put(3,3);
        Ex4Driver instance = new Ex4Driver();
        Integer expResult = 3;
        Integer result = instance.task10(hash);
        assertEquals(expResult, result);
        hash.put(4,4);
        expResult = 4;
        result = instance.task10(hash);
        assertEquals(expResult, result);
    }
    
}
