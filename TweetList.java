interface TweetList {
  TweetList filter(IQuery q);
  int count(IQuery q);
  String toHTML();
  int length();
}

// You will implement the methods above in each of the two classes below

class TLLink implements TweetList{
  ATweet tweet;
  TweetList rest;
  TLLink(ATweet tweet, TweetList rest){
    this.tweet = tweet;
    this.rest=rest;
  }
}

class TLEmpty implements TweetList{
  TLEmpty(){ }
}
