package ca.ualberta.cs.lonelytweet;

import android.util.Log;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	//Removed no param constructor, tweet must have a message

	public ImportantLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {

		String string = getTweetDate() + " | " + getTweetBody();

		Log.i("ImportantLonelyTweet", string);
		return getTweetDate() + " | " + getTweetBody() ;
	}

	public String getTweetBody() {
        return tweetBody.toUpperCase();
    }
}