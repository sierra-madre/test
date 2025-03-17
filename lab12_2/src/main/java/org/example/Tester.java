package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private int englishLevel;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public int getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(int englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Tester(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public Tester(String name, String surname, int experienceInYears, int englishLevel) {
        this(name, surname);
        setExperienceInYears(experienceInYears);
        setEnglishLevel(englishLevel);
    }

    public Tester(String name, String surname, int experienceInYears, int englishLevel, double salary) {
        this(name, surname, experienceInYears, englishLevel);
        setSalary(salary);
    }

    public void print(String a){
        System.out.println(a + "\n" + getName() + "\n" + getSurname());
    }
    public void print(int a){
        System.out.println(a + "\n" + getExperienceInYears() + "\n" + getEnglishLevel());
    }
    public void print(double a){
        System.out.println(a + "\n" + getSalary());
    }
    public static void staticMethod(){
        System.out.println("Статический метод");
    }
}