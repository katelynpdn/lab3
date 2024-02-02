import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}
  @Test 
	public void testReverseInPlace2() {
    int[] intArray = {3, 8, 9};
    ArrayExamples.reverseInPlace(intArray);
    assertArrayEquals(new int[]{9, 8, 3}, intArray);
	}

  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed2() {
    int[] intArray = {3, 8, 9 };
    assertArrayEquals(new int[]{9, 8, 3 }, ArrayExamples.reversed(intArray));
  }
}
