package day09.quiz;

public class IPhone extends SmartPhone   {
    @Override
    public String information() {
        return null;
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public String takePicture() {
        return null;
    }

    @Override
    public String makeCall() {
        return null;
    }

    @Override
    public String takeCall() {
        return null;
    }

    @Override
    public void touchDisplay() {

    }

    @Override
    public String charge() {
        return null;
    }
}
