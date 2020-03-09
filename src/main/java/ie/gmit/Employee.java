/*
 * Cian Joyce
 * G00350885
 * 085216XXXX
 * g00350885@gmit.ie
 *A class for storing essential employee information, checks are run in constructors to ensure right inputting of data
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
        if(name.length() < 3 || name.length() > 25) //check if name is greater than 3, less than 26
        {
            throw new IllegalArgumentException("Name is either too long or too short");
        }
        else if(phone.length()!=8)  //check if phone is 8 digits long
        {
            throw new IllegalArgumentException("Phone number is not valid");
        }
        else if(employeeNumber.length()!=5) //check if employeeNumber is 5 characters long
        {
            throw new IllegalArgumentException("Invalid employee number");
        }
        else if(age <= 16)  //check if age is greater than 16
        {
            throw new IllegalArgumentException("Age of employee too young ");
        }
        else    //allow object to create and initialise variables
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
