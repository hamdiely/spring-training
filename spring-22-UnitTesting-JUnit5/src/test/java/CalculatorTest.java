import org.junit.jupiter.api.*;

import java.nio.file.AccessDeniedException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("Before All is executed");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("After All is executed");

    }




    @BeforeEach
    void setUpEach(){

        System.out.println("Before each is executed!");
    }
    @AfterEach
    void tearDown(){

        System.out.println("After each is executed");
    }





    @Test
    void add() {
        System.out.println("Add Methode");
        int actual = Calculator.add(3,7);
        assertEquals(10,actual,"Test failed");
        //assertEquals(13,actual,"Test failed");
    }

    @Test
    void add2(){
        System.out.println("add2 method");

        assertThrows(IllegalArgumentException.class, ()->Calculator.add2(3,2));
        //assertThrows(AccessDeniedException.class, ()->Calculator.add2(3,2));
        //assertThrows(IllegalArgumentException.class, ()->Calculator.add2(1,2));
    }



    @Test
    void testCase1(){
        System.out.println("test case 1");
        fail(" not implemented yet");
    }
    @Test
    void testCase2(){
        System.out.println("test case 2");
        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add",Calculator.operator);
    }
    @Test
    void testCase3(){
        System.out.println("test case 3");
        assertArrayEquals(new int [] {1,2,3}, new int [] {1,2,3}, "Arrays are NOT same");
    }
    @Test
    void testCase4(){
        System.out.println("test case 4");
        String nullString= null;
        String notNullString= "null";

        assertNull(nullString);
        assertNotNull(notNullString);

    }
    @Test
    void testCase5(){
        System.out.println("test case 5");
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1,c2);
        assertNotSame(c1,c3);


    }

}