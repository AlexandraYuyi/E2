package interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.math.BigInteger;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.math.BigInteger;

public class Interfaz extends JFrame implements ActionListener {
    
    private JLabel enunciado;
    private JLabel warning;
    private JLabel warning2;
    
    private JTextField input;
    private JTextField input2;
    private JButton calcular;
    private JButton limpiar;
    
    private JLabel primoLabel;
    private JTextArea resultadoPrimo;
    
    private JLabel potencia;
    private JTextArea resultPotencia;
    private JScrollPane scrollpane1;
    
    private JLabel fibonacci;
    private JTextArea resultFibonacci;
    private JScrollPane scrollpane2;
    
    private JLabel factorial;
    private JTextArea resultFactorial;
    private JScrollPane scrollpane3;
    
    private JLabel suma;
    private JTextArea resultSuma;
    
    
    
    public Interfaz(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Evaluación 2 de Algoritmos y Estructuras I");
        
        enunciado = new JLabel("Ingrese dos números m y n del -99 al 99 ");
        enunciado.setBounds(40,30,555,30);
        enunciado.setFont(new Font("Verdana", Font.BOLD, 24));
        add(enunciado);
        
        input = new JTextField();
        input.setBounds(610,25,40,40);
        input.setFont(new Font("Verdana", Font.BOLD, 24));
        
        input.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                inputKeyTyped(e);
            }
        });
        
        add(input);
        
        input2 = new JTextField();
        input2.setBounds(670,25,40,40);
        input2.setFont(new Font("Verdana", Font.BOLD, 24));
        
        input2.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                inputKeyTyped(e);
            }
        });
        
        add(input2);
        
        warning = new JLabel("Por favor ingrese un numero válido...");
        warning.setBounds(331,70,480,30);
        warning.setFont(new Font("Verdana", Font.BOLD, 18));
        warning.setForeground(Color.red);
        warning.setVisible(false);
        
        add(warning);
        
        warning2 = new JLabel("Por favor ingrese un número válido...");
        warning2.setBounds(331,70,480,30);
        warning2.setFont(new Font("Verdana", Font.BOLD, 18));
        warning2.setForeground(Color.red);
        warning2.setVisible(false);
        
        add(warning2);
        
        calcular = new JButton("Calcular");
        calcular.setBounds(740,25,150,40);
        calcular.setFont(new Font("Verdana", Font.BOLD, 18));
        add(calcular);
        calcular.addActionListener(this);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(920,25,150,40);
        limpiar.setFont(new Font("Verdana", Font.BOLD, 18));
        limpiar.setEnabled(false);
        add(limpiar);
        limpiar.addActionListener(this);
        
        
        
        primoLabel = new JLabel("M es primo:");
        primoLabel.setBounds(40,120,150,30);
        primoLabel.setFont(new Font("Verdana", Font.BOLD, 20));
        add(primoLabel);
        
        resultadoPrimo = new JTextArea();
        resultadoPrimo.setBounds(40,160,300,50);
        resultadoPrimo.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        resultadoPrimo.setEditable(false);
        add(resultadoPrimo);
        
        
        
        suma = new JLabel("Suma de los dígitos |nxm|:");
        suma.setBounds(400,120,480,30);
        suma.setFont(new Font("Verdana", Font.BOLD, 20));
        add(suma);
        
        resultSuma = new JTextArea();
        resultSuma.setBounds(400,160,300,50);
        resultSuma.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        resultSuma.setEditable(false);
        add(resultSuma);
        
        
        
        potencia = new JLabel("Potencia n^m:");
        potencia.setBounds(40,260,480,30);
        potencia.setFont(new Font("Verdana", Font.BOLD, 20));
        add(potencia);
        
        resultPotencia = new JTextArea();
        resultPotencia.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        resultPotencia.setEditable(false);
        add(resultPotencia);
        scrollpane1 = new JScrollPane(resultPotencia);
        scrollpane1.setBounds(40,300,1032,50);
        add(scrollpane1);
        
        
        
        fibonacci = new JLabel("Secuencia de Fibonacci hasta el término menor o igual a |nxm|: ");
        fibonacci.setBounds(40,400,750,30);
        fibonacci.setFont(new Font("Verdana", Font.BOLD, 20));
        add(fibonacci);
        
        resultFibonacci = new JTextArea();
        resultFibonacci.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        resultFibonacci.setEditable(false);
        add(resultFibonacci);
        scrollpane2 = new JScrollPane(resultFibonacci);
        scrollpane2.setBounds(40,440,1032,50);
        add(scrollpane2);
        
        
        
        
        factorial = new JLabel("Factorial n!: ");
        factorial.setBounds(40,540,480,30);
        factorial.setFont(new Font("Verdana", Font.BOLD, 20));
        add(factorial);
        
        resultFactorial = new JTextArea();
        resultFactorial.setFont(new Font("Verdana", Font.LAYOUT_LEFT_TO_RIGHT, 18));
        resultFactorial.setEditable(false);
        add(resultFactorial);
        scrollpane3 = new JScrollPane(resultFactorial);
        scrollpane3.setBounds(40,580,1032,50);
        add(scrollpane3);
        
        
          
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        try{
            if(e.getSource() == calcular){
                if(input.getText().isEmpty()){
                warning2.setVisible(true);
                }else{
                    String text = input.getText();
                    int entero = Integer.parseInt(text);
                    if(entero >0 && entero < 10){
                    warning.setVisible(false);
                    warning2.setVisible(false);
                    limpiar.setEnabled(true);
                    calcular.setEnabled(false);
                    input.setEditable(false);
                    
                    int[][] matriz = Logica.crearMatriz(entero);
                    int[] vector = Logica.crearVector(entero);
                    BigInteger escalar;
                    float real = 0;
                    BigInteger potencia = new BigInteger("1");
                    
                    matriz = Logica.llenarMatriz(matriz);
                    resultadoPrimo.setText(Logica.mostrarMatriz(matriz));
                    vector = Logica.ordenarMatriz(matriz);
                    resultPotencia.setText(Logica.mostrarVector(vector));
                    resultFibonacci.setText(String.valueOf(Logica.multiplicarColumna(matriz)));
                    escalar = Logica.multiplicarColumna(matriz);
                    resultFactorial.setText(Logica.invertirNumero(escalar));
                    real = Logica.promedioSumaDiagonalSecundaria(matriz);
                    resultSuma.setText(Float.toString(real));
                    potencia = Logica.potenciaMenorMayor(vector);
//                    resultadoPot.setText(String.valueOf(potencia));
                    
                    }else{
                        warning.setVisible(true);
                    }
                }
            }
        }
        catch(NumberFormatException err){
        
        }
        
        if(e.getSource() == limpiar){
            limpiar.setEnabled(false);
            calcular.setEnabled(true);
            input.setEditable(true);
            input.setText(null);
            resultadoPrimo.setText("");
            resultPotencia.setText("");
            resultFibonacci.setText("");
            resultFactorial.setText("");
            resultSuma.setText("");
//            resultadoPot.setText("");
        }
    }
    
    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        interfaz.setBounds(0,0,1115,700);
        interfaz.setResizable(false);
        interfaz.setVisible(true);
        interfaz.setLocationRelativeTo(null);
    }
    
    private void inputKeyTyped(KeyEvent e){
        char tecla= e.getKeyChar();
        if((!(Character.isDigit(tecla)) && tecla != '-') || (tecla == KeyEvent.VK_BACK_SPACE) || (tecla == KeyEvent.VK_DELETE)){
            e.consume();
            }
    }
}