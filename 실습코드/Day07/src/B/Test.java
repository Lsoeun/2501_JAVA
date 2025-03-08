package B;

import A.Example;

public class Test {
    public static void main(String[] args) {
        Example example = new Example();
        example.publicField = "접근 가능";
        // example.protectedField = "접근 불가능";
        // example.defaultField = "접근 불가능";
        // example.privateField = "접근 불가능";
    }
}
