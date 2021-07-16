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
public class Student extends Person implements FileIO
{
    private String m_major = "";
    
    public Student()
    {
        super();
        //m_ID = 0;
        //m_firstName = null;
        //m_lastName = null;
        m_personType = PersonType.STUDENT;
        m_major = null;
        
        
    }
    
    public Student(int ID, String firstName, String lastName, String major)
    {
        m_personType = PersonType.STUDENT;
        m_ID = ID;
        m_firstName = firstName;
        m_lastName = lastName;
        m_major = major;
        
    }
    
    public String toSting()
    {
        return m_personType + "\t" 
             + m_ID + "\t" 
             + m_firstName + "\t" 
             + m_lastName + "\t" 
             + m_major;
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Student)
        {
            Student s1 = new Student();
            return (m_personType == s1.m_personType) &&
                   (m_ID == s1.m_ID) &&
                   (m_firstName == s1.m_firstName)&&
                   (m_lastName == s1.m_lastName)&&
                   (m_major == s1.m_major);
        }
        else
        {
            return false;
        }
    }
    
    public int compareTo(Person p)
    {
        if(p instanceof Student)
        {
            Student s2 = new Student();
            if(m_sortOrder == OrderBy.MAJOR)
            {
                return m_major.compareTo(s2.m_major);
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
        m_major = arr[4];
    }

    @Override
    public void saveFile(String a_fileName) throws FileNotFoundException 
    {
        java.io.File file1 = new java.io.File(a_fileName);
        java.io.PrintWriter printwriter = new java.io.PrintWriter(file1);
        
        printwriter.print(this.toSting());
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
        Student stu1 = new Student(100, "Rick", "Novak", "IBS");
        Student stu2 = new Student();
        
        stu2.m_ID = 101;
        stu2.m_firstName = "Susan";
        stu2.m_lastName = "Connor";
        stu2.m_major = "ART";
        
        System.out.println(stu1.compareTo(stu2));      
        System.out.println(stu2.toSting());
        System.out.println(stu1);
    }
    
    

    
    
}
