package atividade;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tempo {
        SimpleDateFormat tempo = new SimpleDateFormat("HH:mm:ss");
        Date hora = Calendar.getInstance().getTime();
        
    public void tempoFormatado(){
        String dataFormatada = tempo.format(hora);
        System.out.println("--- "+dataFormatada+" ---");
    }
}
