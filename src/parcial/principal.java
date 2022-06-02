/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author mono-
 */
public class principal {

    static secundario vehiculo1 = new secundario(0, "");
    static secundario vehiculo2 = new secundario(0, "");
    static secundario vehiculo3 = new secundario(0, "");
    static secundario vehiculo4 = new secundario(0, "");
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion = 0;
        do {
            System.out.println("\u001B[31m---Sistema parqueadero ---");
            System.out.println("0. Salir.");
            System.out.println("1. Asignar vehículo a espacio.");
            System.out.println("2. Agregar tiempo a vehículo.");
            System.out.println("3. Cambiar espacio al vehículo.");
            System.out.println("4. Registrar salida de vehículo.");
            System.out.println("\u001B[31mIngrese la opción:");
            opcion = Integer.parseInt(sc.next());
            switch (opcion) {
                case 0: {
                    System.exit(0);
                    break;
                }
                case 1: {
                    System.out.println("\u001B[31mAgregar vehículo.");
                    System.out.print("\u001B[31m#Espacio: ");
                    int espacio = sc.nextInt();
                    asigVehiculo(espacio);
                    break;
                }
                case 2: {
                    System.out.println("\u001B[31mAgregar tiempo a vehículo.");
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    String placa = sc.next();
                    asigTiemp(placa);
                    break;
                }
                case 3: {
                    System.out.println("\u001B[31mCambiar espacio al vehículo.");
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    String placa = sc.next();
                    System.out.print("\u001B[31mEspacio: ");
                    int espacio = sc.nextInt();
                    camEsp(placa, espacio);
                    break;
                }
                case 4: {
                    System.out.println("\u001B[31mRegistrar salida de vehículo.");
                    System.out.print("\u001B[31mIngrese la placa del vehículo: ");
                    String placa = sc.next();
                    regSalida(placa);
                    break;
                }
                default:
                    System.out.println("\u001B[31mOpcion no disponible");
            }
        } while (opcion != 0);
    }

    public static void asigVehiculo(int espacio) {
        switch (espacio) {
            case 1:
                if (vehiculo1.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio esta ocupado por el vehiculo con placa " + vehiculo1.getPlaca());
                } else {
                    vehiculo1.setEspacio(espacio);
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    vehiculo1.setPlaca(sc.next());
                    System.out.print("\u001B[31mMarca: ");
                    vehiculo1.setMarca(sc.next());
                    System.out.print("\u001B[31mModelo: ");
                    vehiculo1.setModelo(sc.next());
                    System.out.print("\u001B[31mAño: ");
                    vehiculo1.setAño(sc.nextInt());
                    System.out.println("El Vehículo " + vehiculo1.toString() + " ha sido agregado al espacio 1");
                }
                break;
            case 2:
                if (vehiculo2.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio esta ocupado por el vehiculo con placa " + vehiculo2.getPlaca());
                } else {
                    vehiculo2.setEspacio(espacio);
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    vehiculo2.setPlaca(sc.next());
                    System.out.print("\u001B[31mMarca: ");
                    vehiculo2.setMarca(sc.next());
                    System.out.print("\u001B[31mModelo: ");
                    vehiculo2.setModelo(sc.next());
                    System.out.print("\u001B[31mAño: ");
                    vehiculo2.setAño(sc.nextInt());
                    System.out.println("El Vehículo " + vehiculo2.toString() + " ha sido agregado al espacio 2");
                }
                break;
            case 3:
                if (vehiculo3.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio esta ocupado por el vehiculo con placa " + vehiculo3.getPlaca());
                } else {
                    vehiculo3.setEspacio(espacio);
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    vehiculo3.setPlaca(sc.next());
                    System.out.print("\u001B[31mMarca: ");
                    vehiculo3.setMarca(sc.next());
                    System.out.print("\u001B[31mModelo: ");
                    vehiculo3.setModelo(sc.next());
                    System.out.print("\u001B[31mAño: ");
                    vehiculo3.setAño(sc.nextInt());
                    System.out.println("El Vehículo " + vehiculo3.toString() + " ha sido agregado al espacio 3");
                }
                break;
            case 4:
                if (vehiculo4.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio esta ocupado por el vehiculo con placa " + vehiculo4.getPlaca());
                } else {
                    vehiculo4.setEspacio(espacio);
                    System.out.print("\u001B[31mPlaca vehículo: ");
                    vehiculo4.setPlaca(sc.next());
                    System.out.print("\u001B[31mMarca: ");
                    vehiculo4.setMarca(sc.next());
                    System.out.print("\u001B[31mModelo: ");
                    vehiculo4.setModelo(sc.next());
                    System.out.print("\u001B[31mAño: ");
                    vehiculo4.setAño(sc.nextInt());
                    System.out.println("El Vehículo " + vehiculo4.toString() + " ha sido agregado al espacio 4");
                }
                break;
            default:
                System.out.println("\u001B[31mDato incorrecto");
                break;
        }
    }

    public static void asigTiemp(String placa) {
        if (vehiculo1.getPlaca().equalsIgnoreCase(placa)) {
            System.out.print("\u001B[31mMinutos: ");
            vehiculo1.setMinutos(sc.nextInt());
            System.out.println("Minutos actualizados, el nuevo estado del vehículo es " + vehiculo1.toString());
        } else if (vehiculo2.getPlaca().equalsIgnoreCase(placa)) {
            System.out.print("\u001B[31mMinutos: ");
            vehiculo2.setMinutos(sc.nextInt());
            System.out.println("Minutos actualizados, el nuevo estado del vehículo es " + vehiculo2.toString());
        } else if (vehiculo3.getPlaca().equalsIgnoreCase(placa)) {
            System.out.print("\u001B[31mMinutos: ");
            vehiculo3.setMinutos(sc.nextInt());
            System.out.println("Minutos actualizados, el nuevo estado del vehículo es " + vehiculo3.toString());
        } else if (vehiculo4.getPlaca().equalsIgnoreCase(placa)) {
            System.out.print("\u001B[31mMinutos: ");
            vehiculo4.setMinutos(sc.nextInt());
            System.out.println("Minutos actualizados, el nuevo estado del vehículo es " + vehiculo4.toString());
        } else {
            System.out.println("\u001B[31mEste vehículo no se encuentra registrado en el sistema");
        }
    }

    public static void camEsp(String placa, int espacio) {
        switch (espacio) {
            case 1:
                if (vehiculo1.getEspacio().equals("Uso")) {
                    System.out.println("\u001B[31mEste espacio ya se encuentra ocupado por el vehículo con placas " + vehiculo1.getPlaca());
                } else if (vehiculo2.getPlaca().equals(placa)) {
                    vehiculo1.setEspacio(espacio);
                    vehiculo2.setEspacio(0);
                    String est = vehiculo2.getPlaca();
                    vehiculo1.setPlaca(est);
                    vehiculo2.setPlaca("");
                    est = vehiculo2.getMarca();
                    vehiculo1.setMarca(est);
                    est = vehiculo2.getModelo();
                    vehiculo1.setModelo(est);
                    int estv = vehiculo2.getAño();
                    vehiculo1.setAño(estv);
                    estv = vehiculo2.getMinutos();
                    vehiculo1.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo1.toString() + " ha sido cambiado al espacio 1");
                } else if (vehiculo3.getPlaca().equals(placa)) {
                    vehiculo1.setEspacio(espacio);
                    vehiculo3.setEspacio(0);
                    String est = vehiculo3.getPlaca();
                    vehiculo1.setPlaca(est);
                    vehiculo3.setPlaca("");
                    est = vehiculo3.getMarca();
                    vehiculo1.setMarca(est);
                    est = vehiculo3.getModelo();
                    vehiculo1.setModelo(est);
                    int estv = vehiculo3.getAño();
                    vehiculo1.setAño(estv);
                    estv = vehiculo3.getMinutos();
                    vehiculo1.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo1.toString() + " ha sido cambiado al espacio 1");
                } else if (vehiculo4.getPlaca().equals(placa)) {
                    vehiculo1.setEspacio(espacio);
                    vehiculo4.setEspacio(0);
                    String est = vehiculo4.getPlaca();
                    vehiculo1.setPlaca(est);
                    vehiculo4.setPlaca("");
                    est = vehiculo4.getMarca();
                    vehiculo1.setMarca(est);
                    est = vehiculo4.getModelo();
                    vehiculo1.setModelo(est);
                    int estv = vehiculo4.getAño();
                    vehiculo1.setAño(estv);
                    estv = vehiculo4.getMinutos();
                    vehiculo1.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo1.toString() + " ha sido cambiado al espacio 1");
                }
                break;
            case 2:
                if (vehiculo2.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio ya se encuentra ocupado por el vehículo con placas " + vehiculo2.getPlaca());
                } else if (vehiculo1.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo2.setEspacio(espacio);
                    vehiculo1.setEspacio(0);
                    String est = vehiculo1.getPlaca();
                    vehiculo2.setPlaca(est);
                    vehiculo1.setPlaca("");
                    est = vehiculo1.getMarca();
                    vehiculo2.setMarca(est);
                    est = vehiculo1.getModelo();
                    vehiculo2.setModelo(est);
                    int estv = vehiculo1.getAño();
                    vehiculo2.setAño(estv);
                    estv = vehiculo1.getMinutos();
                    vehiculo2.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo2.toString() + " ha sido cambiado al espacio 2");
                } else if (vehiculo3.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo2.setEspacio(espacio);
                    vehiculo3.setEspacio(0);
                    String est = vehiculo3.getPlaca();
                    vehiculo2.setPlaca(est);
                    vehiculo3.setPlaca("");
                    est = vehiculo3.getMarca();
                    vehiculo2.setMarca(est);
                    est = vehiculo3.getModelo();
                    vehiculo2.setModelo(est);
                    int estv = vehiculo3.getAño();
                    vehiculo2.setAño(estv);
                    estv = vehiculo3.getMinutos();
                    vehiculo2.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo2.toString() + " ha sido cambiado al espacio 2");
                } else if (vehiculo4.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo2.setEspacio(espacio);
                    vehiculo4.setEspacio(0);
                    String est = vehiculo4.getPlaca();
                    vehiculo2.setPlaca(est);
                    vehiculo4.setPlaca("");
                    est = vehiculo4.getMarca();
                    vehiculo2.setMarca(est);
                    est = vehiculo4.getModelo();
                    vehiculo2.setModelo(est);
                    int estv = vehiculo4.getAño();
                    vehiculo2.setAño(estv);
                    estv = vehiculo4.getMinutos();
                    vehiculo2.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo2.toString() + " ha sido cambiado al espacio 2");
                }
                break;
            case 3:
                if (vehiculo3.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio ya se encuentra ocupado por el vehículo con placas " + vehiculo3.getPlaca());
                } else if (vehiculo1.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo3.setEspacio(espacio);
                    vehiculo1.setEspacio(0);
                    String est = vehiculo1.getPlaca();
                    vehiculo3.setPlaca(est);
                    vehiculo1.setPlaca("");
                    est = vehiculo1.getMarca();
                    vehiculo3.setMarca(est);
                    est = vehiculo1.getModelo();
                    vehiculo3.setModelo(est);
                    int estv = vehiculo1.getAño();
                    vehiculo3.setAño(estv);
                    estv = vehiculo1.getMinutos();
                    vehiculo3.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo3.toString() + " ha sido cambiado al espacio 3");
                } else if (vehiculo2.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo3.setEspacio(espacio);
                    vehiculo2.setEspacio(0);
                    String est = vehiculo2.getPlaca();
                    vehiculo3.setPlaca(est);
                    vehiculo2.setPlaca("");
                    est = vehiculo2.getMarca();
                    vehiculo3.setMarca(est);
                    est = vehiculo2.getModelo();
                    vehiculo3.setModelo(est);
                    int estv = vehiculo2.getAño();
                    vehiculo3.setAño(estv);
                    estv = vehiculo2.getMinutos();
                    vehiculo3.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo3.toString() + " ha sido cambiado al espacio 3");
                } else if (vehiculo4.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo3.setEspacio(espacio);
                    vehiculo4.setEspacio(0);
                    String est = vehiculo4.getPlaca();
                    vehiculo3.setPlaca(est);
                    vehiculo4.setPlaca("");
                    est = vehiculo4.getMarca();
                    vehiculo3.setMarca(est);
                    est = vehiculo4.getModelo();
                    vehiculo3.setModelo(est);
                    int estv = vehiculo4.getAño();
                    vehiculo3.setAño(estv);
                    estv = vehiculo4.getMinutos();
                    vehiculo3.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo3.toString() + " ha sido cambiado al espacio 3");
                }
                break;
            case 4:
                if (vehiculo4.getEspacio().equalsIgnoreCase("Uso")) {
                    System.out.println("\u001B[31mEste espacio ya se encuentra ocupado por el vehículo con placas " + vehiculo4.getPlaca());
                } else if (vehiculo1.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo4.setEspacio(espacio);
                    vehiculo1.setEspacio(0);
                    String est = vehiculo1.getPlaca();
                    vehiculo4.setPlaca(est);
                    vehiculo1.setPlaca("");
                    est = vehiculo1.getMarca();
                    vehiculo4.setMarca(est);
                    est = vehiculo1.getModelo();
                    vehiculo4.setModelo(est);
                    int estv = vehiculo1.getAño();
                    vehiculo4.setAño(estv);
                    estv = vehiculo1.getMinutos();
                    vehiculo4.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo4.toString() + " ha sido cambiado al espacio 4");
                } else if (vehiculo2.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo4.setEspacio(espacio);
                    vehiculo2.setEspacio(0);
                    String est = vehiculo2.getPlaca();
                    vehiculo4.setPlaca(est);
                    vehiculo2.setPlaca("");
                    est = vehiculo2.getMarca();
                    vehiculo4.setMarca(est);
                    est = vehiculo2.getModelo();
                    vehiculo4.setModelo(est);
                    int estv = vehiculo2.getAño();
                    vehiculo4.setAño(estv);
                    estv = vehiculo2.getMinutos();
                    vehiculo4.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo4.toString() + " ha sido cambiado al espacio 4");
                } else if (vehiculo3.getPlaca().equalsIgnoreCase(placa)) {
                    vehiculo4.setEspacio(espacio);
                    vehiculo3.setEspacio(0);
                    String est = vehiculo3.getPlaca();
                    vehiculo4.setPlaca(est);
                    vehiculo3.setPlaca("");
                    est = vehiculo3.getMarca();
                    vehiculo4.setMarca(est);
                    est = vehiculo3.getModelo();
                    vehiculo4.setModelo(est);
                    int estv = vehiculo3.getAño();
                    vehiculo4.setAño(estv);
                    estv = vehiculo3.getMinutos();
                    vehiculo4.setMinutos(estv);
                    System.out.println("El vehículo " + vehiculo4.toString() + " ha sido cambiado al espacio 4");
                }
                break;
            default:
                System.out.println("\u001B[31mNo existe el vehículo en el parqueadero");
                break;
        }
    }

    public static void regSalida(String placa) {
        if (vehiculo1.getPlaca().equalsIgnoreCase(placa)) {
            System.out.println("Se ha registrado la salida del vehículo " + vehiculo1.toString() + " debe cancelar $" + vehiculo1.getTotal());
            System.out.println("\u001B[31mEspacio 1 liberado");
            vehiculo1.setEspacio(0);
            vehiculo1.setPlaca("");
        } else if (vehiculo2.getPlaca().equalsIgnoreCase(placa)) {
            System.out.println("Se ha registrado la salida del vehículo " + vehiculo2.toString() + " debe cancelar $" + vehiculo2.getTotal());
            System.out.println("\u001B[31mEspacio 2 liberado");
            vehiculo2.setEspacio(0);
            vehiculo2.setPlaca("");
        } else if (vehiculo3.getPlaca().equalsIgnoreCase(placa)) {
            System.out.println("Se ha registrado la salida del vehículo " + vehiculo3.toString() + " debe cancelar $" + vehiculo3.getTotal());
            System.out.println("\u001B[31mEspacio 3 liberado");
            vehiculo3.setEspacio(0);
            vehiculo3.setPlaca("");
        } else if (vehiculo4.getPlaca().equalsIgnoreCase(placa)) {
            System.out.println("Se ha registrado la salida del vehículo " + vehiculo4.toString() + " debe cancelar $" + vehiculo4.getTotal());
            System.out.println("\u001B[31mEspacio 4 liberado");
            vehiculo4.setEspacio(0);
            vehiculo4.setPlaca("");
        } else {
            System.out.println("\u001B[31mEste vehículo no se encuentra registrado en el sistema");
        }
    }
}
