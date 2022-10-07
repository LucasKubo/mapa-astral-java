package src.mapaAstral.entity;

import java.time.LocalDateTime;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Data {
    public static LocalDateTime lerData(Scanner sc){
        try{
            System.out.println("Digite sua data de nascimento (dd/MM/yyyy HH:mm): ");
            String dataNascimento = sc.nextLine();
            return LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String formatar(LocalDateTime dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        return formatter.format(dataNascimento);
    }

    public static MonthDay toMonthDay(LocalDateTime localDateTime){
        return MonthDay.of(localDateTime.getMonth(),localDateTime.getDayOfMonth());
    }

}
