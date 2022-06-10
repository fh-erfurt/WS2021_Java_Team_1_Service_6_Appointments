package de.fherfurt.appointments.storage;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.storage.exception.StorageException;


public interface IStorageController {

    void saveAppointment( Appointment appointment ) throws StorageException;

    Appointment loadAppointment() throws StorageException;
}
