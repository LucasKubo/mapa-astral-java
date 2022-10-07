package src.mapaAstral.entity;

import src.mapaAstral.enums.SignoEnum;

import java.time.MonthDay;

public class Signo {
    public static String of(MonthDay dataNascimento){

        if(isWithinRange(dataNascimento, SignoEnum.AQUARIO.getDataInicial(),SignoEnum.AQUARIO.getDataFinal())){
            return "Aquário";
        }else if(isWithinRange(dataNascimento,SignoEnum.PEIXES.getDataInicial(), SignoEnum.PEIXES.getDataFinal())){
            return "Peixes";
        }else if(isWithinRange(dataNascimento,SignoEnum.ESCORPIAO.getDataInicial(), SignoEnum.ESCORPIAO.getDataFinal())){
            return "Escorpiao";
        }else {
            return "Signo não encontrado";
        }
    }

    private static boolean isWithinRange(MonthDay date, MonthDay startDate, MonthDay endDate){
        return (date.isAfter(startDate) || date.isBefore(endDate));
    }
}
