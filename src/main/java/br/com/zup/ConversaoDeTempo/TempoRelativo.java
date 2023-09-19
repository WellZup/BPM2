package br.com.zup.ConversaoDeTempo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

// TODO: 19/09/2023 Você terá o desafio de ler um valor inteiro, faça a conversão desse valor para date e informe-o expresso no formato
//  dia/mês/ano horas:minutos:segundos.
//  Entrada
//  O arquivo de entrada contém um valor inteiro N.
//  - Saída
//  Imprima o tempo lido no arquivo de entrada (segundos), convertido para
//  horas:minutos:segundos, conforme exemplo fornecido.
//  - Obs
//  Utilize UTC (GMT-0)
//  - Exemplo:
//  Entrada: 1693225566
//  Saída: 28/Aug/2023 12:26:06
public class TempoRelativo {
    public static void main(String[] args) {
        long saltoNoTempo = 1693225566L;
        Date date = new Date(saltoNoTempo * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        String dataFormatada = sdf.format(date);
        System.out.println("Saída: " + dataFormatada);
    }

}
