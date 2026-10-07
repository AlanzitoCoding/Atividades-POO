package classes;

/*
 * Questão 2: Sistema de Caixa com Operações Financeiras
 * Implemente uma classe CashRegister que simula um caixa registrador:
 * Requisitos:
 *         ● Atributos privados: currentBalance (double), transactionCount (int), registerId (String)
 * ● Construtores sobrecarregados (pelo menos 3 variações com diferentes combinações de
 *         parâmetros)
 * ● Métodos públicos para operações:
 * o processPayment(double amount) - processa um pagamento
 * o processRefund(double amount) - processa um reembolso
 * o getDailyReport() - retorna relatório do dia
 * Sobrecarga de métodos: Implemente versões sobrecarregadas dos métodos de pagamento que
 * aceitam diferentes parâmetros (valor em double, valor em int, valor com descrição)
*/

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(String registerId) {
        this.registerId = registerId;
    }

    public CashRegister(String registerId, double currentBalance) {
        this(registerId);
        this.currentBalance = currentBalance;
    }

    public CashRegister(String registerId, double currentBalance, int transactionCount) {
        this(registerId, currentBalance);
        this.transactionCount = transactionCount;
    }


    public void processPayment(double amount) {
        this.currentBalance += amount;
        this.transactionCount++;
    }

    public void processRefund(double amount) {
        this.currentBalance -= amount;
        this.transactionCount++;
    }

    public void getDailyReport() {
        
    }
}
