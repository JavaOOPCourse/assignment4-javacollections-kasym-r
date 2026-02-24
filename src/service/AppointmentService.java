package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        appointments.add("Math Consultation");
        appointments.add("Physics Consultation");
        appointments.add("CS Consultation");
        appointments.addFirst("URGENT: Academic Issue");
    }

    public void cancelLast() {
        if (!appointments.isEmpty()) {
            System.out.println("Cancelled: " + appointments.removeLast());
        }
    }

    public void showFirstAndLast() {
        if (!appointments.isEmpty()) {
            System.out.println("First appointment: " + appointments.getFirst());
            System.out.println("Last appointment: " + appointments.getLast());
        }
    }

    public void printAppointments() {
        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
