public class Personagem {
    String nome;
    int vida = 100;

    void receberDano(int quantidade){
        vida = vida - quantidade;

        if (vida < 0) {
            vida = 0;
        }
    }

    void curar(int quantidade){
        vida = vida + quantidade;

        if (vida > 100) {
            vida = 100;
        }
    }
}