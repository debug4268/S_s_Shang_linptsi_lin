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
public class Book {
    String name;
    int price;
    
    public void update(String n,int p)
    {
        name=n;
        price=p;
    }
    public String info( )
    {
        return "Book Name:"+name+";price:"+price;
    }
}
