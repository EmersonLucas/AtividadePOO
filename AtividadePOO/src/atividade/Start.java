package atividade;
/*
 * @author Emerson Lucas
 */
public class Start {
    public static void main(String[] args) {
        
        Carro fuscao = new Carro("Preto","volkswagen",1980,15000);
        System.out.println(fuscao);
        
        fuscao.ligar(true);
        fuscao.abastecer(30);
        fuscao.buzinar();
        fuscao.acelerar();
    }
}
