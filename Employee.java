/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7.pkg3;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author qianjiahui
 */
public class Employee extends Person implements FileIO
{
    private String m_department = "";
    
    public Employee()
    {
        super();
        m_personType = PersonType.EMPLOYEE;
    }
    
    public Employee(int ID, String firstName, String lastName, String department)
    {
        m_ID = ID;
        m_firstName = firstName;
        m_lastName = lastName;
        m_personType = PersonType.EMPLOYEE;
        m_department = department;
    }
    
    public String toString()
    {
        return m_personType + "\t" 
             + m_ID + "\t" 
             + m_firstName + "\t" 
             + m_lastName + "\t" 
             + m_department;
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Employee)
        {
            Employee e1 = new Employee();
            return (m_personType == e1.m_personType) &&
                   (m_ID == e1.m_ID) &&
                   (m_firstName == e1.m_firstName)&&
                   (m_lastName == e1.m_lastName)&&
                   (m_department == m_department);
        }
        else
        {
            return false;
        }
    }
    
    public int compareTo(Person p)
    {
        if(p instanceof Employee)
        {
            Employee e2 = new Employee();
            if(m_sortOrder == OrderBy.DEPARTMENT)
            {
                return m_department.compareTo(e2.m_department);
            }
            else
            {
                return -1;
            }
        }
        
        else
        {
            return -1;
        }
                
    }
    
    public void setInfo(String info)
    {
        String [] arr = info.split("\t");
        m_personType = arr[0].charAt(0);
        m_ID = Integer.parseInt(arr[1]);
        m_firstName = arr[2];
        m_lastName = arr[3];
        m_department = arr[4];
    }

    @Override
    public void saveFile(String a_fileName) throws FileNotFoundException 
    {
        java.io.File file1 = new java.io.File(a_fileName);
        java.io.PrintWriter printwriter = new java.io.PrintWriter(file1);
        
        printwriter.print(this.toString());
        printwriter.close();
    }

    @Override
    public void loadFile(String a_fileName) throws FileNotFoundException 
    {
        java.io.File file2 = new java.io.File(a_fileName);
        Scanner s3 = new Scanner(file2);
        setInfo(s3.nextLine());
    }
    
    public static void main(String[] arg)
    {
        Employee e1 = new Employee(102, "Tom", "Smith", "HR");
        Employee e2 = new Employee(103, "Lily", "Green", "SALES");
        
        System.out.println(e1.compareTo(e2));   
        System.out.println(e2.toString());
        System.out.println(e1);
    }
    
}