package hackneyGuide;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

/**
 * This class could be the handler for an AWS Lambda function powering an Alexa Skills Kit
 * experience. To do this, simply set the handler field in the AWS Lambda console to
 * "historybuff.HistoryBuffSpeechletRequestStreamHandler" For this to work, you'll also need to
 * build this project using the {@code lambda-compile} Ant task and upload the resulting zip file to
 * power your function.
 */
public class hackneyGuideSpeechletRequestStreamHandler extends SpeechletRequestStreamHandler {

    private static final Set<String> supportedApplicationIds;

    static {
        /*
         * This Id can be found on https://developer.amazon.com/edw/home.html#/ "Edit" the relevant
         * Alexa Skill and put the relevant Application Ids in this Set.
         */
        supportedApplicationIds = new HashSet<String>();
        supportedApplicationIds.add("amzn1.ask.skill.412c0b8b-7d0f-4e64-89ba-d4912b12910e");
    }

    public hackneyGuideSpeechletRequestStreamHandler() {
        super(new hackneyGuideSpeechlet(), supportedApplicationIds);
    }

    public hackneyGuideSpeechletRequestStreamHandler(Speechlet speechlet,
                                                     Set<String> supportedApplicationIds) {
        super(speechlet, supportedApplicationIds);
    }

}
