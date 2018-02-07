
/**
 * Write a description of class MarkovRunner here.
 * 
 * @author Duke Software
 * @version 1.0
 */

import edu.duke.*;

public class MarkovRunner {
    public void runMarkovZero() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovZero markov = new MarkovZero();
        markov.setRandom(88);
        markov.setTraining(st);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(500);
            printOut(text);
        }
    }
    
    public void runMarkovOne() {
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovOne markov = new MarkovOne();
        //markov.setRandom(42);
        markov.setRandom(273);
        markov.setTraining(st);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(500);
            printOut(text);
        }
        /*we can set setRandom seed to 42 so we get "nd are, Prevedowalvism n thastsour tr ndsang heag ti. the ffinthe
         * as the first line just as required by exercise as part of assignment 1.
         */
    }
    
    public void runMarkovFour() {
        //This method executes the markov four class as we did with markov one. 
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovFour markov = new MarkovFour();
        //We gotta set random seed to 25 as required. 
        //markov.setRandom(25);
        markov.setRandom(371);
        markov.setTraining(st);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(500);
            printOut(text);
        }
        //The results we get are correct, success!
    }
    
    public void runMarkovModel() {
        //This method executes the markov N class as we did with markov one. 
        FileResource fr = new FileResource();
        String st = fr.asString();
        st = st.replace('\n', ' ');
        MarkovModel markov = new MarkovModel();
        //We gotta set model to 6 and random seed to 38 as required. 
        //markov.setModel(6);
        markov.setModel(8);
        //markov.setRandom(38);
        markov.setRandom(365);
        markov.setTraining(st);
        for(int k=0; k < 3; k++){
            String text = markov.getRandomText(500);
            printOut(text);
        }
        //The results we get are correct, success!
    }
    
    private void printOut(String s){
        String[] words = s.split("\\s+");
        int psize = 0;
        System.out.println("----------------------------------");
        for(int k=0; k < words.length; k++){
            System.out.print(words[k]+ " ");
            psize += words[k].length() + 1;
            if (psize > 60) {
                System.out.println();
                psize = 0;
            }
        }
        System.out.println("\n----------------------------------");
    }
    
}
