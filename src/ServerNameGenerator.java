public class ServerNameGenerator {

        private static String[] noun = {"time", "person", "year", "way", "day", "thing", "man", "world", "life", "hand"};
        private static String[] adjective = {"ashamed", "adorable", "attractive", "beautiful", "awful", "aggressive", "cruel", "clever", "tasty", "jealous"};

        private static String randElem(String[] str){
            int randNum = (int) (Math.random() * str.length);
            return str[randNum];
        }

    public static void main(String[] args) {
        String nounServer = randElem(noun);
        String adjectiveServer = randElem(adjective);
        System.out.println("Here is your server name: ");
        System.out.println(adjectiveServer + "-" + nounServer);
    }

    }

