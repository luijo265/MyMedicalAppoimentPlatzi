import model.Doctor;
import model.ISchedulable;
import model.Patient;
import model.User;

import javax.print.Doc;

import java.util.Date;
import java.util.GregorianCalendar;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {

//        model.Doctor myDoctor = new model.Doctor();
        /*model.Doctor myDoctor = new model.Doctor();
        model.Doctor myDoctor2 = new model.Doctor();
        myDoctor.name = "HOLA";
        myDoctor.showName();
        myDoctor.showId();
        myDoctor2.showId();*/

//        showMenu();

        Doctor doctora = new Doctor("Dayana", "doctora@lolo.lo");
        Patient paciente = new Patient("Luis", "luijo@oo.o");
        paciente.setPhoneNumber("3132");

        doctora.addAvailableAppointment(new Doctor.AvailableAppointment(
                new GregorianCalendar(2022, 07,04).getTime(), "Tomorrow"));
        doctora.addAvailableAppointment(new Doctor.AvailableAppointment(
                new GregorianCalendar(2022, 07,15).getTime(), "Afternoon"));

        doctora.showDataUser();
        paciente.showDataUser();
        // Clase anonima
        User user = new User("Luis", "l@test.com") {
            @Override
            public void showDataUser() {
                System.out.println("HOLA USSER");
            }
        };
        user.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {
                System.out.println("Bien");
            }
        };

        /*
        for (model.Doctor.AvailableAppointment ap: doctora.getAvaliableAppointments()) {
            System.out.println(ap.getDate());
        }
         */
        // Actualmente no es necesario colocar el toString
        /*
            System.out.println(paciente.toString());
            System.out.println(doctora);
        */



    }

}
