public class Lab3Ex4 {
    public static void main(String[] args) {
        String firstName = "Simon";
        String lastName = "Rogers";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        String nonsense = "My favourite number is ";
        double theAnswerToEverything = 42.34324;
        System.out.println(nonsense + theAnswerToEverything);

        int numberOfPies = 32;
        int numberOfPeople = 10;

        int wholePiesTaken = numberOfPies / numberOfPeople;
        double piesRemaining = (double) numberOfPies % numberOfPeople;

        System.out.println("There are " + wholePiesTaken + " pies each, and " + (int) piesRemaining + " leftover");
    }
}
