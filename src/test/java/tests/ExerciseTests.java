package tests;

import model.Animal;
import model.Vehicle;
import org.junit.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class ExerciseTests {

    // Exercise 1: Integer Value Assertions
    @Test
    public void testIntegerValueEquality() {
        Integer a = 5;
        Integer b = 5;
        Integer c = 10;

        assertEquals(a, b);
        assertNotEquals(a, c);
    }

    // Exercise 2: Reference Equality
    @Test
    public void testObjectReferenceEquality() {
        String x = "hello";
        String y = x;
        String z = new String("hello");

        assertSame(x, y);        // Same reference
        assertNotSame(x, z);     // Different reference, even if same content
    }

    // Exercise 3: Array Equality
    @Test
    public void testArrayEquality() {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        assertArrayEquals(array1, array2);
    }

    // Exercise 4: ArrayList of Mixed Types and Assertions
    @Test
    public void testArrayListOrderAndContent() {
        Animal cat = new Animal("Cat");
        Vehicle car = new Vehicle("Toyota");
        String message = "Hello";

        List<Object> mixedList = new ArrayList<>();
        mixedList.add(cat);
        mixedList.add(car);
        mixedList.add(message);

        // Check insertion order
        assertEquals(cat, mixedList.get(0));
        assertEquals(car, mixedList.get(1));
        assertEquals(message, mixedList.get(2));

        // Check content regardless of order
        assertTrue(mixedList.containsAll(Arrays.asList(car, cat, message)));

        // Ensure each object appears only once
        Set<Object> uniqueSet = new HashSet<>(mixedList);
        assertEquals(mixedList.size(), uniqueSet.size());

        // Check that a missing object is not in the list
        Animal dog = new Animal("Dog");
        assertFalse(mixedList.contains(dog));
    }

    // Exercise 5: Map contains key
    @Test
    public void testMapContainsKey() {
        Map<String, Integer> map = new HashMap<>();
        map.put("score", 100);
        map.put("level", 2);

        assertTrue(map.containsKey("score"));
    }

    // Exercise 6: Exception assertion
    @Test
    public void testArrayIndexOutOfBoundsException() {
        int[] numbers = {1, 2, 3};

        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int x = numbers[5];
        });
    }

    // Exercise 7: Optional is empty
    @Test
    public void testOptionalIsEmpty() {
        Optional<String> emptyOpt = Optional.empty();

        assertTrue(emptyOpt.isEmpty());
    }
}