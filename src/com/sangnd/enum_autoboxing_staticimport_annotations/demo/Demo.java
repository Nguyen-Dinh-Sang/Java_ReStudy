package com.sangnd.enum_autoboxing_staticimport_annotations.demo;

import static java.lang.System.out;

public class Demo {
    public void run() {
//        demoEnum1();
//        demoEnum2();
//        demoEnum3();
        demoStaticImport();
    }

    enum Transport {
        CAR, TRUCK, AIRPLANE, TRAIN, BOAT
    }

    private void demoEnum1() {
        Transport transport;

        transport = Transport.CAR;

        if (transport == Transport.TRAIN) {
            System.out.println("Transport is train.");
        }

        switch (transport) {
            case CAR: {
                System.out.println("Transport is car.");
                break;
            }
            case BOAT: {
                System.out.println("Transport is boat.");
            }
        }
    }

    private void demoEnum2() {
        Transport[] transports = Transport.values();

        for (Transport transport : transports) {
            System.out.println(transport.toString());
        }

        Transport transport = Transport.valueOf("BOAT");
        System.out.println(transport.toString());
    }

    enum TransportSpeed {
        CAR(65), TRUCK(55), AIRPLANE(600), TRAIN(70), BOAT(22);

        private int speed;

        TransportSpeed(int speed) {
            this.speed = speed;
        }

        int getSpeed() {
            return speed;
        }
    }

    private void demoEnum3() {
        TransportSpeed transportSpeed = TransportSpeed.TRAIN;

        System.out.println(transportSpeed.getSpeed());
        System.out.println(transportSpeed.ordinal());
        System.out.println(transportSpeed.compareTo(TransportSpeed.BOAT));
        System.out.println(transportSpeed.compareTo(TransportSpeed.AIRPLANE));
    }

    private void demoStaticImport() {
        out.println("Demo static import");
    }
}

