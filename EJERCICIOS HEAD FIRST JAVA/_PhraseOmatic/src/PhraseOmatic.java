public class PhraseOmatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make three sets of words to choose from
        String[] wordListOne = {"agnostic", "opinionated", "voice activated", "haptically driven", "extencible", "reactive", "agent based", "functional", "AI enabled"};

        String[] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cloud native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        
        String[] wordListThree = {"framework", "library", "DSL", " REST API", "repository", "pipeline", "service mesh", "archtecture", "perspective", "design", "orientation"};
        
        // find lists length
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        // generate random numbers
        
        java.util.Random randomGen = new java.util.Random();
        int rand1 = randomGen.nextInt(oneLength);
        int rand2 = randomGen.nextInt(twoLength);
        int rand3 = randomGen.nextInt(threeLength);
        
        // build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        System.out.println("What we need is a " + phrase);
        

    }

}
