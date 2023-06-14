package ru.geekbrains.lesson3.homework;

public abstract class BaseWorker {

    protected String name;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    abstract int Salary();
}
