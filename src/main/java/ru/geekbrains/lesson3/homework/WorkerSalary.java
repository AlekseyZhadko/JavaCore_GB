package ru.geekbrains.lesson3.homework;

public class WorkerSalary extends BaseWorker {
    private int salary;

    @Override
    int Salary() {
        return salary;
    }

    public WorkerSalary(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return Integer.toString(salary);
    }
}
