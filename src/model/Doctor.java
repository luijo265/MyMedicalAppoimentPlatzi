package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor extends User implements ISchedulable {

    private String speciality;

    public Doctor(String name, String email){
        super(name, email);
    }

    private List<AvailableAppointment> ap = new ArrayList<>();

    public void addAvailableAppointment(AvailableAppointment ap){
        this.ap.add(ap);
    }

    public List<AvailableAppointment> getAvaliableAppointments(){
        return ap;
    }

    @Override
    public String toString() {
        return super.toString()+" model.Doctor{" +
                "speciality='" + speciality + '\'' +
                '}'
                + ap.toString()
                ;
    }

    @Override
    public void showDataUser() {
        System.out.println("Hospital: Cruz Roja");
        System.out.println("Area: Urulogia");
    }

    @Override
    public void schedule(Date date, String time) {

    }

    public static class AvailableAppointment {

        private int id_availableAppointment;
        private Date date;
        private String time;
        // AvailableAppointment


        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId_availableAppointment() {
            return id_availableAppointment;
        }

        public void setId_availableAppointment(int id_availableAppointment) {
            this.id_availableAppointment = id_availableAppointment;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    "id_availableAppointment=" + id_availableAppointment +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }

}
