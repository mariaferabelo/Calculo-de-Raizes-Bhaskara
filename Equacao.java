/*1) Crie uma classe denominada Equacao que possua três atributos do tipo double: a, b e c.
Tais atributos devem ser encapsulados, por isso, crie métodos get e set para cada um. Tal
classe também deve possuir mais três métodos. O primeiro denominado delta, que calcula
o delta de uma equação do segundo grau pela fórmula:

delta = b2 – 4*a*c

O segundo, denominado retornaX1, que retorna um dos resultados da equação, calculado
pela fórmula:

x1 = -b + Math.sqrt(delta)
2*a

O terceiro, denominado retornaX2, que retorna o outro resultado da equação, calculado
pela fórmula:

x2 = -b - Math.sqrt(delta)
2*a

Crie um app que possua um objeto do tipo Equacao, representando uma equação real. Tal
app deve receber os valores de a, b e c do usuário e exibir os dois resultados da equação.
Após calcular e exibir os valores de uma equação, o app deve perguntar se o usuário
deseja informar outros valores ou sair do programa. */

import javax.swing.JOptionPane;

public class Equacao {

    private double a;
    private double b;
    private double c;

    //criando os métodos get e set para cada atributo

    public double getA (){
        return a;
    }

    public void setA (double a){
        this.a = a;
    }

    public double getB (){
        return b;
    }

    public void setB (double b){
        this.b = b;
    }

    public double getC (){
        return c;
    }

    public void setC (double c){
        this.c = c;
    }

    public double delta (){ //método para calcular o delta
        return (double) (Math.pow(b, 2) - (4*a*c));
    }

    public double retornaX1 (){ //método para calcular a primeira raiz
        double d = delta();
        return (double) ((-b + Math.sqrt(d)) / (2*a));
    }

    public double retornaX2 (){ //método para calcular a segunda raiz
        double d = delta();
        return (double) ((-b - Math.sqrt(d)) / (2*a));
    }

    public static void main(String[] args) throws Exception {

        boolean continuar = true; //variável para definir se usuário deseja sair ou continuar após execução

        do { //início do loop
            Equacao equacao = new Equacao();
            
            //leitura dos parâmetros informados pelo usuário
            equacao.setA(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o parâmetro A: ", "A", JOptionPane.QUESTION_MESSAGE)));
            equacao.setB(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o parâmetro B: ", "B", JOptionPane.QUESTION_MESSAGE)));
            equacao.setC(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o parâmetro C: ", "C", JOptionPane.QUESTION_MESSAGE)));

            //chamada das funções para o cálculo
            double delta = equacao.delta();
            double x1 = equacao.retornaX1();
            double x2 = equacao.retornaX2();

            //exibição do resultado
            JOptionPane.showMessageDialog(null, "X1= " + x1 + "\nX2= " + x2, "RESULTADO:", JOptionPane.INFORMATION_MESSAGE);

            //questiona ao usuário se ele deseja prosseguir
            int resposta = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja prosseguir? \n[0] Não, sair. \n[1] Sim, continuar", "Continuar?", JOptionPane.QUESTION_MESSAGE));
            if (resposta ==0){
                continuar = false;
                JOptionPane.showMessageDialog(null, "Saindo...", "ENCERRANDO PROGRAMA", JOptionPane.INFORMATION_MESSAGE);
            }
        
        }while (continuar); //loop funciona até que o usuário escolha sair
    }
}
// 24.11.2024 Maria Fernanda Machado Rabelo