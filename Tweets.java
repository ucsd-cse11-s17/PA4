import tester.*;

/**
 * This class provides an implementation of DateTime that is used in Tweet. You
 * are able to do comparisons and print HTML.
 */
class DateTime {
  int day;
  int month;
  int year;

 /**
  * Constructor for DateTime that initializes all fields.
  *
  * @param day the value of day for a datetime (1-31)
  * @param month the value of month for a datetime (1-12)
  * @param year the value of year for a datetime (0-2017)
  */
  DateTime(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }

 /**
  * Prints the corresponding HTML for the datetime.
  *
  * @return a string that represents the HTML for datetime
  */
  String toHTML() {
    return "<p id='datetime'>" + this.month + "/" + this.day + "/" + this.year + "</p>";
  }

 /**
  * Compare two datetime objects and determine if this one is earlier than the
  * one passed in.
  *
  * @param another the DateTime object to compare
  * @return true if this is earlier than another, otherwise false
  */
  boolean earlierThan(DateTime another) {
    if (this.year != another.year) {
      return (this.year < another.year);
    }
    else {
      if (this.month != another.month) {
        return (this.month < another.month);
      } else {
        return (this.day < another.day);
      }
    }
  }

 /**
  * Estimate the time from the DateTime object passed in.
  *
  * @param other the DateTime object to compare with
  * @return a string that represents the relationship of this and other in timestamp
  */
  String approximateTimeTo(DateTime other) {
    if(this.year == other.year && this.month == other.month && this.day == other.day) {
      return "Today";
    }
    else if(this.year > other.year) {
      return this.year - other.year + " year(s) from now";
    }
    else if(this.year < other.year) {
      return other.year - this.year + " year(s) ago";
    }
    else if(this.month > other.month) {
      return this.month - other.month + " month(s) from now";
    }
    else if(this.month < other.month) {
      return other.month - this.month + " month(s) ago";
    }
    else if(this.day > other.day) {
      return this.day - other.day + " day(s) from now";
    }
    else {
      return other.day - this.day + " day(s) ago";
    }
  }
}

/**
 * This class provides an implementation of User that is used in Tweet to
 * represent a user with username and fullname. You can do comparison and print
 *  corrsponding HTML.
 */
class User {

  String username;
  String fullname;

 /**
  * Constructor for User that initializes all fields.
  *
  * @param username the username for the User
  * @param fullname the fullname for the User
  */
  User(String username, String fullname) {
    this.username = username;
    this.fullname = fullname;
  }

  /**
   * Prints the corresponding HTML for User.
   *
   * @return a string that represents the HTML for User
   */
  String toHTML() {
    return "<a href='https://twitter.com/" + this.username + "' id='handle'>" + this.fullname + " (@" + this.username + ")</a>";
  }

 /**
  * Check if the user is the same one as the one passed in.
  *
  * @param other the User to compare with
  * @return true if they are referencing the same User object, false otherwise
  */
  boolean sameUser(User other){
    return this.username.equals(other.username) && this.fullname.equals(other.fullname);
  }

 /**
  * Getter method for getting the username.
  *
  * @return the username of User
  */
  String getUsername(){
    return this.username;
  }
}

/**
 * An abstract class that provides a blueprint for all kinds of Tweets.
 */
abstract class ATweet{
  User user;
  DateTime timestamp;
  String content;
  String tweetId;
  int likes;

 /**
  * Constructor for Atweet that initializes all fields in Atweet and initializes
  * likes to 0 by default. Only called by super.
  *
  * @param user the user for the Tweet
  * @param timestamp the date time for the Tweet
  * @param content the content for the Tweet
  * @param tweetId the ID for the Tweet
  */
  ATweet(User user, DateTime timestamp, String content, String tweetId) {
    this.user = user;
    this.timestamp = timestamp;
    this.content = content;
    this.tweetId = tweetId;
    this.likes = 0;
  }

  /**
   * Constructor for Atweet that initializes all fields in Atweet according to
   * the value passed in. Only called by super.
   *
   * @param user the user for the Tweet
   * @param timestamp the date time for the Tweet
   * @param content the content for the Tweet
   * @param tweetId the ID for the Tweet
   * @param likes the number of likes for the Tweet
   */
  ATweet(User user, DateTime timestamp, String content, String tweetId, int likes) {
    this.user = user;
    this.timestamp = timestamp;
    this.content = content;
    this.tweetId = tweetId;
    this.likes = likes;
  }

 /**
  * Check if a Tweet is earier than the one passed in by comparing their timestamps
  *
  * @param other the other ATweet to compare with
  * @return true if this is earlier than the one passed in , false otherwise
  */
  boolean earlierThan(ATweet other){
    return this.timestamp.earlierThan(other.timestamp);
  }

 /**
  * Getter method for getting the username of the User of ATweet.
  *
  * @return the username of User in ATweet
  */
  String getUsername(){
    return this.user.getUsername();
  }

  /**
   * Getter method for getting the timestamp of ATweet.
   *
   * @return the timestamp in ATweet
   */
  DateTime getTimestamp(){
    return this.timestamp;
  }

  /**
   * Getter method for getting the content of ATweet.
   *
   * @return the content of ATweet
   */
  String getContent(){
    return this.content;
  }

  /**
   * Getter method for getting the ID of ATweet.
   *
   * @return the ID of ATweet
   */
  String getTweetId(){
    return this.tweetId;
  }

  /**
   * Getter method for getting the number of likes of ATweet.
   *
   * @return the number of likes of ATweet
   */
  int getLikes(){
    return this.likes;
  }

 /**
  * Check if the content of the ATweet contains a URL.
  *
  * @return true if it contains, false otherwise
  */
  boolean hasLink(){
    return (this.content.indexOf("https://") != -1);
  }

  /**
   * Reconstruct the URL for the ATweet by concatenating important componenets
   * according to the right format.
   *
   * @return a string that represents the URL for the ATweet
   */
  String toLink(){
    return ("https://twitter.com/" + this.user.username + "/status/" + this.tweetId);
  }

  /**
   * Check if the ATweet has the same user as the one passed in.
   *
   * @param other the ATweet to compare with
   * @return true if they have the same User, false otherwise
   */
  boolean sameUser(ATweet other){
    return this.user.username.equals(other.user.username);
  }

 /**
  * Quote an Atweet with a new User, DateTime and content.
  *
  * @param user the new user for the new quote tweet
  * @param timestamp the new timestamp for the new quote tweet
  * @param content the new content for the new quote tweet
  * @return a new QuoteTweet object with the right properties
  */
  QuoteTweet quote(User user, DateTime timestamp, String content){
    return new QuoteTweet(user, timestamp, content, this.tweetId + "-rt", this);
  }

 /**
  * Get a string representation of the summary of the Tweet (only username and
  * content) in HTML format
  *
  * @return a string that represents the HTML of the summary
  */
  abstract String summary();

  /**
   * Get a string representation of the HTML of the Tweet.
   *
   * @return a string that represents the HTML of the ATweet
   */
  abstract String toHTML();

  /**
   * Calculate the estimated load time for Tweet
   *
   * @param kbPerSec the loading speed in kilobytes
   * @return a double that represents the total load time for the ATweet
   */
  abstract double estimatedLoadTime(double kbPerSec);

  /**
   * Get the depth of a ATweet.
   *
   * @return an int that represents the depth of a ATweet
   */
  abstract int depth();

  /**
   * Determine whether a certain string is in ATweet
   *
   * @param toSearch the string to search in Atweets
   * @return true if the string is in any of the Atweet, false otherwise
   */
  abstract boolean search(String toSearch);

  /**
   * Calculate the number of ATweets by a specific user.
   *
   * @param user the user to match
   * @return a int that represents the number of ATweet
   */
  abstract int tweetsByUser(User user);

  /**
   * Calculate the total number of likes of tweets by a specific user.
   *
   * @param user the user to match
   * @return an int that represents the total likes for tweets that are posted
   *         by this user
   */
  abstract int likesForUserTweets(User user);
}

/**
 * This class provides an implementation of Tweet that only has text, which
 * extends ATweet
 */
class TextTweet extends ATweet{

  /**
   * Constructor for TextTweet that initializes all fields in TextTweet according to
   * the value passed in.
   *
   * @param user the user for the TextTweet
   * @param timestamp the date time for the TextTweet
   * @param content the content for the TextTweet
   * @param tweetId the ID for the TextTweet
   * @param likes the number of likes for the TextTweet
   */
  TextTweet(User user, DateTime timestamp, String content, String tweetId, int likes) {
    super(user, timestamp, content, tweetId);
    this.likes = likes;
  }

  /**
   * Constructor for TextTweet that initializes all fields in TextTweet
   * according to the value passed in. Initialize likes to 0.
   *
   * @param user the user for the TextTweet
   * @param timestamp the date time for the TextTweet
   * @param content the content for the TextTweet
   * @param tweetId the ID for the TextTweet
   * @param likes the number of likes for the TextTweet
   */
  TextTweet(User user, DateTime timestamp, String content, String tweetId) {
    super(user, timestamp, content, tweetId);
  }

  /**
   * Calculate the estimated load time for TextTweet according to the length of
   * the content
   *
   * @param kbPerSec the loading speed in kilobytes
   * @return a double that represents the total load time for the TextTweet
   */
  double estimatedLoadTime(double kbPerSec) {
    return this.content.length() / kbPerSec / 1024;
  }

  /**
   * Get a string representation of the HTML of the TextTweet.
   *
   * @return a string that represents the HTML of the TextTweet
   */
  String toHTML() {
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" + this.timestamp.toHTML() + "\n" + "<p>" + this.content + "</p>\n"
        + "<p id='likes'>" + this.likes + " likes</p>\n</div>";
  }

  /**
   * Get the depth of a text tweet. The depth is 1 because text tweet is always
   * the base case.
   *
   * @return an int that represents the depth of a text tweet.
   */
  int depth(){
    return 1;
  }

  /**
   * Determine whether a certain string is in TextTweet
   *
   * @param toSearch the string to search in Texttweet
   * @return true if the string is in the text tweet, false otherwise
   */
  boolean search(String toSearch){
    return (this.content.indexOf(toSearch) != -1);
  }

  /**
   * Check if the text tweet is by a specific user. Served as base case.
   *
   * @param user the user to match
   * @return a int that represents the number of tweets that are by this user
   */
  int tweetsByUser(User user){
    if(this.user.sameUser(user))
      return 1;
    else
      return 0;
  }

  /**
   * Check if the user matches and return right value for likes.Served as base case.
   *
   * @param user the user to match
   * @return the number of likes of this tweet if user matches, 0 otherwise
   */
  int likesForUserTweets(User user){
    if(this.user.sameUser(user))
      return this.likes;
    else
      return 0;
  }

  /**
   * Get a string representation of the summary of the text tweet (only username
   * and content) in HTML format
   *
   * @return a string that represents the HTML of the summary
   */
  String summary(){
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" +  "<p>" + this.content + " " + "</p>\n</div>";
  }

}

/**
 * This class provides an implementation of Tweet that has images, which
 * extends ATweet
 */
class ImageTweet extends ATweet{
  String imageURL;
  int imageKB;

  /**
   * Constructor for ImageTweet that initializes all fields in ImageTweet
   * according to the value passed in.
   *
   * @param user the user for the ImageTweet
   * @param timestamp the date time for the ImageTweet
   * @param content the content for the ImageTweet
   * @param tweetId the ID for the ImageTweet
   * @param imageURL the URL of the image
   * @param imageKB the size of the image
   * @param likes the number of likes for the ImageTweet
   */
  ImageTweet(User user, DateTime timestamp, String content, String tweetId, String imageURL, int imageKB, int likes) {
    super(user, timestamp, content, tweetId);
    this.imageURL = imageURL;
    this.imageKB = imageKB;
    this.likes = likes;
  }

  /**
   * Constructor for ImageTweet that initializes all fields in ImageTweet
   * according to the value passed in. Initialize likes to 0.
   *
   * @param user the user for the ImageTweet
   * @param timestamp the date time for the ImageTweet
   * @param content the content for the ImageTweet
   * @param tweetId the ID for the ImageTweet
   * @param imageURL the URL of the image
   * @param imageKB the size of the image
   */
  ImageTweet(User user, DateTime timestamp, String content, String tweetId, String imageURL, int imageKB) {
    super(user, timestamp, content, tweetId);
    this.imageURL = imageURL;
	  this.imageKB = imageKB;
  }


  /**
   * Calculate the estimated load time for image tweet according to the length of
   * the content and the size of the image.
   *
   * @param kbPerSec the loading speed in kilobytes
   * @return a double that represents the total load time for the image tweet
   */
  double estimatedLoadTime(double kbPerSec) {
    return this.content.length() / kbPerSec / 1024 + this.imageKB / kbPerSec;
  }

  /**
   * Get a string representation of the HTML of an image tweet.
   *
   * @return a string that represents the HTML of an image tweet
   */
  String toHTML() {
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" + this.timestamp.toHTML() + "\n" + "<p>" + this.content + "</p>"
        + "<img id='tweetimage' src='" + this.imageURL + "'>"
        + "<p id='likes'>" + this.likes + " likes</p>"
        + "\n</div>";
  }

  /**
   * Get the depth of an image tweet. The depth is 1 because image tweet is always
   * the base case.
   *
   * @return an int that represents the depth of an image tweet.
   */
  int depth(){
    return 1;
  }

  /**
   * Determine whether a certain string is in a image tweet
   *
   * @param toSearch the string to search in a image tweet
   * @return true if the string is in the image tweet, false otherwise
   */
  boolean search(String toSearch){
    return (this.content.indexOf(toSearch) != -1);
  }

  /**
   * Check if the image tweet is by a specific user. Served as base case.
   *
   * @param user the user to match
   * @return a int that represents the number of tweets that are by this user
   */
  int tweetsByUser(User user){
    if(this.user.sameUser(user))
      return 1;
    else
      return 0;
  }

  /**
   * Check if the user matches and return right value for likes. Served as base case.
   *
   * @param user the user to match
   * @return the number of likes of this tweet if user matches, 0 otherwise
   */
  int likesForUserTweets(User user){
    if(this.user.sameUser(user))
      return this.likes;
    else
      return 0;
  }

  /**
   * Get a string representation of the summary of the image tweet (only username
   * content and the image URL) in HTML format
   *
   * @return a string that represents the HTML of the summary
   */
  String summary(){
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" +  "<p>" + this.content + " " + "</p>\n</div>";
  }

}

/**
 * This class provides an implementation of Tweet that quotes other tweets, which
 * extends ATweet
 */
class QuoteTweet extends ATweet{
  ATweet originalTweet;

  /**
   * Constructor for QuoteTweet that initializes all fields in QuoteTweet
   * according to the value passed in. Initialize likes to 0.
   *
   * @param user the user for the ImageTweet
   * @param timestamp the date time for the ImageTweet
   * @param content the content for the ImageTweet
   * @param tweetId the ID for the ImageTweet
   * @param originalTweet the original tweet for this quote tweet
   */
  QuoteTweet(User user, DateTime timestamp, String content, String tweetId, ATweet originalTweet){
    super(user, timestamp, content, tweetId);
	this.originalTweet = originalTweet;
  }

  /**
   * Constructor for QuoteTweet that initializes all fields in QuoteTweet
   * according to the value passed in.
   *
   * @param user the user for the ImageTweet
   * @param timestamp the date time for the ImageTweet
   * @param content the content for the ImageTweet
   * @param tweetId the ID for the ImageTweet
   * @param originalTweet the original tweet for this quote tweet
   * @param likes the number of likes of this quote tweet
   */
  QuoteTweet(User user, DateTime timestamp, String content, String tweetId, ATweet originalTweet, int likes){
    super(user, timestamp, content, tweetId, likes);
	  this.originalTweet = originalTweet;
  }

  /**
   * Calculate the estimated load time for quote tweet according to the length of
   * the content of all tweets by recursion.
   *
   * @param kbPerSec the loading speed in kilobytes
   * @return a double that represents the total load time for the quote tweet
   */
  double estimatedLoadTime(double kbPerSec) {
    return this.content.length() / kbPerSec / 1024 + originalTweet.estimatedLoadTime(kbPerSec);
  }

  /**
   * Get a string representation of the HTML of a quote tweet.
   *
   * @return a string that represents the HTML of a quote tweet
   */
  String toHTML() {
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" + this.timestamp.toHTML() + "\n" + "<p>" + this.content + "</p>\n"
	    + originalTweet.summary() + "<p id='likes'>" + this.likes + " likes</p>\n</div>";
  }

  /**
   * Get the depth of a quote tweet by using recursion.
   *
   * @return an int that represents the depth of a quote tweet.
   */
  int depth(){
    return 1 + originalTweet.depth();
  }

  /**
   * Determine whether a certain string is in a quote tweet
   *
   * @param toSearch the string to search in a quote tweet
   * @return true if the string is in the quote tweet, false otherwise
   */
  boolean search(String toSearch){
    return (this.content.indexOf(toSearch) != -1) || originalTweet.search(toSearch);
  }

  /**
   * Check the number of the quote tweets that are by a specific user using
   * recursion.
   *
   * @param user the user to match
   * @return a int that represents the number of tweets that are by this user
   */
  int tweetsByUser(User user){
    if(this.user.sameUser(user))
      return 1 + originalTweet.tweetsByUser(user);
    else
      return originalTweet.tweetsByUser(user);
  }

  /**
   * Calculate the total number of likes of a chain of tweets.
   *
   * @param user the user to match
   * @return an int that represents the number of total likes of the tweets by
   *         this user
   */
  int likesForUserTweets(User user){
    if(this.user.sameUser(user))
      return this.likes + originalTweet.likesForUserTweets(user);
    else
      return originalTweet.likesForUserTweets(user);
  }

  /**
   * Get a string representation of the summary of the Tweet (only username,
   * content and the URL of the original tweet) in HTML format
   *
   * @return a string that represents the HTML of the summary
   */
  String summary(){
    return "<div id='tweet'>\n" + this.user.toHTML() + "\n" +  "<p>" + this.content + " " +
           "twitter.com/" + this.user.username + "/status/" + this.tweetId + "</p>\n</div>";
  }

}
