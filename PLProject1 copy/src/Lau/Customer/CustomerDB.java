package Lau.Customer;
import java.util.Scanner;
/**
 * Created by Tracy on 2/4/16.
 */
public class CustomerDB {
    public int id = 0;
    public CustomerDB(int id){
        this.id = id;
    }
    public void cusInfo() {
        if (id == 1001) {
             Customer one = new Customer();
            one.setId(1001);
             one.setName("Barbara White");
             one.setAddress("3400 Richmond Parkway #3423");
             one.setCity("Bristol");
            one.setState("CT");
            one.setPostalCode("06010");
            System.out.println(one.getNameandAddress());
        }
        else if (id == 1002) {
            Customer one = new Customer();
            one.setId(1002);
            one.setName("Karl Vang");
            one.setAddress("327 Franklin Street");
            one.setCity("Edina");
            one.setState("MN");
            one.setPostalCode("55435");
            System.out.println(one.getNameandAddress());
        }
        else if (id == 1003) {
            Customer one = new Customer();
            one.setId(1003);
            one.setName("Ronda Chavan");
            one.setAddress("518 Commanche Dr.");
            one.setCity("Greensboro");
            one.setState("NC");
            one.setPostalCode("27410");
            System.out.println(one.getNameandAddress());
        }
        //if not part of list, output that it's invalid
        else{
            System.out.println("\nThere is no customer number "+id+" in our records.\n");
        }
    }
}
