package project25;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TimePractice {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());

        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("YYYY--MM-dd")));

    }
}
