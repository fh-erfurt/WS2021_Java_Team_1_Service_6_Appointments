package de.fherfurt.appointments.models;


import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.main.Campus;
import de.fherfurt.appointments.main.Repetition;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

    public class Creator {
        private final String name;
        private final String mTrkNr;
        private List<Appointment> termine = new ArrayList<>();

        /**
         * constructor of creator
         * @param name name of the creator
         * @param mTrkNr matrikelnumber of the creator
         * @author stephan teichmueller
         */
        public Creator(String name, String mTrkNr) {
            this.name = name;
            this.mTrkNr = mTrkNr;
        }

        /**
         * add appointments
         * @param appointments
         * @author stephan teichmueller
         */


        public void addAppointment(Appointment... appointments){

            this.termine.addAll(List.of(appointments));
        }

        /**
         * delete appointments
         * @param appointments
         * @author stephan teichmueller
         */

        public void delAppointment(Appointment... appointments){ // brricht bei ersten nicht eingetragenen Termin ab und berücksichtigt die anderen gar nicht
            for (Appointment appointment:appointments) {

                    this.termine.remove(appointment);



            }


        }

        /**
         * search for termine of an appointment
         * @return the date(termine) of the appointment
         * @author stephan teichmueller
         */

        public List<Appointment> getTermine() {
            return termine;
        }

        /**
         *
         * @return the name of appointment
         * @author stephan teichmueller
         */

        public String getName() {
            return name;
        }

        /**
         *
         * @return the matrikelnumber
         * @author jonas helmboldt
         */

        public String getMtrkNr() {
            return mTrkNr;
        }

        /**
         *
         * @param name
         * @param date
         * @param repetition
         * @param campusLocation
         * @param room
         * @param description
         * @return the new appointment
         * @author stephan teichmueller
         */

        public Appointment createAppointment(String name, LocalDateTime date, Repetition repetition, Campus campusLocation, String room, String description){
            Appointment appointment = new Appointment(name,this,date,repetition,campusLocation,room,description);
            addAppointment(appointment);
            return appointment;
        }
    }

