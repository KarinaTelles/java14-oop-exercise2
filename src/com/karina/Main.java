package com.karina;

import com.karina.cameras.Camera;
//import com.karina.cameras.Camera.CameraType;
public class Main {
    public static void main(String[] args) {
        Camera c = Camera.readCamera();

        System.out.println(c + " aqui");
//        Camera c2 = new Camera();
//        Camera.readCamera();

//        Camera camera = new Camera("SN0000000000000001");
//        camera.setCameraType("EPTZ");
//
//        Camera camera2 = new Camera();
//        camera2.setSerialNumber("SN0000000000000002");
//        camera2.setCameraType(Camera.CameraType.STATIONARY);
//        System.out.println("\n");
//
//        System.out.println("***********Câmera 1 ***********\n" + camera + "\n");
//        System.out.println("Câmeras 1 é igual a câmera 2? " + camera.equals(camera2) + "\n");
//        System.out.println("***********Câmera2 2 ***********\n" + camera2);

    }
}
