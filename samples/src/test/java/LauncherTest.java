import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.server.Server;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.net.HttpURLConnection;
import java.net.URL;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by ellioe03 on 14/06/2017.
 */
//public class LauncherTest {
//
//    private Server server;
//
//    @Before
//    public void startJetty() throws Exception
//    {
//        String[] args = new String[0];
//        Launcher.main(args);
//
//    }
//
//    @After
//    public void stopJetty()
//    {
//        try
//        {
//            server.stop();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testGet() throws Exception
//    {
//        // Test GET
//        HttpURLConnection http = (HttpURLConnection)new URL("http://localhost:9999/hello").openConnection();
//        http.connect();
//        assertThat("Response Code", http.getResponseCode(), is(HttpStatus.OK_200));
//    }
//
//
//}