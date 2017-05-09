/*

  This file contains a bunch of example tweets which you can use as sample
  data by writing

    new SampleTweets().t

  which evaluates to a TweetList containing these Tweets.

*/

class SampleTweets{
  TweetList t;
  SampleTweets(){
    t = new TLEmpty();
    t= new TLLink(textTweet9,t);
    t= new TLLink(textTweet8,t);
    t= new TLLink(textTweet7,t);
    t= new TLLink(textTweet6,t);
    t= new TLLink(textTweet5,t);
    t= new TLLink(textTweet4,t);
    t= new TLLink(textTweet2,t);
    t= new TLLink(textTweet1,t);
    t= new TLLink(imageTweet10,t);
    t= new TLLink(imageTweet9,t);
    t= new TLLink(imageTweet8,t);
    t= new TLLink(imageTweet7,t);
    t= new TLLink(imageTweet6,t);
    t= new TLLink(imageTweet5,t);
    t= new TLLink(imageTweet4,t);
    t= new TLLink(imageTweet2,t);
    t= new TLLink(imageTweet1,t);
    t= new TLLink(quoteTweet10,t);
    t= new TLLink(quoteTweet9,t);
    t= new TLLink(quoteTweet8,t);
    t= new TLLink(quoteTweet7,t);
    t= new TLLink(quoteTweet6,t);
    t= new TLLink(quoteTweet5,t);
    t= new TLLink(quoteTweet4,t);
    t= new TLLink(quoteTweet3,t);
    t= new TLLink(quoteTweet2,t);
    t= new TLLink(quoteTweet1,t);
    
  }

  TextTweet textTweet1 = new TextTweet(new User("amyhoy","Amy Hoy"),new DateTime(4,14,2017), "home is where the cat is","852984006815731712",2);
  ImageTweet imageTweet1 = new ImageTweet(new User("amyhoy","Amy Hoy"),new DateTime(4,14,2017), "home is where the cat is","852984006815731712","https://pbs.twimg.com/media/C9ZobpUXkAAi6SV.jpg",100,2);


  TextTweet textTweet2 = new TextTweet(new User("ghc","Grace Hopper(GHC)"),new DateTime(4,4,2017),"The Anita Borg Institute is looking for a new, dynamic CEO. Is someone you really admire perfect for the role? http://bit.ly/2nn9CEV ","849290510049071106",10);
  ImageTweet imageTweet2 = new ImageTweet(new User("ghc","Grace Hopper(GHC)"),new DateTime(4,4,2017),"The Anita Borg Institute is looking for a new, dynamic CEO. Is someone you really admire perfect for the role? http://bit.ly/2nn9CEV ","849290510049071106","https://pbs.twimg.com/media/C8lJN3aU0AApiN_.jpg",100,10);

  TextTweet textTweet4 = new TextTweet(new User("kobebryant"," Kobe Bryant"),  new DateTime(4, 22, 2017),"Mike and Kawhi were both in that #musecag", "855981430144479232");
  ImageTweet imageTweet4 = new ImageTweet(new User("android_robin", "Robin Lee"),new DateTime(2, 27,2015),"Back to CHN. Fight for dream! Ready for that.",   "571574450971406336", "https://pbs.twimg.com/media/B-6j70kWwAAaZzy.jpg", 3072);
  TextTweet textTweet5 = new TextTweet(new User("drose", "Derrick Rose"),new DateTime(11,11,2015),"Looking for the Yeezy 350 boost?  Go check out adidas Style Chicago at 50 East Oak Street. Raffle sign up ends Thursday at 5pm.", "664508326500175873",  26769);
  ImageTweet imageTweet5 = new ImageTweet(new User("Dwyane Wade", "DWade"),new DateTime(11,4,2017),"I try not to take anything for granted. 14 years later the love is still there for that number 3 jersey. Thank you fans!!!",   "851959081036378112", "https://pbs.twimg.com/media/C9LEQ-eW0AIY0Ig.jpg", 3072,79878);



 	 TextTweet textTweet6 = new TextTweet( new User("jollie12", "John Oliver"), new DateTime(10, 11, 2016), "Stack is static memory allocation", "87394032849194");
	 TextTweet textTweet7 = new TextTweet(new User("Markman", "Mark hemsworth"), new DateTime(12, 10, 2015), "Heap is dynamic memory allocation", "87394032849194");
	 TextTweet textTweet8 = new TextTweet(new User("Lks21", "Luke Skywalker"), new DateTime(10, 9, 2016), "May the fourth be with you", "2389239479239");
   TextTweet textTweet9 = new TextTweet(new User("UCSDJacobs", "UCSD Engineering"), new DateTime(2,3,2014), "Triton eyes!", "844298273435344896", 24576);

   ImageTweet imageTweet6 = new ImageTweet(new User("jollie12", "John Oliver"), new DateTime(10, 11, 2016), "Stack is static memory allocation", "87394032849194", "https://trustedpartner.cachefly.net/images/library/PalmBeachAtlanticUniversity2015/PBA/TU-Academic/School%20of%20Arts%20and%20Sciences/mathematics-and-computer-science_2.jpg", 19);
 	 ImageTweet imageTweet7 = new ImageTweet(new User("Markman", "Mark hemsworth"), new DateTime(12, 10, 2015), "heap is dynamic memory allocation", "498237394982398", "https://trustedpartner.cachefly.net/images/library/PalmBeachAtlanticUniversity2015/PBA/TU-Academic/School%20of%20Arts%20and%20Sciences/mathematics-and-computer-science_2.jpg", 19);
   ImageTweet imageTweet8 = new ImageTweet(new User("xkcdComic", "XKCD Comic"),new DateTime(3,13,2017), "Chat Systems https://xkcd.com/1810/  https://m.xkcd.com/1810/","841326252866834432", "https://pbs.twimg.com/media/C6z9xG1VsAAAU_t.jpg", 102, 2533);
   ImageTweet imageTweet9 = new ImageTweet(new User("TheEllenShow", "Ellen DeGeneres"), new DateTime(2,3,2014), "If only Bradley's arm was longer. Best photo ever. #oscars","440322224407314432", "https://pbs.twimg.com/media/BhxWutnCEAAtEQ6.jpg", 36, 2373052);
   ImageTweet imageTweet10 = new ImageTweet(new User("googleresearch", "Google Research"), new DateTime(5, 12, 2016), "At #nips2016? Stop by the Google booth to play with the real-time style transfer and VR SimFarm demos during the morning coffee break!", "805701212091912192", "https://pbs.twimg.com/media/Cy5s87PWEAEYevZ.jpg", 210, 85);

   QuoteTweet quoteTweet1 = new QuoteTweet(new User("ISS_CASIS", "ISS National Lab"), new DateTime(4, 18, 2017),"LIFTOFF! Go #Cygnus! Go #AtlasV!","805701212091912192-rt",imageTweet10);
   QuoteTweet quoteTweet2 = new QuoteTweet(new User("Guggenheim", "Guggenheim Museum"), new DateTime(4, 18, 2017),"3/24 & 3/25 at 1pm—Final screenings of the documentary film \"Peggy Guggenheim: Art Addict\" for #WomensHistoryMonth. http://gu.gg/vIm0309y5DQ ","805701212091912192-rt-rt",quoteTweet1);
   QuoteTweet quoteTweet3 = new QuoteTweet(new User("googleresearch", "Google Research"), new DateTime(4, 19,2017),"3/24 & 3/25 at 1pm—Final screen,ings of the documentary film \"Peggy Guggenheim: Art Addict\" for #WomensHistoryMonth. http://gu.gg/vIm0309y5DQ ","805701212091912192-rt-rt-rt",quoteTweet2);
   QuoteTweet quoteTweet4 = new QuoteTweet(new User("ISS_CASIS", "ISS National Lab"),new DateTime(5, 12, 2016),"New ISS National Lab science is en route to @Space_Station onboard @OrbitalATK #Cygnus! Thanks to @ulalaunch for giving us a lift!", "819044196371800065-rt",textTweet7);
   QuoteTweet quoteTweet5 = new QuoteTweet(new User("ISS_CASIS", "ISS National Lab"),new DateTime(5, 12, 2017),"Can you spot us on @NewYorker's cover? #LuciGutiérrez's \"Shelf Life\" wonderfully depicts Manhattan as a bookshelf! #FrankLloydWrightFridays", "819044196371800065-rt-rt",quoteTweet4);
   QuoteTweet quoteTweet6 = new QuoteTweet(new User("googleresearch", "Google Research"), new DateTime(6, 12, 2017),"Tap below to watch election night coverage of the #FrenchElection LIVE on Twitter","819044196371800065-rt-rt",quoteTweet5);
   QuoteTweet quoteTweet7 = new QuoteTweet(new User("googleresearch", "Google Research"), new DateTime(6, 12, 2017), "A warm welcome to Kingston. #Departures","819044196371800065-rt-rt-rt",quoteTweet6);
   QuoteTweet quoteTweet8 = new QuoteTweet(new User("ISS_CASIS", "ISS National Lab"), new DateTime(7, 12, 2017),  "I'll give it a go ...","819044196371800065-rt-rt-rt-rt",quoteTweet7);
   QuoteTweet quoteTweet9 = new QuoteTweet( new User("gov", "Twitter Government"),new DateTime(5,5,2017),"Awesome!","841326252866834432-rt",imageTweet8);
   QuoteTweet quoteTweet10 = new QuoteTweet( new User("gov", "Twitter Government"),new DateTime(5,5,2017),"Awesome!","2389239479239-rt",textTweet8);



}
