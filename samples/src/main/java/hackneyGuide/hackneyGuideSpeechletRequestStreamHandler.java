package hackneyGuide;

import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.lambda.SpeechletRequestStreamHandler;

import java.util.HashSet;
import java.util.Set;

/**
 * This class could be the handler for an AWS Lambda function powering an Alexa Skills Kit
 * experience. To do this, simply set the handler field in the AWS Lambda console to
 * "hackneyGuide.hackneyGuideSpeechletRequestStreamHandler" For this to work, you'll also need to
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
        supportedApplicationIds.add("amzn1.ask.skill.1729e62f-fbf9-4505-b4f2-1b26643ba3a1");
    }

    public hackneyGuideSpeechletRequestStreamHandler() {
        super(new hackneyGuideSpeechlet(), supportedApplicationIds);
    }

    public hackneyGuideSpeechletRequestStreamHandler(Speechlet speechlet,
                                                     Set<String> supportedApplicationIds) {
        super(speechlet, supportedApplicationIds);
    }

}
