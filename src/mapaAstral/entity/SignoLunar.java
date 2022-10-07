package src.mapaAstral.entity;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class SignoLunar {
    public static String of(LocalTime horaNascimento, String localNascimento){
        Set<String> zones = ZoneId.getAvailableZoneIds();

        for (String s : zones) {
            if(s.contains(localNascimento)){
                ZoneId zoneId = ZoneId.of(s);
                if(zoneId.toString().equals("America/Recife") && horaNascimento.isAfter(LocalTime.of(12,0))){
                    return "Casimiro";
                }
                if(zoneId.toString().equals("America/Cuiaba") && horaNascimento.isBefore(LocalTime.of(12,0))){
                    return "Odin";
                }
                if(zoneId.toString().equals("America/Sao_Paulo")){
                    return "Gandalf";
                }
            }
        }

        return "Em construção";
    }
}
