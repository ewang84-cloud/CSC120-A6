import static org.junit.Assert.*;
import org.junit.Test;

public class ShopTest{

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
public void testResaleShopConstructor (){
    ResaleShop R1 = new ResaleShop();
    assertEquals(0, R1.inventory.size());
}

@Test
public void testResaleBuy (){
    ResaleShop R2 = new ResaleShop();
    Computer C2 = new Computer("Del","i1", 10, 10, "Windows", 2015, 599);
    
    try {
        R2.buy(C2);
    } catch (Exception e) {
    
    }
    
    Computer theAddedComputer = R2.inventory.get(R2.inventory.size()-1);
    assertEquals("Dell", theAddedComputer.description);
}

@Test
public void testPrintInventory(){
    ResaleShop R3 = new ResaleShop();
    try {
        R3.printInventory();
    } catch (IndexOutOfBoundsException e) {
        fail("printInventory should not throw IndexOutOfBoundsException: " + e.getMessage());
    }
}

@Test
public void testRefurbishStringComparison() throws Exception {
    ResaleShop R4 = new ResaleShop();
    Computer C3 = new Computer("Dell", "i5", 256, 8, "Windows", 2020, 500);
    R4.inventory.add(C3);
    
    String originalOS = C3.operatingSystem;
    R4.refurbish(C3, "None");
    
    assertEquals(originalOS, C3.operatingSystem);
}


@Test
public void testRefurbishPriceLogic() throws Exception {
    ResaleShop R5 = new ResaleShop();
    Computer oldComp = new Computer("Old", "P4", 100, 4, "XP", 2005, 100);
    Computer newerComp = new Computer("Newer", "i3", 256, 8, "Win10", 2015, 600);
    
    R5.inventory.add(oldComp);
    R5.inventory.add(newerComp);
    
    R5.refurbish(oldComp, "None");
    R5.refurbish(newerComp, "None");
    
    assertTrue("Old computer should be cheaper", oldComp.price < newerComp.price);
}


@Test
public void testSellNonexistent() {
    ResaleShop R6 = new ResaleShop();
    Computer C4 = new Computer("Dell", "i5", 256, 8, "Windows", 2020, 500);
    
    try {
        R6.sell(C4);
        fail("Should throw Exception for nonexistent computer");
    } catch (Exception e) {
    }
}



@Test
public void testBuyDuplicate() {
    ResaleShop R7 = new ResaleShop();
    Computer C5 = new Computer("Dell", "i5", 256, 8, "Windows", 2020, 500);
    R7.inventory.add(C5);
    
    try {
        R7.buy(C5);
        fail("Should throw Exception for duplicate computer");
    } catch (Exception e) {
    }
}

}
