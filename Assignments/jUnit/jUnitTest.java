/*
Theodore Hancock
JUNIT
Information pulled from http://junit.sourceforge.net/javadoc/org/junit/Assert.html
*/

import org.junit.*;
package Tests;

public class jUNITtest {

    /*
    assertArrayEquals(byte[] expecteds, byte[] actuals)
          Asserts that two byte arrays are equal.
    assertArrayEquals(char[] expecteds, char[] actuals)
          Asserts that two char arrays are equal.
    assertArrayEquals(int[] expecteds, int[] actuals)
          Asserts that two int arrays are equal.
    assertArrayEquals(long[] expecteds, long[] actuals)
          Asserts that two long arrays are equal.
    assertArrayEquals(java.lang.Object[] expecteds, java.lang.Object[] actuals)
          Asserts that two object arrays are equal.
    assertArrayEquals(short[] expecteds, short[] actuals)
          Asserts that two short arrays are equal.
    assertArrayEquals(java.lang.String message, byte[] expecteds, byte[] actuals)
          Asserts that two byte arrays are equal.
    assertArrayEquals(java.lang.String message, char[] expecteds, char[] actuals)
          Asserts that two char arrays are equal.
    assertArrayEquals(java.lang.String message, int[] expecteds, int[] actuals)
          Asserts that two int arrays are equal.
    assertArrayEquals(java.lang.String message, long[] expecteds, long[] actuals)
          Asserts that two long arrays are equal.
    assertArrayEquals(java.lang.String message, java.lang.Object[] expecteds, java.lang.Object[] actuals)
          Asserts that two object arrays are equal.
    assertArrayEquals(java.lang.String message, short[] expecteds, short[] actuals)
          Asserts that two short arrays are equal.
    */
    public void testDivideTest8() {
        divide newDivide = new divide();
        int [] i = new int[] {newDivide.jUNITtest(100, 5)};
        int [] x = new int []{newDivide.jUNITtest(100, 10)};
        assertArrayEquals(i, x);
        
    }

    /*
    assertEquals(double expected, double actual)
          Deprecated. Use assertEquals(double expected, double actual, double epsilon) instead
    assertEquals(double expected, double actual, double delta)
          Asserts that two doubles or floats are equal to within a positive delta.
    assertEquals(long expected, long actual)
          Asserts that two longs are equal.
    assertEquals(java.lang.Object[] expecteds, java.lang.Object[] actuals)
          Deprecated. use assertArrayEquals
    assertEquals(java.lang.Object expected, java.lang.Object actual)
          Asserts that two objects are equal.
    assertEquals(java.lang.String message, double expected, double actual)
          Deprecated. Use assertEquals(String message, double expected, double actual, double epsilon) instead
    assertEquals(java.lang.String message, double expected, double actual, double delta)
          Asserts that two doubles or floats are equal to within a positive delta.
    assertEquals(java.lang.String message, long expected, long actual)
          Asserts that two longs are equal.
    assertEquals(java.lang.String message, java.lang.Object[] expecteds, java.lang.Object[] actuals)
          Deprecated. use assertArrayEquals
    assertEquals(java.lang.String message, java.lang.Object expected, java.lang.Object actual)
          Asserts that two objects are equal.
    */
    @Test
    public void testDivideTest1() {
        divide newDivide = new divide();
        int i = newDivide.jUNITtest(100, 5);
        assertEquals(20, i);
    }

    
    /*
    assertFalse(boolean condition)
          Asserts that a condition is false.
    assertFalse(java.lang.String message, boolean condition)
          Asserts that a condition is false.
    */
    @Test
    public void testDivideTest3() {
        divide newDivide = new divide();
        int i = newDivide.jUNITtest(5, 5);
        assertFalse(i == 5);
    }
    
    /*
    assertNotNull(java.lang.Object object)
          Asserts that an object isn't null.
    assertNotNull(java.lang.String message, java.lang.Object object)
          Asserts that an object isn't null.
    */
    @Test
    public void testDivideTest4() {
        divide newDivide = new divide();
        int i = newDivide.jUNITtest(50, 10);
        assertNotNull(i);
    }
    
    /*
    assertNotSame(java.lang.Object unexpected, java.lang.Object actual)
          Asserts that two objects do not refer to the same object.
    assertNotSame(java.lang.String message, java.lang.Object unexpected, java.lang.Object actual)
          Asserts that two objects do not refer to the same object.
    */  
    @Test
    public void testDivideTest7() {
        divide newDivide = new divide();
        int i = newDivide.jUNITtest(5, 1);
        int x = newDivide.jUNITtest(50, 1);
        assertNotSame(i, x);
    }

    /*
    assertNull(java.lang.Object object)
          Asserts that an object is null.
    assertNull(java.lang.String message, java.lang.Object object)
          Asserts that an object is null.
    */
    @Test
    public void testDivideTest5() {
        divide newDivide = new divide();
        int i = newDivide.jUNITtest(0, 5);
        assertNull(i);
    }
    
    /*
    assertSame(java.lang.Object expected, java.lang.Object actual)
          Asserts that two objects refer to the same object.
    assertSame(java.lang.String message, java.lang.Object expected, java.lang.Object actual)
          Asserts that two objects refer to the same object.
    */
    @Test
    public void testDivideTest6() {
        divide newDivide = new divide();
        int z = newDivide.jUNITtest(5, 1);
        int x = newDivide.jUNITtest(50, 10);
        assertSame(z, x);
    }

     /*
    assertTrue(boolean condition)
          Asserts that a condition is true.
    assertTrue(java.lang.String message, boolean condition)
          Asserts that a condition is true.
     */
    @Test
    public void testDivideTest2() {
        divide newDivide = new divide();
        int z = newDivide.jUNITtest(5, 1);
        assertTrue(z == 5);
    }
    
    
}