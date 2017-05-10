/**
 * An interface that has an abstract description for all queries.
 */
interface IQuery {

  /**
   * Determine whether a tweet is qualified according to the query.
   *
   * @param atweet the ATweet to check
   * @return true if atweet matches the query, false otherwise
   */
  boolean matches(ATweet atweet);
}

// You will implement the three classes below

class ContainsQuery implements IQuery {

}

class BeforeQuery implements IQuery {

}

class UserQuery implements IQuery{

}
