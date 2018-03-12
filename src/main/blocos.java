package main;

/**
 * Classe dos blocos
 * @author Iago Nuvem
 */
public class blocos {
    private double area;
    private double gastosTotais;
    
    /**
     * Método de Acesso
     * @return Área do bloco
     */
    public double getArea(){
        return this.area;
    }
     /**
     * Método de Acesso
     * @return gastos totais do bloco
     */
    public double getGastos(){
        return this.gastosTotais;
    }
    
    /**
     * Método Modificador
     * @param a - valor da area total do bloco
     */
    public void setArea(double a){
        this.area = a;
    }
    /**
     * Método Modificador
     * @param g - valor total dos gastos
     */
    public void setGastos(double g){
        this.gastosTotais = g;
    }
    
}
