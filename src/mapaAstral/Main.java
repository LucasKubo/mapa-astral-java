package src.mapaAstral;

import src.mapaAstral.entity.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LocalDateTime dataNascimento = Data.lerData(sc);
        ZoneId localNascimento = Local.lerLocal(sc);
        boolean anoBissexto = Ano.isBissexto(dataNascimento);
        String dataFormatada = Data.formatar(dataNascimento);
        String timeZoneNascimento = Local.getTimeZone(localNascimento).getID();
        String signo = Signo.of(Data.toMonthDay(dataNascimento));
        String ascendente = Ascendente.of(signo,dataNascimento);
        String signoLunar = SignoLunar.of(dataNascimento.toLocalTime(),localNascimento.toString());

        System.out.println((anoBissexto) ? "Ano bissexto" : "Ano não bissexto");
        System.out.println(dataFormatada);
        System.out.println("TimeZone de Nascimento: " +  timeZoneNascimento);
        System.out.println("Signo: " + signo);
        System.out.println("Ascendente: " + ascendente);
        System.out.println("Signo lunar: " + signoLunar);

        sc.close();
    }
}
