package de.fherfurt.appointment;

import de.fherfurt.appointment.resources.BaseResource;
import org.eclipse.jetty.server.Server;
import org.glassfish.jersey.jetty.JettyHttpContainerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URI;

/**
 * The type Web application.
 */
public class WebApplication {
    /**
     * The constant BASE_URI.
     */
    public static final String BASE_URI = "http://localhost:8080/";

    /**
     * Start server server.
     *
     * @return the server
     */
    public static Server startServer() {

        final ResourceConfig config = new ResourceConfig(BaseResource.class );
        Server server =
                JettyHttpContainerFactory.createServer(URI.create( BASE_URI ), config);

        return server;
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Logger LOG = LoggerFactory.getLogger( WebApplication.class );

        try {
            final Server server = startServer();

            Runtime.getRuntime().addShutdownHook( new Thread(() -> {
                try {
                    LOG.info("Shutting down the application...");
                    server.stop();
                    LOG.info("Done, exit.");
                } catch (Exception e) {
                    LOG.error(null, e);
                }
            }));

            LOG.info("Application started. -- Stop the application using CTRL+C\n");

            Thread.currentThread().join();
        } catch (InterruptedException ex) {
            LOG.error(null, ex);
        }
    }
}
