public class ThreeDPrinter3 {
    private Object material;

    public Object getMaterial() {
        return material;
    }

    public void setMaterial(Object material) {
        this.material = material;
    }

    public static void main(String[] args) {
        ThreeDPrinter3 printer = new ThreeDPrinter3();
        Powder p1 = new Powder();
        printer.setMaterial(p1);

        Powder p2 = (Powder) printer.getMaterial();
        // 직접 형 변환을 해야함
    }
}
