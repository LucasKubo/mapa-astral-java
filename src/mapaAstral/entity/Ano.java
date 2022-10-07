package src.mapaAstral.entity;

import java.time.LocalDateTime;
import java.time.Year;

public class Ano {
    public static boolean isBissexto(LocalDateTime dataNascimento) {
        return Year.isLeap(dataNascimento.getYear());
    }
}
