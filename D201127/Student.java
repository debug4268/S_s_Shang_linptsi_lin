/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package D201127;

/**
 *
 * @author Administrator
 */
public class Student {
    String id;
    String name;
    
    public Student( )
    {
        this("000","NA");
    }
    public Student(String id,String name)
    {
        this.name=name;
        this.id=id;
    }
    public void show()
    {
        System.out.printf("ID:%s NAME:%s%n", id,name);
    }
}
