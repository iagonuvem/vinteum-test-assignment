package main;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Classe principal para realizar os testes
 * @author iagon
 */
public class VinteUmTest {
    poligonos Pol = new poligonos();
    circulos Circ = new circulos();
    Scanner ler = new Scanner(System.in);
    
    /**
     * Questão 1 - area dos polígonos
     * @author Iago Nuvem 
     */
    public void Questao1(){
        int tipo;
        System.out.println("Selecione o Tipo de Polígono: 1 - Polígonos planos | 2 - Circunferência");
        tipo = ler.nextInt();
        
        while(tipo < 1 || tipo > 2){
            System.out.println("Valor digitado fora dos limites,digite novamente");
            tipo = ler.nextInt();
        }
        
        switch(tipo){
            case 1: // Para o tipo == 1 (Poligonos quadrados: triangulos e retangulos)
              System.out.println("Qual o tipo do poligono: 1 - Retangular | 2 - Triangular");
              int tipo2 = ler.nextInt();
              while(tipo2 < 1 || tipo2 > 2){
                    System.out.println("Valor digitado fora dos limites,digite novamente");
                    tipo2 = ler.nextInt();
              }
              Pol.setTipo(tipo2);
                
              System.out.println("Digite a Base do polígono:");
              double b = ler.nextDouble();
              Pol.setBase(b);
              
              System.out.println("Digite a Altura do polígono:");
              double a = ler.nextDouble();
              Pol.setAltura(a);
              
              System.out.println("Valor da area: "+Pol.calcArea());
              break;
              
            case 2: // Para o tipo == 2 (Circunferencias)
                System.out.println("Digite o Raio da Circunferencia:");
                double r = ler.nextDouble();
                Circ.setRaio(r);
                
                System.out.println("Valor da area: "+Circ.calcArea());
                break;
                
            default: break;
        }
    }
    
    
    /**
     * Questão 2 - Valor do Condominio
     * @author Iago Nuvem
    */
    public void Questao2(){
        // Instanciação das classes
        blocos bl = new blocos();
        apartamentos ap = new apartamentos();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("CALCULADORA DE CONDOMINIO");
        
        System.out.println("Digite a área do bloco:");
        double areaBloco = ler.nextDouble();
        bl.setArea(areaBloco);
        
        System.out.println("Digite o gasto total do bloco: (R$)");
        double gastoBloco = ler.nextDouble();
        bl.setGastos(gastoBloco);
        
        System.out.println("Digite a área do apartamento que deseja calcular o condominio:");
        double areaAp = ler.nextDouble();
        ap.setArea(areaAp);
        
        System.out.println("O Valor do condominio para o apartamento digitado é: R$"+ap.calcCondominio(bl));       
    }
    
    public static void main(String[] args) {
        // Instancia da classe principal
        VinteUmTest test = new VinteUmTest();
        
        System.out.println("Inicio");
        
        // Teste da questao 1
        test.Questao1();
        
        // Teste da questao 2
        test.Questao2();
    }
    
           
}
