/*
 * Cian Joyce
 * G00350885
 * 085216XXXX
 * g00350885@gmit.ie
 *A class to test methods in the employee class
 * */
package ie.gmit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest
{
    @Test
    public void testEmployeeConstructor()
    {
        Employee worker = new Employee("Cian", 17, "08777666", "66666");
        assertEquals("Cian", worker.getName());
        assertEquals(17, worker.getAge());
        assertEquals("08777666", worker.getPhone());
        assertEquals("66666", worker.getEmployeeNumber());
    }
    @Test
    public void testEmployeeConstructorBadNameLow()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("Ci", 17, "08777666", "66666"));
    }
    @Test
    public void testEmployeeConstructorBadNameHigh()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("Ciaaaaaaaaaaaaaaaaaaaaaaaaaaan", 17, "08777666", "66666"));
    }
    @Test
    public void testEmployeeConstructorBadAge()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("Cian", 3, "08777666", "66666"));

    }
    @Test
    public void testEmployeeConstructorBadPhone()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("Cian", 17, "087", "66666"));

    }
    @Test
    public void testEmployeeConstructorBadEmployeeNo()
    {
        assertThrows(IllegalArgumentException.class, ()-> new Employee("Cian", 17, "08777666", "6"));
    }
    @Test
    public void testEmployeeSetName()
    {
        Employee worker = new Employee("Cian", 17, "08777666", "66666");
        worker.setName("Sean");
        assertEquals("Sean", worker.getName());
    }
    @Test
    public void testEmployeeSetAge()
    {
        Employee worker = new Employee("Cian", 17, "08777666", "66666");
        worker.setAge(18);
        assertEquals(18, worker.getAge());
    }
    @Test
    public void testEmployeeSetPhone()
    {
        Employee worker = new Employee("Cian", 17, "08777666", "66666");
        worker.setPhone("01234567");
        assertEquals("01234567", worker.getPhone());
    }
    @Test
    public void testEmployeeSetEmployeeNum()
    {
        Employee worker = new Employee("Cian", 17, "08777666", "66666");
        worker.setEmployeeNumber("55555");
        assertEquals("55555", worker.getEmployeeNumber());
    }
}
