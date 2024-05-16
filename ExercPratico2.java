import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExercPratico2 extends JFrame {
    
    JTextField linha1, linha2;
    JButton adicao, subtraçao, multiplicacao, divisao, habilitar, desabilitar, ocultar, exibir, sair, limpar;
    JLabel rot1, rot2, operacao, funcao, rotresult, resultado, aluno;

    public ExercPratico2() {
       
        super("Mini Calculadora");
        Container tela = getContentPane();
        setLayout(null);
        setSize(600, 400);
        setResizable(false);


       
        rot1 = new JLabel("1 número ");
        rot2 = new JLabel("2 número ");
        operacao = new JLabel("Operação");
        funcao = new JLabel("Função");
        rotresult = new JLabel("Resultado: ");
        resultado = new JLabel(" ");
        rotresult.setForeground(Color.red);
        aluno = new JLabel("desenvolvido por: Bernardo/2-AMS");

        //Fazendo a criação dos botões
        //+,-,/ e etc
        adicao = new JButton("+");
    subtraçao = new JButton("-");
    multiplicacao = new JButton("*");
        divisao = new JButton("/");
        habilitar = new JButton("Habilitar");
        desabilitar = new JButton("DesabiliTar");
        ocultar = new JButton("Ocultar");
        exibir = new JButton("Exibir");
        sair = new JButton("Sair");
        limpar = new JButton("Limpar");
        //quebrando linha para facil visualização
        linha1 = new JTextField(5);
        linha2 = new JTextField(5);

        rot1.setBounds(40, 35, 100, 20);
        rot2.setBounds(250, 35, 80, 20);
        linha1.setBounds(120, 35, 80, 20);
        linha2.setBounds(330,35,80,20);
        rotresult.setBounds(430, 35, 120,20);
        resultado.setBounds(500, 35, 120,20);

        operacao.setBounds(40, 100, 100,20);
        adicao.setBounds(40, 130, 80,20);
        subtraçao.setBounds(120, 130, 80,20);
        multiplicacao.setBounds(200,130,80,20);
        divisao.setBounds(280,130,80,20);

         funcao.setBounds(40, 170, 100,20);
         habilitar.setBounds(40,200,100,20);
         desabilitar.setBounds(120,200,120,20);
         exibir.setBounds(220,200,100,20);
         ocultar.setBounds(300,200,100,20);
         limpar.setBounds(380,200,100,20);
         sair.setBounds(460,200,100,20);
     aluno.setBounds(70, 300,450,80);

        //Começando aqui as funções
        //e utilizando if e else para caso forem desabilitadas
        
        adicao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotresult.getForeground().equals(Color.gray)) {
                    rotresult.setBounds(40, 60, 400,20);
                    rotresult.setText("Função desabilitada..");
                }
                else {
                    float numer1 = Float.parseFloat(linha1.getText());
                    float numer2 = Float.parseFloat(linha2.getText());
                    float somar = numer1 + numer2;
                    resultado.setText(String.valueOf(somar));
                }
            }
        });
        
        subtraçao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotresult.getForeground().equals(Color.gray)) {
                 rotresult.setBounds(40, 60, 400,20);
                 rotresult.setText("Função desabilitada..");
                }
                else {
                 float numer1 = Float.parseFloat(linha1.getText());
                 float numer2 = Float.parseFloat(linha2.getText());
                 float subtraindo = numer1 - numer2;
                    resultado.setText(String.valueOf(subtraindo));
                }
            }
        });
        
        multiplicacao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotresult.getForeground().equals(Color.gray)) {
                    rotresult.setBounds(40, 60, 400,20);
                    rotresult.setText("Função desabilitada..");
                }
                else {
                    float numer1 = Float.parseFloat(linha1.getText());
                    float numer2 = Float.parseFloat(linha2.getText());
                    float multiplicando = numer1 * numer2;
                    resultado.setText(String.valueOf(multiplicando));
                }
            }
        });

        divisao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotresult.getForeground().equals(Color.gray)) {
                 rotresult.setBounds(40, 60, 400,20);
                 rotresult.setText("Função desabilitada..");
                }
                else {
                 float numer1 = Float.parseFloat(linha1.getText());
                 float numer2 = Float.parseFloat(linha2.getText());
                    float dividindo = numer1 / numer2;
                    resultado.setText(String.valueOf(dividindo));
                }
            }
        });

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                linha1.setText("");
                linha2.setText("");
                resultado.setText("");
            }
        });

        desabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado.setEnabled(false);
                rotresult.setEnabled(false);
            }
        });

        
        habilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultado.setEnabled(true);
                rotresult.setEnabled(true);
            }
        });

        ocultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotresult.setVisible(false);
                resultado.setVisible(false);
            }
        });
 
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotresult.setVisible(true);
                resultado.setVisible(true);
            }
        });
       
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

         //2 atalhos alt e letra
        habilitar.setMnemonic(KeyEvent.VK_H);
        //funçaõ habilitar e desabilitar 
        desabilitar.setMnemonic(KeyEvent.VK_D);

 
        //Adicionando as telas com as funções
        
        tela.add(linha1);
        tela.add(linha2);
        tela.add(adicao);
        tela.add(subtraçao);
        tela.add(multiplicacao);
        tela.add(divisao);
        tela.add(habilitar);
        tela.add(desabilitar);
        tela.add(ocultar);
        tela.add(exibir);
        tela.add(sair);
        tela.add(limpar);
        tela.add(rot1);
        tela.add(rot2);
        tela.add(operacao);
        tela.add(funcao);
        tela.add(rotresult);
        tela.add(resultado);
        tela.add(aluno);

        setVisible(true);
    }

    public static void main(String[] args) {
        ExercPratico2 app = new ExercPratico2();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}//Fim do programa