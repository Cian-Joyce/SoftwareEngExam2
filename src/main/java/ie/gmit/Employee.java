/*
 * Cian Joyce
 * G00350885
 * 085216XXXX
 * g00350885@gmit.ie
 *
 * */
package ie.gmit;

public class Employee
{
    private String name;
    private String phone;
    private String employeeNumber;
    private int age;

    public Employee(String name, int age, String phone, String employeeNumber)
    {
        if(name.length() < 3 || name.length() > 25)
        {
            throw new IllegalArgumentException("Name is either too long or too short");
        }
        else if(phone.length()!=8)
        {
            throw new IllegalArgumentException("Phone number is not valid");
        }
        else if(employeeNumber.length()!=5)
        {
            throw new IllegalArgumentException("Invalid employee number");
        }
        else if(age <= 16)
        {
            throw new IllegalArgumentException("Age of employee too young ");
        }
        else
        {
            this.name = name;
            this.phone = phone;
            this.age = age;
            this.employeeNumber = employeeNumber;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
