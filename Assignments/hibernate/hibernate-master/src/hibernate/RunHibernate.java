package hibernate;

import java.util.*;

public class RunHibernate {
    public static void main(String[] args) {
        TestDAO t = TestDAO.getInstance();
        List<Customer> c = t.getCustomers();
        for (Customer i : c) {
            System.out.println(i);
        }
        System.out.println(t.getCustomer(1));
    }
}
