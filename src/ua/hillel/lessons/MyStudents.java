package ua.hillel.lessons;

import java.util.List;
import java.util.Random;

public class MyStudents {
    public static void main(String[] args) {
        List<String> myStudents = List.of(
                "Володимир Старчевський",
                "Сергій Полішевський  ",
//                "Дмитро Левченко",
//                "Ігор Клименко",
//                "Oleh Shchurko",
                "Костянтин Таламанюк",
                "Дмитро Василина"
//                "Тетяна Сокоренко"
        );
        System.out.println(myStudents.get(new Random().nextInt(myStudents.size())));
    }
}
