package src.mapaAstral.entity;

import java.time.LocalDateTime;
import java.time.Period;

public class Idade {
    public static int calcular(LocalDateTime dataNascimento) {
        return Period.between(dataNascimento.toLocalDate(), LocalDateTime.now().toLocalDate()).getYears();
    }
}
