package com.cetin.arraysolution.main;

import com.cetin.arraysolution.animal.Animal;
import com.cetin.arraysolution.animal.Dog;
import com.cetin.arraysolution.animal.Lion;
import com.cetin.arraysolution.animal.Tiger;
import com.cetin.arraysolution.person.Employee;
import com.cetin.arraysolution.person.Person;
import com.cetin.arraysolution.person.Student;

public class Main {
    public static void main(String[] args) {
        Person [] p = new Person[5];
        p[0] = new Student();
        p[1] = new Employee();


        Animal[] a =new Animal[5];
        a[0]  = new Lion();
        a[1] = new Tiger();
        a[2] = new Dog();

        Object[] obj = new Object[10];
        obj[0] = new Student();
        obj[1] = new Employee();

        obj[2] = new Tiger();
        obj[3] = new Dog();
        obj[4] = new Lion();

        obj[5] = new Person();
        obj[6] = new Animal();

        obj[7] = 5;    //AutoBoxing Integer.valueOf(5);
        obj[8] = 7.8;  //AutoBoxing  Double.valueOf(7.8);
        obj[9] = 'a';  //AutoBoxing Character.valueOf('a');

    }
}
