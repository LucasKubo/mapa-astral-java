package src.mapaAstral.enums;

import java.time.LocalTime;

public enum AscendenteAquarioEnum {
    PEIXES(LocalTime.of(6,31),LocalTime.of(8,30)),
    ARIES(LocalTime.of(8,31),LocalTime.of(10,30)),
    TOURO(LocalTime.of(10,31),LocalTime.of(12,30)),
    GEMEOS(LocalTime.of(12,31),LocalTime.of(14,30)),
    CANCER(LocalTime.of(14,31),LocalTime.of(16,30));
    private final LocalTime horaInicial;
    private final LocalTime horaFinal;

    AscendenteAquarioEnum(LocalTime horaInicial, LocalTime horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public LocalTime getHoraInicial() {
        return horaInicial;
    }

    public LocalTime getHoraFinal() {
        return horaFinal;
    }
}
