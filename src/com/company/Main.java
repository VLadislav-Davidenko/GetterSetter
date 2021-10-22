package com.company;

import com.company.task.PostOffice;
import com.company.task.Book;
import com.company.task.Buyer;

public class Main {

    public static void main(String[] args) {

        PostOffice post1 = new PostOffice(true);
        Book bk1 = new Book("Programming", 1200);
        Buyer br1 = new Buyer('m', 21, 234.55);
        bk1.setPage(1234);
        br1.sex = 'f';

        System.out.println("Class Book\n Name = " + bk1.getCover() + "\n Pages = " + bk1.getPage() + "\n=====================");
        System.out.println("Class Buyer\n Name = " + Buyer.NAME + "\n Sex = " + br1.sex + "\n Age = " + br1.age + "\n Wallet = " + br1.money +"\n=====================");
        System.out.println("Class PostOffice\n IsOpen = " + post1.open +"\n=====================");

    }
}
