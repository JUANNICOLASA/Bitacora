package main.dosw.semana_4.patrones.ejercicio7;

public class Ejercicio7 {

    public static void main(String[] args) {

        System.out.println(" EJERCICIO 7 - CHAIN + STATE");

        System.out.println(" CASO 1 - DOCUMENTO APROBADO");

        Document approvedDocument =
                new Document(
                        "Plataforma Empresarial - Documento A"
                );

        DocumentHandler author =
                new AuthorHandler(true);

        DocumentHandler leader =
                new LeaderHandler(true);

        DocumentHandler legal =
                new LegalHandler(true);

        DocumentHandler financial =
                new FinancialHandler(true);

        DocumentHandler finalApproval =
                new FinalApprovalHandler(true);

        author
                .setNext(leader)
                .setNext(legal)
                .setNext(financial)
                .setNext(finalApproval);

        System.out.println(
                "Estado inicial: "
                        + approvedDocument.getStateName()
        );

        author.handle(approvedDocument);

        System.out.println(
                "Estado final: "
                        + approvedDocument.getStateName()
        );


        System.out.println(" CASO 2 - DOCUMENTO RECHAZADO");

        Document rejectedDocument =
                new Document(
                        "Plataforma Empresarial - Documento B"
                );

        DocumentHandler author2 =
                new AuthorHandler(true);

        DocumentHandler leader2 =
                new LeaderHandler(true);

        DocumentHandler legal2 =
                new LegalHandler(false);

        DocumentHandler financial2 =
                new FinancialHandler(true);

        DocumentHandler finalApproval2 =
                new FinalApprovalHandler(true);

        author2
                .setNext(leader2)
                .setNext(legal2)
                .setNext(financial2)
                .setNext(finalApproval2);

        System.out.println(
                "Estado inicial: "
                        + rejectedDocument.getStateName()
        );

        author2.handle(rejectedDocument);

        System.out.println(
                "Estado final: "
                        + rejectedDocument.getStateName()
        );
    }
}