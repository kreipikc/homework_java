import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // Task 12 (2 file)
    public static boolean checkDivisionNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return true;
    }

    // Task 13 (2 file)
    public static int numberIndexOnArray(List<Integer> list, int index) {
        if (index < 0 || index > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(index);
    }

    // Task 14 (2 file)
    public static void checkPassword(String pass) {
        if (pass.length() < 8) {
            throw new PersonalExceptions.WeakPasswordException("Пароль слишком простой");
        }
    }

    // Task 15 (2 file)
    public static void checkDateFormat(String date) {
        String regex = "^([0-2][0-9]|3[0-1]).(0[0-9]|1[0-2]).(1[0-9][0-9][0-9]|20[0-2][0-5])$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if (!matcher.matches()) {
            throw new PersonalExceptions.DateTimeParseException("Строка не соответствует паттерну 'dd.MM.yyyy'");
        }
    }

    // Task 16 (2 file)
    public static String plusTwoStrings(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new NullPointerException();
        }
        return str1 + str2;
    }

    // Task 17 (2 file)
    public static int divisionTwoInt(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    // Task 18 (2 file)
    public static double sqrtPersonal(double a) {
        if (a < 0) {
            throw new ArithmeticException("Число не может быть меньше 0");
        }
        return Math.sqrt(a);
    }

    // Task 19 (2 file)
    public static double celsiusToFahrenheit(double cel) {
        if (cel < -273.15) {
            throw new ArithmeticException("Цельсия не могут быть меньше абсолютного нуля");
        }
        return (cel * 1.8) + 32;
    }

    // Task 20 (2 file)
    public static void checkStringOnNull(String str) {
        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Строка пустая или равна null");
        }
    }

    // Task 1 (3 file)
    public static class Person {
        String name, gender;
        int age;
        public Person(String name, String gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public void printAllInfo() {
            System.out.printf("Name: %s, Gender: %s, Age: %d\n", name, gender, age);
        }

        public void plusOneAge() {
            age += 1;
        }

        public void rename(String newName) {
            this.name = newName;
        }
    }

    // Task 2 (3 file)
    public static class Worker extends Person {
        int salary;
        public Worker(String name, String gender, int age) {
            super(name, gender, age);
        }
    }

    public static class Manager extends Worker {
        List<Worker> subordinates;
        public Manager(String name, String gender, int age) {
            super(name, gender, age);
        }
    }

    // Task 3 (3 file)
    public interface Animal {
        void makeSound();
    }

    public static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Мяу");
        }
    }

    public static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Гав");
        }
    }

    public static class Cow implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Муу");
        }
    }

    // Task 4 (3 file)
    public abstract static class Transport {
        public abstract void Move();
    }

    public static class Car extends Transport {
        @Override
        public void Move() {
            System.out.println("Едет машина");
        }
    }

    public static class Bike extends Transport {
        @Override
        public void Move() {
            System.out.println("Едет мотоцикл");
        }
    }

    // Task 5 (3 file)
    public static class Book {
        String title, author, year;
        public Book(String title, String author, String year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
    }

    public static class Library {
        List<Book> listBook;
        public Library(List<Book> listBook) {
            this.listBook = listBook;
        }
        public Library() {
            this.listBook = new ArrayList<>();
        }

        public void addBook(Book book) {
            listBook.add(book);
        }

        public Book searchAuthor(String author) {
            for (Book el : listBook) {
                if (Objects.equals(el.author, author)) {
                    return el;
                }
            }
            return null;
        }

        public Book searchYear(String year) {
            for (Book el : listBook) {
                if (Objects.equals(el.year, year)) {
                    return el;
                }
            }
            return null;
        }
    }

    // Task 6 (3 file)
    public static class BankAccount {
        final int accountNumber;
        private double balance;

        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void replenishmentOfFunds(double money) {
            balance += money;
        }

        public void withdrawalOfFunds(double money) {
            if (money > balance) {
                throw new RuntimeException("Сумма снятия не может быть больше баланса");
            }
            balance -= money;
        }

        public double getInfoBalance() {
            return balance;
        }
    }

    // Task 7 (3 file)
    public static class Counter {
        static int countClassInstance = 0;
        public Counter() {
            countClassInstance++;
        }

        public int getCount() {
            return countClassInstance;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Task 1 (1 file)
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        if (num % 2 == 0) {
//            System.out.printf("Число %d четное", num);
//        } else {
//            System.out.printf("Число %d нечетное", num);
//        }

        // Task 2 (1 file)
//        System.out.println("Введите 3 числа");
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//        int num3 = scanner.nextInt();
//        System.out.println("Минимальное число: " + Math.min(Math.min(num1, num2), num3));

        // Task 3 (1 file)
//        for (int i = 1; i <= 10; i++) {
//            System.out.printf("%d * 5 = %d\n", i, i * 5);
//        }

        // Task 4 (1 file)
//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        // Task 5 (1 file)


        // Task 6 (1 file)
//        System.out.print("Введите число: ");
//        int num = scanner.nextInt();
//        for (int i = 2; i < num; i++) {
//            if (num % i == 0) {
//                System.out.println("Число " + num + " не простое");
//                break;
//            } else if (num == i+1) {
//                System.out.println("Число " + num + " простое");
//            }
//        }

        // Task 7 (1 file)
//        System.out.print("Введите число: ");
//        int N = scanner.nextInt();
//        for (int i = N; i > 0; i--) {
//            System.out.print(i + " ");
//        }

        // Task 8 (1 file)
//        System.out.print("Введите 2 числа: ");
//        int A = scanner.nextInt();
//        int B = scanner.nextInt();
//        int sum = 0;
//        for (int i = Math.min(A, B); i <= Math.max(A, B); i++) {
//            if (i % 2 == 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

        // Task 9 (1 file)
//        System.out.print("Введите строку: ");
//        String str = scanner.nextLine();
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            System.out.print(ch);
//        }

        // Task 10 (1 file)
//        System.out.println("Введите число: ");
//        int num = scanner.nextInt();
//        String NumStr = Integer.toString(num);
//        System.out.println(NumStr.length());

        // Task 12 (2 file)
//        System.out.println(checkDivisionNumbers(5, 3));

        // Task 13 (2 file)
//        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numberIndexOnArray(integerList, 100));

        // Task 14 (2 file)
//        checkPassword("1234567");

        // Task 15 (2 file)
//        checkDateFormat("21.12.2024");

        // Task 16 (2 file)
//        System.out.println(plusTwoStrings("Hello", null));

        // Task 17 (2 file)
//        System.out.println(divisionTwoInt(5, 1));

        // Task 18 (2 file)
//        System.out.println(sqrtPersonal(-2));

        // Task 19 (2 file)
//        System.out.println(CelsiusToFahrenheit(10));

        // Task 20 (2 file)
//        checkStringOnNull("");

        // Task 1 (3 file)
//        Person p = new Person("Kirill", "Male", 10);
//        p.printAllInfo();
//        p.plusOneAge();
//        p.rename("Vlad");
//        p.printAllInfo();

        // Task 7 (3 file)
//        Counter c = new Counter();
//        Counter c1 = new Counter();
//        System.out.println(c.getCount());
    }
}