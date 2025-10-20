## Bug 1
Brief description:  The constuctor of Computer class hardcode the memory of new creator computeras 16 instead of the input parameter
Failed unit test: testComputerConstructor

## Bug 2
Brief description:  The constuctor of Computer class hardcode the price of new creator computer as 0 instead of the input parameter
Failed unit test: testComputerConstructorPrice

## Bug 3
Brief description:  The SetOS method in Computer Class is not working, it will not change the operating system into the input new OS, it will always change into "none"
Failed unit test: testSetOS

## Bug 4
Brief description:  The constructor of the resale shop will automatically put one computer in the Inventory when the meaning of constucing a new inventory for the resale shop is to create a new empty arraylist of computers
Failed unit test: testResaleShopConstructor

## Bug 5
Brief description:  The method Buy in ResaleShop class was errored, the new computer added into the inventory is not the new one with the description and folloing attributes from the input, but is always the one written in the method with "2019 MacBook Pro", "Intel", 256, 16, "High Sierra", 2019, 1000
Failed unit test: testResaleBuy

## Bug 6
Brief description:  In the Print Inventory method in Resale shop, the condition for (int i = 0; i <= this.inventory.size(); i++) is wrong, the number between 0 and i are one more than i, thus it will report IndexOutOfBoundsException.
Failed unit test: testPrintInventory

## Bug 7
Brief description:  
Failed unit test: 

## Bug 8
Brief description:  
Failed unit test: 

## Bug 9
Brief description:  
Failed unit test: 

## Bug 10
Brief description:  
Failed unit test: 