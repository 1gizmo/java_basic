package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil{
    @Override
    public String information() {
        return null;
    }

    @Override
    public String charge() {
        return "고속충전, 고속 무선 충전";
    }

    @Override
    public String getModel(String model) {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String takePicture() {
        return "1300만 듀얼카메라";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
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
        return "정전식, 와콤펜 지원";
    }
}
