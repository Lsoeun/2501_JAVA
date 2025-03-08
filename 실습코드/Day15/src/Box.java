public class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(); //"Integer" 타입을 사용할 Box 객체
        intBox.setValue(10); // Integer 타입의 값을 안전하게 설정
        System.out.println(intBox.getValue());

        Box<String> stringBox = new Box<>(); // "String" 타입을 사용할 Box 객체
        stringBox.setValue("10");
        System.out.println(stringBox.getValue());

        Box<Double> douBox = new Box<>(); // "Double" 타입을 사용할 Box 객체
        douBox.setValue(10.0);
        System.out.println(douBox.getValue());
    }
}
