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
public class StudentMain2 {
    public static void main(String[] args)
    {
        Student [] stu=new Student[2];
        stu[0]=new Student("000","Amy");
        stu[1]=new Student("002","John");
        
       /* for(int i=0;i<stu.length;i++)
        stu[i].show();*/
        
       for(Student s:stu)
           s.show();
    }
    
}
