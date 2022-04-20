package com.company;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        //*R

        String firstName = " Ivan ";
        String middleName = " Ivanov ";
        String lastName = " Ivanovich ";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        //Задание 2

        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpper);

        //Задание 3

        StringBuilder fullNameSemen = new StringBuilder("Ivanov Ivan Ivanovich");
        fullNameSemen.delete(0, 21);
        fullNameSemen.append("Иванов Семён Семёнович");
        System.out.println(fullNameSemen);

        fullName = "Иванов Семён Семёнович";

        String fullNameSemenChar = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника  —  " + fullNameSemenChar);

    }
}
