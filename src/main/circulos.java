package main;

/**
  * Classe circulos, herda as características da classe de figuras geométricas
 * @author iagonuvem
 */
public class circulos extends figurasGeometricas{
    private double raio;
    
     /**
     * Método de Acesso
     * @return raio da circunferencia
     */
    public double getRaio(){
        return this.raio;
    }
    
     /**
     * Método Modificador
     * @param r - valor do raio
     */
    public void setRaio(double r){
        this.raio = r;
    }
    
    /**
     * Função para retornar a area do circulo
     * @author Iago Nuvem
     * @return area 
     */
    public double calcArea(){
        return 3.14*(this.raio*this.raio);
    }
}
