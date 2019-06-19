package ZooPark;

public class Camera implements Observer {

    private String isObserver = "Камера Снимает посетителей";

    public String observe() {
        return isObserver;
    }
}
