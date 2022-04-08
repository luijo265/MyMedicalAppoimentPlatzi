import javax.print.Doc;

import java.util.Date;
import java.util.GregorianCalendar;

import static ui.UIMenu.*;

public class Main {

    public static void main(String[] args) {

//        Doctor myDoctor = new Doctor();
        /*Doctor myDoctor = new Doctor();
        Doctor myDoctor2 = new Doctor();
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

        /*
        for (Doctor.AvailableAppointment ap: doctora.getAvaliableAppointments()) {
            System.out.println(ap.getDate());
        }
         */
        // Actualmente no es necesario colocar el toString
        System.out.println(paciente.toString());
        System.out.println(doctora);

    }

}
