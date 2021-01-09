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
public class BookMain {
    public static void main(String[] args)
    {
        Book b1=new Book( );
        b1.update("Java Programming", 600);
        
        System.out.println(b1.info());
    }
    
}
