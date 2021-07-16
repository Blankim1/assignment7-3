/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7.pkg3;

/**
 *
 * @author qianjiahui
 */
public class Person implements PersonType, Comparable<Person>
{
    public char m_personType;
    public int m_ID;
    public String m_firstName;
    public String m_lastName;
    public OrderBy m_sortOrder;
    
    public Person()
    {
        m_ID = 0;
        m_firstName = null;
        m_lastName = null;
        m_personType = PersonType.PERSON;
        m_sortOrder = OrderBy.LAST_NAME;
        
    }
    
    public Person(char type, int ID, String firstName, String lastName)
    {
        m_ID = ID;
        m_firstName = firstName;
        m_lastName = lastName;
        m_personType = type;
        m_sortOrder = OrderBy.LAST_NAME;
    }
    
    // Override method
    public String toString()
    {
        return m_ID + "\t" 
             + m_firstName + "\t" 
             + m_lastName + "\t" 
             + m_personType + "\t";
    }
    
    public boolean equals(Object obj)
    {
        if(obj instanceof Person)
        {
            Person p = new Person();
            return m_ID == p.m_ID && 
                   m_firstName == p.m_firstName &&
                   m_lastName == p.m_lastName &&
                   m_personType == p.m_personType;
         
        }
        
        else
        {
            return false;
        }
    }
    
    public int compareTo(Person p)
    {
        if(m_sortOrder == OrderBy.ID)
        {
            return m_ID - p.m_ID;
        }
        else if(m_sortOrder == OrderBy.FIRST_NAME)
        {
            return m_firstName.compareTo(p.m_firstName);
        }
        else if(m_sortOrder == OrderBy.LAST_NAME)
        {
            return m_lastName.compareTo(p.m_lastName);
        }
        else if(m_sortOrder == OrderBy.TYPE)
        {
            return (int)(m_personType - p.m_personType);
        }
        else
        {
            return -1;
        }
    }
    
    public char getType()
    {
        return m_personType;
    }
    
    public int getID()
    {
        return m_ID;
    }
    
    public String getFirstName()
    {
        return m_firstName;
    }
    
    public String getLastName()
    {
        return m_lastName;
    }
    
    public void setOrder(OrderBy order)
    {
        m_sortOrder = order;
    }
    
    public static void main(String[] args)
    {
        Person p = new Person();
        String a1 = "hello";
        String a2 = "java";
        
        System.out.println(a1.compareTo(a2));
        //System.out.println(a2.toString());
    }
}
