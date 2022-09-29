package src.mapaAstral;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
//        String nome;
//        LocalDateTime dataNascimentoLucas = LocalDateTime.of(2002, 1, 30, 21, 30);
//        Duration idade = Duration.between(dataNascimentoLucas,LocalDateTime.now());
//        Period idadePeriod = Period.between(dataNascimentoLucas.toLocalDate(),LocalDateTime.now().toLocalDate());
//        System.out.println(idadePeriod.getYears());
//        System.out.println("Eu vivi: " + idade.toDays() + " dias");
//        System.out.println(signo(MonthDay.from(dataNascimentoLucas)));

        Scanner sc = new Scanner(System.in);

        LocalDateTime dataNascimento = lerData(sc);
        imprimirDataFormatada(dataNascimento);
        verificaAnoBissexto(dataNascimento);
        System.out.println(calcularIdade(dataNascimento));

        sc.close();
    }

    private static void verificaAnoBissexto(LocalDateTime dataNascimento) {
        if(Year.isLeap(dataNascimento.getYear())){
            System.out.println("Ano bissexto");
        }else{
            System.out.println("Ano não bissexto");
        }
    }

    private static void imprimirDataFormatada(LocalDateTime dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(formatter.format(dataNascimento));
    }

    private static int calcularIdade(LocalDateTime dataNascimento) {
        return Period.between(dataNascimento.toLocalDate(), LocalDateTime.now().toLocalDate()).getYears();
    }

    private static String signo(MonthDay dataNascimento){
//        Áries: de 21 de março a 20 de abril;
//        Touro: de 21 de abril a 20 de maio;
//        Gêmeos: de 21 de maio a 20 de junho;
//        Câncer: de 21 de junho a 22 de julho;
//        Leão: de 23 de julho a 22 de agosto;
//        Virgem: de 23 de agosto a 22 de setembro;
//        Libra: de 23 de setembro a 22 de outubro;
//        Escorpião: de 23 de outubro a 21 de novembro;
//        Sagitário: de 22 de novembro a 21 de dezembro;
//        Capricórnio: de 22 de dezembro a 20 de janeiro;
//        Aquário: de 21 de janeiro a 18 de fevereiro;
//        Peixes: de 19 de fevereiro a 20 de março;

        MonthDay aquarioStartDate = MonthDay.of(1,21);
        MonthDay aquarioEndDate = MonthDay.of(2,18);

        MonthDay peixesStartDate = MonthDay.of(2,19);
        MonthDay peixesEndDate = MonthDay.of(3,20);

        if(isWithinRange(dataNascimento,aquarioStartDate,aquarioEndDate)){
            return "Aquário";
        }else if(isWithinRange(dataNascimento,peixesStartDate,peixesEndDate)){
            return "Peixes";
        }else {
            return "Não tem signo";
        }
    }

    private static String signoLunar(LocalTime time, String zone){
        Set<String> zones = ZoneId.getAvailableZoneIds();

        for (String s : zones) {
            if(s.contains(zone)){
                ZoneId zoneId = ZoneId.of(s);
                System.out.println(zoneId);
            }
        }

        return null;
    }

    private static boolean isWithinRange(MonthDay date, MonthDay startDate, MonthDay endDate){
        return (date.isAfter(startDate) || date.isBefore(endDate));
    }

    private static void quantoTempoNaoTreino(LocalDateTime dataUltimoTreino){
        LocalDateTime agora = LocalDateTime.now();
        Duration quantotempoNaotreino = Duration.between(dataUltimoTreino,agora);
        System.out.println("Não treino faz: " + quantotempoNaotreino.toDays() + " dias");
    }

    private static LocalDateTime lerData(Scanner sc){
        try{
            System.out.println("Digite sua data de nascimento: ");
            String dataNascimentoString = sc.nextLine();
            return LocalDateTime.parse(dataNascimentoString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
