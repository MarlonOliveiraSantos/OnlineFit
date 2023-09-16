package MercadoFit;

public class ClienteCompleto extends usuario implements Cliente, iniciante{
    public ClienteCompleto(String nome) {
        super(nome);
    }

    @Override
    public void dadosCliente() {
        System.out.println("\nDados do cliente");
    }

    @Override
    public void basico() {
        System.out.println("\nA. Consulte um Profissional de Saúde: Antes de começar qualquer programa de treinamento, é aconselhável fazer um check-up médico e discutir seus planos com um profissional de saúde.");
        System.out.println("\nB. Como iniciante, é importante começar com exercícios básicos para construir uma base sólida. Isso inclui exercícios como agachamentos, supinos, levantamento terra, flexões e puxadas. ");
        System.out.println("\nC. A técnica adequada é fundamental para evitar lesões e obter resultados eficazes. Peça a um instrutor da academia que o oriente sobre a forma correta para cada exercício.");
        System.out.println("\nD. A dieta desempenha um papel crucial no seu sucesso na academia. Certifique-se de comer alimentos equilibrados que forneçam os nutrientes necessários para sustentar o treinamento.\n\n");
    }
}
