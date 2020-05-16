package com.cetin.sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        al.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.valueOf(o1.age).compareTo(Integer.valueOf(o2.age));
            }
        });

        al.stream().forEach(System.out::println);

        al.sort(Comparator.comparing(Student::getAge).reversed());

        al.stream().forEach(System.out::println);

        Optional<String> xx = al.stream().map(x->x.name).filter("jai"::equalsIgnoreCase).findFirst();
        if (xx.isPresent()){
            Student a = al.stream().filter(x->x.name.equals(xx)).findFirst().get();
        }

    }
}
