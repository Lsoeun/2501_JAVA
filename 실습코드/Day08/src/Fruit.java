public class Fruit {
    // 멤버 변수와 생성자 매개변수를 구분하는 역할의 this
    // 주로 멤버 변수와 생성자 매개 변수의 이름이 동일할 때, 이를 구분하기 위해 사용
    public int fruitNo; // 과일 고유 번호
    public String fruitName; // 과일 이름

    public void setFruitNo(int fruitNo) {
        this.fruitNo = fruitNo;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public Fruit getself() {
        return this;
    }
}
