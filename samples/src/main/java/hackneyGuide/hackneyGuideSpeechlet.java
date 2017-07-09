package hackneyGuide;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.*;
import com.amazon.speech.ui.OutputSpeech;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SsmlOutputSpeech;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ellioe03 on 18/03/2017.
 */
@SuppressWarnings("ALL")
public class hackneyGuideSpeechlet implements Speechlet {

    private static final Logger log = LoggerFactory.getLogger(hackneyGuideSpeechlet.class);

    /**
     * Constant defining session attribute key for the event index.
     */
    private static final String SESSION_INDEX = "mode";

    /**
     * Constant defining session attribute key for the event text key for date of events.
     */
    private static final String SEARCH_MODE = "SEARCHMODE";
    private static final String TOP_FIVE_MODE = "TOPFIVE";


    String LOCATION = "Hackney";

    int NUMBER_OF_RESULTS = 3;

    String API_KEY = "f9f90025ec044ae4bd3d3e2731d667c8";

    String WELCOME_MESSAGE = LOCATION + " Guide. You can ask me for an attraction, the local news, or  say help. What will it be?";

    String WELCOME_REPROMPT = "You can ask me for an attraction, the local news, or  say help. What will it be?";

    String LOCATION_OVERVIEW = LOCATION + " is in North East Central London, United Kingdom.  It has theatres, restaurants, museums and open spaces with a population of about a quarter of a million people. Hackney Town Hall is approximately 5 miles (8 km) north-east of Charing Cross, St Pauls Cathedral being situated in between.  Hackney is bounded by Islington to the west, Haringey to the north, Waltham Forest to the north-east, Newham to the east, Tower Hamlets to the south-east and the City of London to the south-west. Much of Hackney retains an inner-city character, but in such places as Dalston large housing estates have been joined by newly developed gated communities. In South Hackney, near Victoria Park, terraced Georgian, Victorian and Edwardian housing still survives.  The historical and administrative heart of Hackney is the area roughly extending north from Mare Street and surrounding the Church of St John-at-Hackney; known as Hackney Central. To the north of the borough are Upper Clapton and Lower Clapton, Stamford Hill and Stoke Newington. To the east is the large open space of Hackney Marshes and the districts of Hackney Wick and Homerton. Light industries in the area around the River Lea employ over 3,000 people. Some of the area was used for the 2012 Summer Olympics.";

    String HELP_MESSAGE = "Here are some things you  can say: Give me an attraction. Tell me about " + LOCATION + ". Tell me the top five things to do. Tell me the local news.  What would you like to do?";

    String MORE_INFORMATION = "See your  Alexa app for  more  information.";

    String TRY_AGAIN_MESSAGE = "please try again.";

    String NO_ATTRACTION_ERROR_MESSAGE = "There was an error finding this attraction, " + TRY_AGAIN_MESSAGE;

    String TOP_FIVE_MORE_INFO = " You can tell me a number for more information. For example open number one.";

    String GET_MORE_INFO_REPROMPT_MESSAGE = "What number attraction would you like to hear about?";

    String GET_MORE_INFO_MESSAGE = "OK, " + GET_MORE_INFO_REPROMPT_MESSAGE;

    String GOODBYE_MESSAGE = "OK, have a nice time in " + LOCATION + ".";

    String NEWS_INTRO_MESSAGE = "These are the " + NUMBER_OF_RESULTS + " most recent " + LOCATION + " headlines, you can read more on your Alexa app. ";

    String HEAR_MORE_MESSAGE = "Would you like to hear about another top thing that you can do in " + LOCATION +"?";

    String NEW_LINE = "\n";

    String TOP_FIVE_INTRO = "Here are the top five things to  do in " + LOCATION + ".";


    @Override
    public void onSessionStarted(SessionStartedRequest request, Session session) throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        // any initialization logic goes here
    }

    @Override
    public SpeechletResponse onLaunch(LaunchRequest request, Session session) throws SpeechletException {
        log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        return getWelcomeResponse();
    }

    public SpeechletResponse getWelcomeResponse() {

            String speechOutput = WELCOME_MESSAGE;

            // If the user either does not reply to the welcome message or says something that is not
            // understood, they will be prompted again with this text.
            String repromptText = WELCOME_REPROMPT;

            return newAskResponse(speechOutput, false, repromptText, false);
        }

    public SpeechletResponse newAskResponse(String stringOutput, boolean isOutputSsml,
                                            String repromptText, boolean isRepromptSsml) {
        OutputSpeech outputSpeech, repromptOutputSpeech;
        if (isOutputSsml) {
            outputSpeech = new SsmlOutputSpeech();
            ((SsmlOutputSpeech) outputSpeech).setSsml(stringOutput);
        } else {
            outputSpeech = new PlainTextOutputSpeech();
            ((PlainTextOutputSpeech) outputSpeech).setText(stringOutput);
        }
        if (isRepromptSsml) {
            repromptOutputSpeech = new SsmlOutputSpeech();
            ((SsmlOutputSpeech) repromptOutputSpeech).setSsml(repromptText);
        } else {
            repromptOutputSpeech = new PlainTextOutputSpeech();
            ((PlainTextOutputSpeech) repromptOutputSpeech).setText(repromptText);
        }
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(repromptOutputSpeech);
        return SpeechletResponse.newAskResponse(outputSpeech, reprompt);
    }

    @Override
    public SpeechletResponse onIntent(IntentRequest request, Session session) throws SpeechletException {
        log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        Intent intent = request.getIntent();
        String intentName = intent.getName();

        if(session.getAttribute(SEARCH_MODE)!=null)
        session.setAttribute(SEARCH_MODE, SEARCH_MODE);

        if ("getOverview".equals(intentName)) {
            return searchModeHandler(intent, session);
        } else {
            return null;
        }
    }

    private SpeechletResponse searchModeHandler(Intent intent, Session session) {
        return null;
    }

    @Override
    public void onSessionEnded(SessionEndedRequest request, Session session) throws SpeechletException {

    }
}
