package com.dio.bootcamp;

public class Main {

    /*
     *   Class de resolução dos exercícios das aulas do curso de Lógica Condicional e Controle de Fluxo.
     * */

    public static void main(String[] args) {


        //Método main para a chamada dos sub métodos respecitvos de cada aula

        System.out.println("**********************************************************************");
        System.out.println("=============================== Aula 01 ==============================");
        System.out.println("**********************************************************************");

        aula01();

        System.out.println("**********************************************************************");
        System.out.println("=============================== Aula 02 ==============================");
        System.out.println("**********************************************************************");

        aula02();

        System.out.println("**********************************************************************");
        System.out.println("=============================== Aula 03 ==============================");
        System.out.println("**********************************************************************");

        aula03();

        System.out.println("**********************************************************************");
        System.out.println("=============================== Aula 04 ==============================");
        System.out.println("**********************************************************************");

        aula04();
    }

    public static void aula01() {

        int i1 = 10;
        int i2 = 20;
        float f1 = 4.5f;
        float f2 = 3.5f;
        double d1 = 59.6d;
        char c1 = 'x';
        char c2 = 'y';
        String s1 = "Fulano";
        String s2 = "Fulano";
        String s3 = "Cicrano";
        boolean b1 = true;
        boolean b2 = false;

        long l1 = 1597L;
        long l2 = 8967L;
        byte y1 = 1;
        short h1 = 25;

        System.out.println("i1 == i2 " + (i1 == i2));
        System.out.println("i1 != i2 " + (i1 != i2));
        System.out.println("i1 > i2 " + (i1 > i2));
        System.out.println("i1 <= i2 " + (i1 <= i2));

        System.out.println("f1 == f2 " + (f1 == f2));
        System.out.println("f1 != f2 " + (f1 != f2));
        System.out.println("f1 >= f2 " + (f1 >= f2));
        System.out.println("f1 < f2" + (f1 < f2));

        System.out.println("c1 == c2 " + (c1 == c2));
        System.out.println("c1 != c2 " + (c1 != c2));
        System.out.println("c1 > c2 " + (c1 > c2));
        System.out.println("c1 <= c2 " + (c1 <= c2));

        System.out.println("s1 == s2 " + (s1 == s2));
        System.out.println("s1 == s3 " + (s1 == s3));
        System.out.println("s1 != s2 " + (s1 != s2));
//        System.out.println("s1 >= s2 " + (s1 >= s2));
//        System.out.println("s1 < s2 " + (s1 < s2));

        System.out.println("b1 == b2 " + (b1 == b2));
        System.out.println("b1 != b2 " + (b1 != b2));
//        System.out.println("b1 > b2 " + (b1 > b2));
//        System.out.println("b1 <= b2 " + (b1 <= b2));

        System.out.println("i2 > f1 " + (i2 > f1));
        System.out.println("d1 == h1 " + (d1 == h1));
//        System.out.println("s2 != c1 "+(s2!=c1));
//        System.out.println("s3 !=i1 i1 "+(s3!=h1));

        System.out.println("l1 == i2 " + (l1 == i2));
        System.out.println("l2 == i1 " + (l2 == i1));
        System.out.println("y1 == h1 " + (y1 == h1));

    }

    public static void aula02() {

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        System.out.println("b1 && b2: " + (b1 && b2));
        System.out.println("b1 && b3: " + (b1 && b3));

        System.out.println("b2 || b3: " + (b2 || b3));
        System.out.println("b2 || b4: " + (b2 || b4));

        System.out.println("!b1: " + !b1);
        System.out.println("!b2: " + !b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 30f;

        System.out.println("((i1 + i2) < (f1 + f2) && true: " + (((i1 + i2) < (f1 + f2) && true)));
        System.out.println("(i1 > i2) || (f2 < f1): " + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println(salarioBaixo && muitosDependentes);

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);

        System.out.println("Recebe auxílio: " + recebeAuxilio);

    }

    public static void aula03() {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    public static void ifFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else {
            if (mes == 2) {
                System.out.println("Fevereiro");
            } else {
                if (mes == 3) {
                    System.out.println("Março");
                } else {
                    if (mes == 4) {
                        System.out.println("Abril");
                    } else {
                        if (mes == 5) {
                            System.out.println("Maio");
                        } else {
                            if (mes == 6) {
                                System.out.println("Junho");
                            } else {
                                if (mes == 7) {
                                    System.out.println("Julho");
                                } else {
                                    if (mes == 8) {
                                        System.out.println("Agosto");
                                    } else {
                                        if (mes == 9) {
                                            System.out.println("Setembro");
                                        } else {
                                            if (mes == 10) {
                                                System.out.println("Outubro");
                                            } else {
                                                if (mes == 11) {
                                                    System.out.println("Novembro");
                                                } else {
                                                    if (mes == 12) {
                                                        System.out.println("Dezembro");
                                                    } else {
                                                        System.out.println("Mes indefinido");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void ifSemFlecha() {

        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        } else if (mes == 2) {
            System.out.println("Fevereiro");
        } else if (mes == 3) {
            System.out.println("Março");
        } else if (mes == 4) {
            System.out.println("Abril");
        } else if (mes == 5) {
            System.out.println("Maio");
        } else if (mes == 6) {
            System.out.println("Junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        } else if (mes == 8) {
            System.out.println("Agosto");
        } else if (mes == 9) {
            System.out.println("Setembro");
        } else if (mes == 10) {
            System.out.println("Outubro");
        } else if (mes == 11) {
            System.out.println("Novembro");
        } else if (mes == 12) {
            System.out.println("Dezembro");
        } else {
            System.out.println("Mês indefinido");
        }

    }

    public static void ifFerias() {

        String mes = "Julho";

        if (mes == "Julho" || mes == "Dezembro" || mes == "Janeiro") {
            System.out.println("Ferias");
        }

    }

    public static void ifMenor() {

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)) {
            System.out.println("Funcionário deve receber auxílio");
        }

        boolean recebeAuxilio = salarioBaixo && muitosDependentes;

        if (recebeAuxilio) {

            System.out.println("Funcionário deve receber auxílio");

        } else {
            System.out.println("Funcionário não deve receber auxílio");
        }

    }

    public static void switchSemana() {

        String dia = "Terça";

        switch (dia) {
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça:":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sábado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(1);
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }


    }

    public static void switchNumero() {

        int numero = 4;

        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Certo");
                break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Tavlez");
                break;
            default:
                System.out.println("Número inválido");
                break;

        }

    }

    public static void switchFerias() {

        String mes = "Dezembro";

        switch (mes) {
            case "Janeiro":
            case "Julho":
            case "Dezembro":
                System.out.println("Férias");
                break;
            default:
                System.out.println("Mês indefinido");
                break;
        }


    }

    public static void  aula04(){




    }
}
