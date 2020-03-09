/*
* Cian Joyce
* G00350885
* 085216XXXX
* g00350885@gmit.ie
*
* */


package ie.gmit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class EmployeeListTest
{
    EmployeeList workerList;
    @BeforeEach
    public void setup()
    {
        workerList = new EmployeeList();
    }
   @Test
    public void testGetListSize()
   {
      Employee worker1 = new Employee("Cian", 21, "01234567", "01234");
       Employee worker2 = new Employee("Sean", 24, "01234555", "01254");
      workerList.addEmployee(worker1);
      assertEquals(1, workerList.getListSize());
       workerList.addEmployee(worker2);
       assertEquals(2, workerList.getListSize());
   }
   @Test
    public void testAddEmployeeCheck()
   {
       Employee worker1 = new Employee("Cian", 21, "01234567", "01234");
       workerList.addEmployee(worker1);
       assertEquals(1, workerList.getListSize());
       //should throw exception when trying to add same employee
       assertThrows(IllegalArgumentException.class, ()-> workerList.addEmployee(worker1));
       //ensure list size is unchanged
       assertEquals(1, workerList.getListSize());
   }
}
