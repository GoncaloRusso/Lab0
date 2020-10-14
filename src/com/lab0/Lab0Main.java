package com.lab0;

public class Lab0Main {
    public static void main(String[] args) {
        Person goncalo = new Person(1, "Goncalo");
        Person francisco = new Person(2,"Francisco");
        Person manuel = new Person(3,"Manuel");
        Group grupo1 = new Group(goncalo);
        grupo1.addMember(francisco);
        grupo1.addMember(manuel);
        System.out.printf(grupo1.toString());

        int id = goncalo.getId();
        String nome = goncalo.getName();
        System.out.println("Nome: " + nome + "\nId: " + id);
    }
}
