package me.peabee.web.errorhandler;

/**
 * Created by pengbo on 18-4-24.
 */
public class JSONException extends Exception {
    private String message;

    public JSONException() {
        super();
    }

    public JSONException(String message) {
        super(message);
    }

    public JSONException(String message, Throwable e) {
        super(message, e);
    }
}
