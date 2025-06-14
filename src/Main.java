public class Main {
    public static void main(String[] args) {
        System.out.println("Классная работа 1");
        System.out.println("Задача 1");
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }*/
        /*int salary = 65535;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);*/
        System.out.println("Домашняя работа 1");
        System.out.println("Задача 1");
        /*for (int i = 0; i < 10; i++) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 3");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 4");
        for (int i = 10; i > -10; i--) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 5");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("Високосный год " + i);
        }
        System.out.println("Задача 6");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println("Задача 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println("Задача 9");
        salary = 29000;
        total = 0;
        for (int i = 0; i <= 12; i++) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println("Задача 10");
        int number = 0;
        for (int i = 2; i <= 20; i = i + 2) {
            number = number + 1;
            System.out.println( number + " * 2 = " + i);
        }*/
        System.out.println("Классная работа 2");
        System.out.println("Задача 1");
        /*int salary = 65535;
        int total = 0;
        //int i = 0;
        //for (; total < 1_000_000; i++) {
        while (total < 1000000) {
            total = total + total/100;
            total = total + salary;
        //    System.out.println("Месяц " + i + " Итого " + total);
            System.out.println(total);
        }
        //System.out.println(total);
        //System.out.println(i);*/
        System.out.println("Задача 2");
        /*int start = 5;
        while (start > 0) {
            System.out.println (start);
            start = start - 1;
        }
        System.out.println(start);
        System.out.println("Задача 3");
        int days = 10; // изначальное количество дней в Париже

        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки осталось " + days + " дней.");
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }*/
        System.out.println("Задача 3");
        /*int salary = 65535;
        int total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total = total + total/100;
            total = total + salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(total);
        System.out.println(i);*/
        System.out.println("Задача 4");
        /*int userWantsToСontinue = 1;
// Переменная, обозначающая, что юзер хочет продолжить игру
// 1 — хочет продолжить, 0 — не хочет продолжать играть
        int level = 1;
// Переменная со значением номера уровня
        do {
            System.out.println("Завершен уровень" + level);
            // Выводим текст с номером уровня игры
            System.out.println("Хотите продолжить?");
            // Спрашиваем, хочет ли пользователь продолжить игру
            level++;
            // К переменной level прибавляем 1, это следующий уровень
        }
        while (userWantsToСontinue == 1 && level < 5);
// Записываем условие: если пользователь хочет продолжить
// и номер уровня меньше или равен 5*/
        System.out.println("Задача 5");
        /*int points = 10;

        do {
            System.out.println("Осталось " + points + " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окончена!");*/
        /*for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Пропускаем четные числа
            }
            System.out.println(i);
        }*/
        /*for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Выход из цикла, когда i равно 5
            }
            System.out.println(i);
            }*/
        System.out.println("Задача 6");
        // Объявляем переменную dayNumber, она равна номеру дня в месяце
        /*for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            // Каждый день проверяем, является ли он третьим (выходным)
            if (dayNumber % 3 == 0) {
                // Выводим сообщение
                System.out.println("Сегодня отдыхаем!");
                // Ждем следующий день
                continue;
            }
            System.out.println("Сегодня рабочий день");
            // Если день не выходной, выводим сообщение
        }*/
        System.out.println("Домашняя работа");
        System.out.println("Задача 1");
        /*int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2459000) {
            i ++;
            total = total + salary;
                System.out.println("Месяц " + i + " Итого " + total);
        }
        System.out.println(total);
        System.out.println(i);*/

        System.out.println("Задача 2");

        /*int i = 0;
        while (i < 10) {
            i ++;
            System.out.print(i + " ");
        }
        System.out.println();
        i = 11;
        while (i > 1) {
            i --;
            System.out.print(i + " ");
        }*/
        System.out.println("Задача 3");
        /*int y = 12000000;
        int birthRate = y / 1000 * 17;
        int mortality = y / 1000 * 8;
        int totalPopulation = 0;
        int population = (birthRate - mortality);
        for (int i = 1; i <= 10 ; i++) {
            totalPopulation =  totalPopulation + population;
            System.out.println(i + " " + totalPopulation);
        }
        totalPopulation = totalPopulation + y;
        System.out.println(totalPopulation);*/

        System.out.println("Задача 4");
        /*int total = 15000;
        for (int i = 1; total < 12000000; i++) {
            total = total + (total * 7 / 100);
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
        }*/
        System.out.println("Задача 5");
        /*int total = 15000;
        int i = 1;
        for (; total < 12000000; i++) {
            total = total + (total * 7 / 100);
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println(total);
        System.out.println(i);*/

        System.out.println("Задача 6");
        /*int total = 15000;
        int i = 1;
        //int years = 9;
int annualPercentage = (total * 7 / 100) * 12;
        for (; i <= 9 * 12; i++) {
            total = total + annualPercentage;
            if (i % 6 == 0)
            {
                System.out.println("Месяц " + i + " Сумма накоплений равна " + total + " рублей");
            }
        }
        System.out.println(total);
        System.out.println(i);*/
        System.out.println("Задача 7");
        int friday = 2;
        for (int dayNumber = 1; dayNumber <= 31; dayNumber++) {
            friday = friday + 6;
            if (friday % 7 == 0) {
                System.out.println("Сегодня пятница!" + dayNumber);
                continue;
            }
            System.out.println("Сегодня другой день" + dayNumber);
        }
        System.out.println("Задача 8");
        int year = 1825;
        while (year < 2125) {
            year = year + 1;
            if (year % 79 == 0) {
                System.out.println(year);
                            }
        }

    }

}
