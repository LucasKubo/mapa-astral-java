package src.mapaAstral.entity;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Scanner;


public class Local {
    public static ZoneId lerLocal(Scanner sc){
        System.out.println("Digite seu local de nascimento (exemplo: America/Sao_Paulo): ");
        String localDeNascimento = sc.nextLine();
        return ZoneId.of(localDeNascimento);
    }

    public static ZoneOffset getTimeZone(ZoneId zoneId, LocalDateTime localDateTime){
        return ZonedDateTime.of(localDateTime, zoneId).getOffset();
    }
}
