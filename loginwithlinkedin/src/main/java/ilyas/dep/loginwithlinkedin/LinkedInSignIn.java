package ilyas.dep.loginwithlinkedin;

import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class LinkedInSignIn {
    /*CONSTANT FOR THE AUTHORIZATION PROCESS*/

    /****FILL THIS WITH YOUR INFORMATION*********/
//This is the public api key of our application
    private static final String API_KEY = "817qgzw9coekgq";
    //This is the private api key of our application
    private static final String SECRET_KEY = "ItSaYh3myoGfj5gQ";
    //This is any string we want to use. This will be used for avoiding CSRF attacks. You can generate one here: http://strongpasswordgenerator.com/
    private static final String STATE = "E3ZYKC1T6H2yP4z";
    //This is the url that LinkedIn Auth process will redirect to. We can put whatever we want that starts with http:// or https:// .
//We use a made up url that we will intercept when redirecting. Avoid Uppercases.
    //private static final String REDIRECT_URI = "http://com.amalbit.redirecturl";
    private static final String REDIRECT_URI = "https://eventify.io/callback/linkedin.php";
    /*********************************************/

//These are constants used for build the urls
    private static final String AUTHORIZATION_URL = "https://www.linkedin.com/uas/oauth2/authorization";
    private static final String ACCESS_TOKEN_URL = "https://www.linkedin.com/uas/oauth2/accessToken";
    private static final String SECRET_KEY_PARAM = "client_secret";
    private static final String RESPONSE_TYPE_PARAM = "response_type";
    private static final String GRANT_TYPE_PARAM = "grant_type";
    private static final String GRANT_TYPE = "authorization_code";
    private static final String RESPONSE_TYPE_VALUE ="code";
    private static final String CLIENT_ID_PARAM = "client_id";
    private static final String STATE_PARAM = "state";
    private static final String REDIRECT_URI_PARAM = "redirect_uri";
    /*---------------------------------------*/
    private static final String QUESTION_MARK = "?";
    private static final String AMPERSAND = "&";
    private static final String EQUALS = "=";

    private WebView webView;
    private ProgressDialog pd;

    /*------------------------------------*/
    String profileUrl = "https://api.linkedin.com/v2/me?projection=(id,firstName,lastName,profilePicture(displayImage~:playableStreams))";
    String accessToken;
    String linkedInUserEmailAddress;
    SharedPreferences sharedPreferences;
    String emailAddress = "https://api.linkedin.com/v2/emailAddress?q=members&projection=(elements*(handle~))";
    String deviceId, location, country;
    String linkedInUserId, linkedInUserFirstName, linkedInUserLastName, linkedInUserProfile;
    ProgressBar social_login_progress_linkedIn;
}
