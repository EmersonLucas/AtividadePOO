package atividade;

import java.time.Duration;
import java.time.LocalDateTime;

/*
 * @author Emerson Lucas
 */
public class Carro {
    String cor, marca;
    int ano;
    private float nivelDoCombustivel;
    float valor;
    private boolean ligado = false; 

    public Carro(String cor, String marca, int ano, float valor) {
        this.cor = cor;
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
    }  

    @Override
    public String toString() {
        return """
               caracteristicas do veiculo:
               {cor =  """ + '}' + this.cor +
                ", marca = " + this.marca +
                ", ano = " + this.ano + ", valor = R$ " + this.valor +
                ", ligado = " + this.ligado;
    }
    public void ligar(boolean ligado){
        this.ligado = true;
    }
    
    public void desligar(boolean ligado){
        this.ligado = false;
    }
    
    public void abastecer( int nivelDoCombustivel){
        if (nivelDoCombustivel <= 0){
            System.out.println("Valor não pode ser menor ou igual a zero");
        }
        else if (nivelDoCombustivel >= 31){
        System.out.println("Valor maior que o tanque");
        }   
        else{ 
            this.nivelDoCombustivel = nivelDoCombustivel;
            System.out.println("Carro abastecido"); 
        }
    } 
    
    public void acelerar(){
        final float consumo = 0.5F;
        float gasto = 0F;
        double distanciaPercorrida = 0;
        
        LocalDateTime inicioPercurso = LocalDateTime.now();
        
       if(this.ligado == true){
           while( this.nivelDoCombustivel != 0 ){
               try {
                   Tempo momento = new Tempo();
                   momento.tempoFormatado();
                   
                   Thread.sleep(1000);
                   
                   nivelDoCombustivel -= consumo;
                   gasto += consumo;
                   Duration duracao = Duration.between(inicioPercurso, LocalDateTime.now());
                   double tempo_decorrido = duracao.getSeconds();
                   distanciaPercorrida = tempo_decorrido;
                   
                   System.out.printf("Andou: %.2f km e gastou %.2f L\n",distanciaPercorrida, gasto);
                   System.out.println("Ao infinito e além");
               } catch (InterruptedException ex) {
                   System.out.println("Deu erro aí oh");
               }
           }
        System.out.println("Sem gazoza");
       }else System.out.println("O carro esta desligado");
    }
    
    public void buzinar(){
        System.out.println("BIP BIP");
    }
}
