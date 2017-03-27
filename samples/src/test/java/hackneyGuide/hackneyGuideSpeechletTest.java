package hackneyGuide;

import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.SpeechletResponse;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by ellioe03 on 19/03/2017.
 */

@RunWith(MockitoJUnitRunner.class)
public class hackneyGuideSpeechletTest {

    hackneyGuideSpeechlet underTest = new hackneyGuideSpeechlet();

    @Mock
    SessionStartedRequest sessionStartedRequest;
    @Mock
    LaunchRequest launchRequest;
    @Mock
    Session session;
    @Mock
    SpeechletResponse getWelcomeResponse;



    @Before
    public void setUp() throws Exception {
    }


    @Test
    public void onSessionStarted() throws Exception {
        underTest.onSessionStarted(sessionStartedRequest,session);
    }

    @Test
    public void onLaunch() throws Exception {

        SpeechletResponse expected = underTest.onLaunch(launchRequest,session);

        assertThat(expected, instanceOf(SpeechletResponse.class));
    }

    @Test
    public void getWelcomeResponse() throws Exception {

        SpeechletResponse expected = underTest.getWelcomeResponse();

        assertThat(expected, instanceOf(SpeechletResponse.class));
    }

    @Test
    public void newAskResponse() throws Exception {
        SpeechletResponse expected = underTest.newAskResponse("Welcome",false, "What?",false);
        assertThat(expected, instanceOf(SpeechletResponse.class));
    }

    @Test
    public void onIntent() throws Exception {

    }

    @Test
    public void onSessionEnded() throws Exception {

    }

}