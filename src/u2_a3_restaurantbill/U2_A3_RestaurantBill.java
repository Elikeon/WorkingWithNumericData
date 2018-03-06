/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a3_restaurantbill;


import java.text.DecimalFormat;
public class U2_A3_RestaurantBill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double price;
        double tax;
       double bill;
        price = 9.99;
        tax = 1.13;
        bill = price*tax;
        DecimalFormat x = new DecimalFormat ("##.##");
        System.out.println("Price = " + price);
        System.out.println("Tax = " + tax);
        System.out.println("Bill = " + x.format(bill));
        
        
        
        
    }
    
}
