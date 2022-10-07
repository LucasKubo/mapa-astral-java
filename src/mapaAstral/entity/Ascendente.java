package src.mapaAstral.entity;

import src.mapaAstral.enums.AscendenteAquarioEnum;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ascendente {
    public static String of(String signo, LocalDateTime dataNascimento){
        LocalTime horaDeNascimento = dataNascimento.toLocalTime();
        if(signo.equals("Aquário")){
            if(isWithingTime(horaDeNascimento, AscendenteAquarioEnum.PEIXES.getHoraInicial(),AscendenteAquarioEnum.PEIXES.getHoraFinal())){
                return "Peixes";
            }else if (isWithingTime(horaDeNascimento,AscendenteAquarioEnum.ARIES.getHoraInicial(),AscendenteAquarioEnum.ARIES.getHoraFinal())){
                return "Aries";
            }else if (isWithingTime(horaDeNascimento,AscendenteAquarioEnum.CANCER.getHoraInicial(),AscendenteAquarioEnum.CANCER.getHoraFinal())){
                return "Cancer";
            } else if (isWithingTime(horaDeNascimento,AscendenteAquarioEnum.GEMEOS.getHoraInicial(),AscendenteAquarioEnum.GEMEOS.getHoraFinal())) {
                return "Gemeos";
            }else if (isWithingTime(horaDeNascimento,AscendenteAquarioEnum.TOURO.getHoraInicial(),AscendenteAquarioEnum.TOURO.getHoraFinal())) {
                return "Touro";
            }
        }
        return "Ascendente não encontrado";
    }

    private static boolean isWithingTime(LocalTime time, LocalTime startTime, LocalTime endTime){
        return (time.isAfter(startTime) || time.isBefore(endTime));
    }
}
