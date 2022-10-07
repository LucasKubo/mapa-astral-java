package src.mapaAstral.enums;

import java.time.MonthDay;

public enum SignoEnum {
    AQUARIO(MonthDay.of(1,21), MonthDay.of(2,18)),
    PEIXES(MonthDay.of(2,19), MonthDay.of(3,20)),
    ESCORPIAO(MonthDay.of(10,23), MonthDay.of(11,21));


    private final MonthDay dataInicial;
    private final MonthDay dataFinal;

    SignoEnum(MonthDay dataInicial, MonthDay dataFinal) {
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;
    }

    public MonthDay getDataInicial() {
        return dataInicial;
    }

    public MonthDay getDataFinal() {
        return dataFinal;
    }
}
