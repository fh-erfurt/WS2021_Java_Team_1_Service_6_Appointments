package de.fherfurt.appointments.storage;

import de.fherfurt.appointments.main.Appointment;
import de.fherfurt.appointments.storage.exception.StorageException;

public class JpaStorageController implements IStorageController{
    @Override
    public void saveAppointment(Appointment appointment) throws StorageException {

    }

    @Override
    public Appointment loadAppointment() throws StorageException {
        return null;
    }
}
