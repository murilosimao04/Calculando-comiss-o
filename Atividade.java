import java.util.Scanner;

public class Atividade {
    private int codigo;
    private String nome;
    private double percentualComissao;

    public Atividade(int codigo, String nome, double percentualComissao) {
        this.codigo = codigo;
        this.nome = nome;
        this.percentualComissao = percentualComissao;
    }

    public double calcularPagamentoComissao(double valorVenda) {
        return valorVenda * percentualComissao / 100;
    }

    public double calcularPagamentoComissao(double valorVenda, double desconto) {
        return calcularPagamentoComissao(valorVenda) - desconto;
    }

    public String imprimir(double valorVenda, double desconto) {
        double valorComissao = calcularPagamentoComissao(valorVenda);
        double valorFinal = calcularPagamentoComissao(valorVenda, desconto);

        return "Código: " + codigo +
               "\nNome: " + nome +
               "\nValor Venda: " + valorVenda +
               "\n% Comissão: " + percentualComissao +
               "\nDesconto: " + desconto +
               "\nValor a Pagar: " + valorFinal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o código:");
        int codigo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do teclado
        System.out.println("Informe o nome:");
        String nome = scanner.nextLine();
        System.out.println("Informe o percentual de comissão:");
        double percentualComissao = scanner.nextDouble();

        Atividade atividade = new Atividade(codigo, nome, percentualComissao);

        System.out.println("Informe o valor da venda:");
        double valorVenda = scanner.nextDouble();
        System.out.println("Informe o valor do desconto:");
        double desconto = scanner.nextDouble();

        System.out.println(atividade.imprimir(valorVenda, desconto));
    }
}
