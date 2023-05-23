package org.example;
/**
 * This class represents an WordGames
 * @version 1.0
 * @author Salvatore Scalisi
 */
public class WordGames {

    /**
     * This method say hello
     * @param word the name of the person greeted
     * @return String in console the word 'Hello' following the param 'word'
     */
    public void addHelloWord(String word){
        System.out.println("Hello "+word);
    }

    /**
     * This method concat name and surname
     * @param name the name of the person
     * @param surname the surname of the person
     *  @return concatenated String in console of 'name' and 'surname' param
     */
    public void getFullWord(String name, String surname){
        System.out.println(name.concat(" ").concat(surname));
    }
}