package main;

/**
 * Classe poligonos, herda as características da classe de figuras geométricas
 * @author Iago Nuvem/
 */
public class poligonos extends figurasGeometricas{
    private double base;
    private double altura;
    private int tipo;
    
     /**
     * Método de Acesso
     * @return base da figura
     */
    public double getBase(){
        return this.base;
    }
    
     /**
     * Método de Acesso
     * @return tipo do poligono - retangulo(1), triangulo(2)
     */
    public double getTipo(){
        return this.tipo;
    }
    
    /**
     * Método de Acesso
     * @return base da figura
     */
    public double getAltura(){
        return this.altura;
    }
    
     /**
     * Método Modificador
     * @param b- valor a ser alterado na base
     */
    public void setBase(double b){
        this.base = b;
    }
    
     /**
     * Método Modificador
     * @param a - valor a ser alterado na altura
     */
    public void setAltura(double a){
        this.altura = a;
    }
    /**
     * Método Modificador
     * @param t - valor a ser alterado no tipo
     */
    public void setTipo(int t){
        this.tipo = t;
    }
    
    /**
     * Função para retornar a area de acordo com o tipo do poligono
     * @author Iago Nuvem
     * @return area 
     */
    public double calcArea(){
        if(this.tipo == 1){ // Calculo de area para retangulos
            return this.base * this.altura;
        }
        else{
            return (this.base * this.altura)/2;
        }
    }
}
