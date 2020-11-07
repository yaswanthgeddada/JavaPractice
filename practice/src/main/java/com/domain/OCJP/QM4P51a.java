package com.domain.OCJP;
 

public class QM4P51a {
    int size = 1;

    public static void main(String[] args) {
        QM4P51a list = new QM4P51a();
        list.size = 10;
        ListManager lm = new ListManager();
        lm.expandList(list);
        System.out.println("list.size=" + list.size);
    }
} // end of QM3P50

