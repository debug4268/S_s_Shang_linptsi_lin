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
public class StudentDemo3 {
    static void change(Student s)
    {
        //s=new Student("xyz","text")//錯誤寫法
       s.name="test";
       s.id="xyz";
    }
    public static void main(String[] args)
    {
        Student s1=new Student("100","Mary");
        change(s1);
        s1.show();
    }
}
