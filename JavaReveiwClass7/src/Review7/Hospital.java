package Review7;

public class Hospital {

    public static void main(String[] args) {
        Doctor doctor1 =new Doctor();
        doctor1.name="John";
        doctor1.lastName="Doe";
        doctor1.speciality="Dentist";

        Doctor.hospital="Inova";
        doctor1.work();

        Doctor doctor2 =new Doctor();
        doctor2.name="Jane";
        doctor2.lastName="Smith";
        doctor2.speciality="Cardiologist";

        Doctor.hospital="GW Hospital";
        System.out.println();
        doctor2.work();
        doctor1.work();
        System.out.println(doctor1.lastName);
        System.out.println(doctor2.lastName);

        }
    }

