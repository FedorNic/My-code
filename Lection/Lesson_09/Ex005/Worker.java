package Lection.Lesson_09.Ex005;

public class Worker implements Comparable <Worker>{
    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    public Worker(String firstName, String lastName, int age, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

    @Override
    public String toString() {
        return String.format("\n%s %d %d", fullName(), age, salary);
    }

    @Override
    public int compareTo(Worker o) {
        //Вариант 2 - Как пример работы более читаемой сортировки без подключения AgeComporator
        return Integer.compare(this.age, o.age);

        //Вариант 1 - Базовая сортировка от разработчиков Java
//        if (this.age > o.age)
//            return 1;
//        else if (this.age < o.age)
//            return -1;
//        else
//            return 0;
    }
}

