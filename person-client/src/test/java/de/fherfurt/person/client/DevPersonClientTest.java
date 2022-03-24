package de.fherfurt.person.client;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


/**
 * @author Jonas Helmboldt
 */
class DevPersonClientTest {

    @Test
    void returnAlbert() {
        DevPersonClient devPersonService = new DevPersonClient();
        Assertions.assertEquals("Albert", devPersonService.findByEmail("mail@mail.com").get().getName());
    }

    @Test
    void returnHeinrich() {
        DevPersonClient devPersonService = new DevPersonClient();
        Assertions.assertEquals("Heinrich", devPersonService.findByName("Heinrich").get(0).getName());
    }
}