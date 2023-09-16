package MercadoFit;

import java.util.List;

public class Dicas extends Informativos{
    public List<Dicas> exibirListaDicas() {
        Dicas dicas1 = new Dicas();
        dicas1.texto = ("\nA. Periodização do Treino: Utilize um sistema de periodização para variar a intensidade e o volume do treino ao longo do tempo. Isso pode incluir fases de treino de força, hipertrofia, resistência e potência.");

        Dicas dicas2 = new Dicas();
        dicas2.texto = ("\nB. Treino de Força Explosiva: Incorpore exercícios que requerem movimentos rápidos e explosivos, como os saltos ou levantamentos olímpicos.");

                Dicas dicas3 = new Dicas();
        dicas3.texto = ("\nC.Treino de Alta Intensidade (HIIT): Integre sessões de HIIT para promover a queima de gordura e melhorar a resistência cardiovascular.");

                Dicas dicas4 = new Dicas();
        dicas4.texto = ("\nD.Foco na Mobilidade e Flexibilidade: Dedique tempo para exercícios de mobilidade e alongamento para melhorar a amplitude de movimento e prevenir lesões.");

        return List.of(dicas1,dicas2,dicas3,dicas4);
    }
}
