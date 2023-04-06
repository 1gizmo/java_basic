package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil {
    public Galaxy(String model) {
        super(model);
    }

    @Override
    public String information() {
        String message = String.format("갤럭시는 %s에서 만들어졌고 제원은 다음과 같다.\n", getModel());
        message += makeCall() + "\n";
        message += takeCall() + "\n";
        message += takePicture() + "\n";
        message += charge() + "\n";
        message += touchDisplay() + "\n";
        message += "블루투스 펜 탑재 여부: " + bluetoothPen() + "\n";

        return message;
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String takePicture() {
        return "1300만 듀얼카메라";
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
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String touchDisplay() {
        return "정전식, 와콤펜 지원";
    }
}