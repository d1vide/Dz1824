package homework1.practice20.number1;

public class JenericClass<T, V, K> {
    private T varT;
    private V varV;
    private K varK;

    public JenericClass(T varT, V varV, K varK) {
        this.varT = varT;
        this.varV = varV;
        this.varK = varK;
    }

    public T getVarT() {
        return varT;
    }

    public V getVarV() {
        return varV;
    }
    public K getVarK() {
        return varK;
    }

    public void printTypes() {
        System.out.println("Type T - " + varT.getClass());
        System.out.println("Type V - " + varV.getClass());
        System.out.println("Type K - " + varK.getClass());
    }
}
