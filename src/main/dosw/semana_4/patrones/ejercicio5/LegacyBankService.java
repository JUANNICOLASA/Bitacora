package main.dosw.semana_4.patrones.ejercicio5;

public class LegacyBankService {

    public void initializeSystem() {
        System.out.println("1. Inicializando sistema bancario antiguo...");
    }

    public void establishConnection() {
        System.out.println("2. Estableciendo conexión con el banco...");
    }

    public void authenticateUser() {
        System.out.println("3. Autenticando usuario...");
    }

    public void loadSecurityContext() {
        System.out.println("4. Cargando contexto de seguridad...");
    }

    public void loadAccountContext(String account) {
        System.out.println(
                "5. Cargando información de la cuenta " + account + "..."
        );
    }

    public void verifyBalance(int cents) {
        System.out.println(
                "6. Verificando saldo para una operación de "
                        + cents + " centavos..."
        );
    }

    public void prepareTransaction() {
        System.out.println("7. Preparando transacción...");
    }

    public void executeTransaction(String account, int cents) {
        System.out.println(
                "8. Ejecutando transacción de "
                        + cents
                        + " centavos en la cuenta "
                        + account
                        + "."
        );
    }
}