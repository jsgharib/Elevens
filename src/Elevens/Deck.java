package Elevens;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Deck{

	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
                  public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			"FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};
	
	private ArrayList<Card> cards;
	private int top;

                  public Deck(){
                  cards = new ArrayList<Card>(52);
                   for (int i = 0; i < SUITS.length; i++){
                       for (int n = 1; n < FACES.length; n++){
                           cards.add( new Card(SUITS[i], n));
                        }
                     }
                  }
                  
                  public String dealCard(){
                      String card = cards.get(0).toString();
                      cards.add(cards.get(0));
                      cards.remove(0);
                      return card;
                  }
   
                  public void shuffle(){
                      Collections.shuffle(cards);
                      } 
                  }