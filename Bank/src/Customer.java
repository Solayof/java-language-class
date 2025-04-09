import java.util.*;

import java.util.*;
public class Customer {
    private String name;
    private String address;
    private String phone;
    private String email;
    private List<Order> orders;
    public Customer(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.orders = new ArrayList<>();
    }
}
