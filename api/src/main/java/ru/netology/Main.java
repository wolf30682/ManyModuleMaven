package ru.netology;

public class Main {
    public static void main(String[] args) {
        ru.netology.MyService myService = new ru.netology.MyService();
        System.out.println(myService.getMyEntity());
        System.out.println(myService.setMyEntity(new MyEntity("second")));
        System.out.println(myService.getMyEntity());
    }
}
