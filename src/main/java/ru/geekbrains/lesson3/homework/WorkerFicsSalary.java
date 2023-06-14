package ru.geekbrains.lesson3.homework;

public class WorkerFicsSalary extends BaseWorker {
    private int hourlyRate;
    private double salary;

    @Override
    int Salary() {
        salary = 22.8 * 8 * hourlyRate;
        return (int) salary;
    }

    public WorkerFicsSalary(String name, int HourlyRate) {
        this.name = name;
        this.hourlyRate = HourlyRate;
        this.salary = Salary();
    }

    @Override
    public String toString() {
        return Integer.toString((int) salary);
    }
}
