package app;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(
                "Іванов Олег Андрійович",
                "Інженер",
                "ivanov@gmail.com",
                "+380971234000",
                32
        );

        // Доступ до поля напряму неможливий
//        System.out.println(employee.fullName);

        // Доступ до поля можливий через сеттер
        System.out.println(employee.getFullName());

        System.out.println("-------------");
        Car car = new Car();
        car.start();
    }
}
