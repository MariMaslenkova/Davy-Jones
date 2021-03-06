package com.company;
// название класса должно совпадать с названием файла
// класс задает шаблон для обьекта
// каждый обьект может обладать набором характеристик(свойств) и функций (методов)

public class Cat extends Animal{ // расширение. это не обьект
    //для сокрытия полей (свойства методы) класса
    // можно использовать одно из 3 ключевых слов:
    // public - то свойство доступно извне
    // private - то нет доступа извне, доступно только внутри класса
    // protected - нет доступа извне(кроме текущего пакета), доступно только внутри класса потомка()

    // если модификатор доступа не указан, то по умолчанию используется мд - "package-protected" (защищен пакетом) - пэк- уник ндификатор проекта.
    // Всегда проименовывать свойства и функции.

    public float weight; // значение сразу не присваеивается
    String name;
    int age;
    private String color;



    public void eat (String food) { // функция eat с аргументом food
        System.out.println(food);
    }

    void sleep(int hours) {
        System.out.println("Кот заснул на " + hours + " ч.");
    }
    // перегрузка метода sleep
    void sleep(int hours, int minutes) {
        System.out.println("Кот заснул на " + hours + " ч. и "+ minutes + " мин.");
    }
    // перегрузка метода sleep
    void sleep(byte hours) {
        System.out.println("Кот заснул на " + hours + "(byte)");

        // переопределение метода изменения поведения метода родительского класса
    }
        @Override // пометка для переопределеия метода , отдает предпочтение методу наследнику
        protected void breath() {
            System.out.println("Котик дышит");
        }
    }
