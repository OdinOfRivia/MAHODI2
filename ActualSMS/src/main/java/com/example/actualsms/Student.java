package com.example.actualsms;

import java.util.Stack;

public class Student {
    public int id;
    public String fn;
    public String ln;
    public int age;
    public String email;
    public String phone;
    public String Country;
    public static  int numStudent;
    public Stack<Object> Classes;
    public String password;


    public Student(int id, String fn, String ln, int age, String email, String phone, String country, String password) {
        this.id=id;
        this.fn = fn;
        this.ln=ln;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password=password;
        Country = country;
        numStudent=numStudent+1;
        Stack<Object> stack23 = new Stack<Object>();
        Classes=stack23;
    }


    public void addClasses(Object e){
        Classes.add(e);

    }
}
