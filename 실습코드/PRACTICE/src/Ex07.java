// switch-case 연습 예제
public class Ex07 {
    public static void main(String[] args) {
        String weather = "흐림";  // 날씨 상태
        String outfit;  // 추천 옷차림을 저장할 변수

        switch (weather) {
            case "맑음":
                outfit = "가벼운 티셔츠와 반바지";
                break;
            case "비":
                outfit = "우산과 방수 자켓";
                break;
            case "흐림":
                outfit = "긴팔 셔츠와 청바지";
                break;
            case "눈":
                outfit = "따뜻한 코트와 장갑";
                break;
            default:
                outfit = "날씨를 확인할 수 없습니다.";
        }
        System.out.println("오늘의 추천 옷차림은: " + outfit);
    }
}
