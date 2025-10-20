import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest {

@Test
public void testComputerConstructor1(){
    Computer C1 = new Computer("Mac Air", "ios18", 16, 6, "IOS", 2022, 899);
    assertEquals("Mac Air", C1.description);
    assertEquals("ios18", C1.processorType);
    assertEquals(16, C1.hardDriveCapacity);
    assertEquals(6, C1.memory);
    assertEquals("IOS", C1.operatingSystem);
    assertEquals(2022, C1.yearMade);
    assertEquals(899, C1.price);
} 

@Test
public void testComputerConstructorPrice(){
    Computer C1 = new Computer("Mac Air", "ios18", 16, 6, "IOS", 2022, 899);
    assertEquals(899, C1.price);
}

@Test
public void testSetOS(){
    Computer C1 = new Computer("Mac Air", "ios18", 16, 6, "IOS", 2022, 899);
    C1.setOS("IOS-2");
    assertEquals("IOS-2", C1.operatingSystem);
}

@Test
public void test

}
