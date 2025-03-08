public class IDFormatException extends Exception {
    // 생성자
    public IDFormatException(String message) {
        super(message);
    }
}

// String message는 예외가 발생했을 때 예외 상황 메세지를 담는 문자열
// 이 메세지는 예외가 발생한 원인이나 문제를 설명하는데 사용
// 예외 발생 시에 이 메세지를 전달하면, 예외가 발생한 상황에 대한 구체적인 설명을 포함할 수 있음
