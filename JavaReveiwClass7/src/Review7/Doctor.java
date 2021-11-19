package Review7;

public class Doctor {
    String name;
    String lastName;
    String speciality;
    double salary;
    //instacne method can work with instacne and static
    static String hospital;

    void printInfo(){
        System.out.println(name+" "+lastName+" is a "+speciality);
    }
    void work(){
        System.out.println(name+"works at hospital"+hospital);
    }
    void getPaid(){
        System.out.println(name+"gets paid"+salary);
    }
}
