package src.mapaAstral.entity;

import java.time.ZoneId;
import java.util.Scanner;
import java.util.TimeZone;

public class Local {
    public static ZoneId lerLocal(Scanner sc){
        System.out.println("Digite seu local de nascimento (exemplo: America/Sao_Paulo): ");
        String localDeNascimento = sc.nextLine();
        return ZoneId.of(localDeNascimento);
    }

    public static TimeZone getTimeZone(ZoneId zoneId){
        return TimeZone.getTimeZone(zoneId);
    }
}
