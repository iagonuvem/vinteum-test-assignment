package main;

/**
 *
 * @author iagonuvem
 */
public class figurasGeometricas {
    private double area;
    
    /**
     * Método de Acesso
     * @return Área da figura
     */
    public double getArea(){
        return this.area;
    }
    
    /**
     * Método Modificador
     * @param a - valor a ser alterado na área
     */
    public void setArea(double a){
        this.area = a;
    }
}
