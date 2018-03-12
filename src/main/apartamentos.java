package main;

/**
 * Classe de apartamentos, herda as caracteristicas dos blocos
 * @author Iago Nuvem
 */
public class apartamentos extends blocos{
    private double area;
    
    /**
     * Método de Acesso
     * @return Área do apartamento
     */
    public double getArea(){
        return this.area;
    }
    
    /**
     * Método Modificador
     * @param a - valor da area do apartamento
     */
    public void setArea(double a){
        this.area = a;
    }
    
    /**
     * Calcula o valor do condominio de cada apartamento de acordo com a area do apartamento em relação a area do bloco (proporcional)
     * @author Iago Nuvem
     * @param bl - obj do bloco
     * @return valor do condominio de cada apartamento 
     */
    public double calcCondominio(blocos bl){
        return (bl.getGastos()/bl.getArea()) * this.area;
    }
}
