import static org.junit.Assert.*;
import org.junit.Test;

public class LinkedListTests {
    LinkedList myList = new LinkedList();

    @Test
    public void testAppend() {
        myList.append(2);
        assertEquals(2, myList.root.value);
        myList.append(3);
        assertEquals(3, myList.root.next.value);
        myList.append(4);
        assertEquals(4, myList.root.next.next.value);
        myList.append(5);
        assertEquals(5, myList.root.next.next.next.value);
    }
    @Test
    public void testPrepend() {
        myList.prepend(2);
        assertEquals(2, myList.root.value);
        myList.prepend(3);
        assertEquals(3, myList.root.value);
        assertEquals(2, myList.root.next.value);
    }
    @Test
    public void testFirst() {
        myList.append(2);
        myList.prepend(3);
        assertEquals(3, myList.first());
    }
    @Test
    public void testLast() {
        myList.append(2);
        myList.prepend(3);
        assertEquals(2, myList.last());
    }
    @Test
    public void testToString() {
        myList.append(2);
        myList.prepend(3);
        assertEquals("3 2 ", myList.toString());
    }
    @Test
    public void testLength() {
        myList.append(2);
        myList.prepend(3);
        assertEquals(2, myList.length());
    }
}
