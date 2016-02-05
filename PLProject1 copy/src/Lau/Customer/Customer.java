package Lau.Customer;
import java.util.Scanner;
/**
 * Created by Tracy on 2/4/16.
 */
public class Customer {
    public String address;
    public String city;
    public String state;
    public String postalCode;
    public String name;
    public int id;

    public Customer(){}

    public void setId(int id){
        this.id = id;

    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city=city;
    }
    public void setState(String state){
        this.state=state;
    }
    public void setPostalCode(String postalCode){
        this.postalCode=postalCode;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public  String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getPostalCode(){
        return postalCode;
    }

    public String getNameandAddress(){
        String info = "\n"+name+"\n"+address+"\n"+city+", "+state + " "+postalCode+"\n";
        return info;
    }


}
