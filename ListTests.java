import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

class StringChecker2 implements StringChecker {
    public boolean checkString(String s) {
        if (s.charAt(0) == 's') {
            return true;
        }
        return false;
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("string");
        stringList.add("ey");
        stringList.add("s2");
        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("string");
        stringList2.add("s2");
        StringChecker2 sc = new StringChecker2();
        assertEquals(stringList2, ListExamples.filter(stringList, sc));
    }

    @Test
    public void testMerge() {
        List<String> stringList = new ArrayList<String>();
        stringList.add("a");
        stringList.add("b");
        List<String> stringList2 = new ArrayList<String>();
        stringList2.add("a");
        stringList2.add("d");
        List<String> stringList3 = new ArrayList<String>();
        stringList3.add("a");
        stringList3.add("a");
        stringList3.add("b");
        stringList3.add("d");
        assertEquals(stringList3, ListExamples.merge(stringList, stringList2));
    }
}  
