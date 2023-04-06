package day09.quiz;

public class IPhone extends SmartPhone {
    public IPhone(String model) {
        super(model);
    }

    @Override
    public String information() {
        String message = String.format("아이폰 %s에서 만들어졌고 제원은 다음과 같다.\n", getModel());
        message += makeCall() + "\n";
        message += takeCall() + "\n";
        message += takePicture() + "\n";
        message += charge() + "\n";
        message += touchDisplay() + "\n";

        return message;
    }

    @Override
    public String charge() {
        return "고속 충전, 고속 무선 충전";
    }

    @Override
    public String takePicture() {
        return "1200만, 1600만 트리플 카메라";
    }

    @Override
    public String makeCall() {
        return "번호를 누르고 통화버튼을 누름";
    }

    @Override
    public String takeCall() {
        return "전화받기 버튼을 누름";
    }

    @Override
    public String touchDisplay() {
        return "정전식";
    }
}