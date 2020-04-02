
package softwaretema3;

/**
 *
 * @author Eliel Novelo
 */
public class CsJacobi {
    int iteraciones;
    double x1,x2,x3;

    public void setIteraciones(int iteraciones) {
        this.iteraciones = iteraciones;
    }

    public int getIteraciones() {
        return iteraciones;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    @Override
    public String toString() {
        return "CsJacobi{" + "x1=" + x1 + ", x2=" + x2 + ", x3=" + x3 + '}';
    }
    
    
    
    
}
