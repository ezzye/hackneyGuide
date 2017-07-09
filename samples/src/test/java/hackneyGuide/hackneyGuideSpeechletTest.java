package hackneyGuide;

import com.amazon.speech.speechlet.*;
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

//@RunWith(MockitoJUnitRunner.class)
//public class hackneyGuideSpeechletTest {
//
//    hackneyGuideSpeechlet underTest = new hackneyGuideSpeechlet();
//
//    @Mock
//    SessionStartedRequest sessionStartedRequest;
//    @Mock
//    LaunchRequest launchRequest;
//    @Mock
//    Session session;
//    @Mock
//    SpeechletResponse getWelcomeResponse;
//    @Mock
//    IntentRequest intentRequest;
//
//
//
//    @Before
//    public void setUp() throws Exception {
//    }
//
//    // start session
//    @Test
//    public void onSessionStarted() throws Exception {
//        underTest.onSessionStarted(sessionStartedRequest,session);
//    }
//
//    // onLaunch request returns a welcome response
//    @Test
//    public void onLaunch() throws Exception {
//
//        SpeechletResponse expected = underTest.onLaunch(launchRequest,session);
//        assertThat(expected, instanceOf(SpeechletResponse.class));
//    }
//
//    // welcome response returns a response
//    @Test
//    public void getWelcomeResponse() throws Exception {
//
//        SpeechletResponse expected = underTest.getWelcomeResponse();
//        assertThat(expected, instanceOf(SpeechletResponse.class));
//    }
//
//    // welcome returns new ask response
//    @Test
//    public void newAskResponse() throws Exception {
//        SpeechletResponse expected = underTest.newAskResponse("Welcome",false, "What?",false);
//        assertThat(expected, instanceOf(SpeechletResponse.class));
//    }

//    @Test
//    public void onIntentTest() throws Exception {
//
//        SpeechletResponse expected = underTest.onIntent(intentRequest,session);

        //onIntent  request, when no session state, sets session state to searchmode and returns an searchmode handler


        //onIntent  request, when searchmode session state,  returns a either searchmode handler or topfive handler depending on intent

        //onIntent  request, when topfive session state,  returns an topfive handler

//    }



    //onSessionEnded  request,  returns a response and ends session

    //a searchmode handler returns a response and sets state depending on intent

    //a topfive handler returns a response depending on intent



//}