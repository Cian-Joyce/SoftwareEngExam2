/*
 * Cian Joyce
 * G00350885
 * 085216XXXX
 * g00350885@gmit.ie
 *
 * */
package ie.gmit;

import java.util.ArrayList;

public class EmployeeList
{
    private ArrayList <Employee> employeeList;

    public EmployeeList(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }
    public EmployeeList()
    {
        employeeList = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList()
    {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList)
    {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee employee)
    {
        for(int i =0; i < employeeList.size(); i++) //iterate through all employees in the list
        {
            //employee ID is used to identify employees, compare the argument employee # to those in the list #
            if(employeeList.get(i).getEmployeeNumber() == employee.getEmployeeNumber())
            {
                throw new IllegalArgumentException("That employee already exists in the list.");
            }
        }
        employeeList.add(employee);
    }

    public int getListSize()
    {
        return employeeList.size();
    }
}
