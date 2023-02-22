package program;

import lombok.ToString;

import models.Role;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import utils.HibernateSessionUtils;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
System.out.println("Thats my HW_3");


    }


    private static void testRole() {
        Session context = HibernateSessionUtils.getSessionFactory().openSession();

        Query query = context.createQuery("FROM Role");
        List<Role> list = query.list();
        for (Role role : list) {
            System.out.println("Назва: " + role.getName());
        }
        context.close();
    }
}
