package com.karina.cameras;

public class Camera {

    private boolean active;
    private String serialNumber;
    private Position position;
    private CameraType cameraType;
    public enum CameraType
    {
        PTZ,
        EPTZ,
        STATIONARY
    }
    public Camera(){
       System.out.println("Câmera criada");
       System.out.println("Construtor sem parâmetro");
       active = true;
       position = new Position();
       position.setTilt(0);
       position.setPan(0);
       position.setZoom(0);
    }
    public Camera(String serialNumber){
        System.out.println("Câmera criada");
        System.out.println("Construtor com parâmetro");
        this.serialNumber = serialNumber;
        active = true;
        position = new Position();
        position.setTilt(0);
        position.setPan(0);
        position.setZoom(0);
    }
   
    public CameraType getPtz() {
        return cameraType;
    }

    public void setCameraType(CameraType cameraType) {
        this.cameraType = cameraType;
    }
    public void setCameraType(String cameraType){
        this.cameraType = CameraType.valueOf(cameraType);
    }
    public boolean isActive() {
        return active;
    }
    public String getSerialNumber() {
        return serialNumber;
    }

    public Position getPosition() {
        return position;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public void setPosition(int x, int y, int z){
        position.pan = x;
        position.tilt = y;
        position.zoom = z;
    }
    public void setPosition(){
        System.out.println("Camera retornou ao valor padrão");
        reset();
    }
    private void reset() {
        position.pan = 0;
        position.tilt = 0;
        position.zoom = 0;
    }
    @Override
    public String toString(){
        return "Ativação: " + active + ".\nSerial Number: " + serialNumber + ".\nPosições: " + position + ". \nTipo de câmera: " + cameraType + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camera)) return false;
        if (!super.equals(o)) return false;
        Camera camera = (Camera) o;
        return active == camera.active &&
                serialNumber.equals(camera.serialNumber) &&
                position.equals(camera.position);
    }
}
