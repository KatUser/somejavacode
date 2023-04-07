package se.interf;

public class Supervisers implements PersonInterface {
    public String name;

    public String status;

    public String phone;

    @Override
    public String getInfo() {
        return phone;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public String getFIO() {
        return name;
    }
}
