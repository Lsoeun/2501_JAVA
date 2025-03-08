public class GenericPrinter<T> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public static void main(String[] args) {
        GenericPrinter<Integer> intPrinter = new GenericPrinter<>();
        GenericPrinter<String> stringPrinter = new GenericPrinter<>();
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
        GenericPrinter<Powder> powerPrinter = new GenericPrinter<>();
    }
}
