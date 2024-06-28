package org.example.reflect;

/**
 * @Program: javaweb
 * @ClassName Student
 * @Description:
 * @Author: JashoVan
 * @Create: 2024-06-23 11:08
 * @Version 1.0
 */
public class Student {
    private int id;
    public String name;
    protected int age;

    public Student() {
        System.out.println("Student constructor");
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Student constructor with id " + id + " and name " + name + " and age " + age);
    }

    private Student(int id) {
        this.id = id;
        System.out.println("private constructor with id " + id);
    }

    protected Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("protected constructor with id " + id + " and name " + name);

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //**************成员方法***************//
    public void show1(String name) {
        System.out.println("调用了：公有的，String参数的show1(): name = " + name);
    }

    protected void show2() {
        System.out.println("调用了：受保护的，无参的show2()");
    }

    void show3() {
        System.out.println("调用了：默认的，无参的show3()");
    }

    private String show4(int id) {
        System.out.println("调用了，私有的，并且有返回值的，int参数的show4(): id = " + id);
        return "abcd";
    }
}
