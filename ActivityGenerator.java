import java.util.Random;
//reminders to bestie boo
public class ActivityGenerator {
    public static void main(String[] args) {
        String[] compliments = {"Getting Boba", "Playing Pool", "Reading at Johnson Park", "Going on a Picnic", "Rock Climbing","Chasing geese at Johnson Park", "Taking a walk at Johnson Park", "Visiting Sandy Hook", "Visiting the Jersey Shore", "Getting Coffee at Dunkin'", "Getting Breakfast at Dunkin'", "Getting Brunch at Dunkin'", "Getting Dinner at Wawa", "Going on a Study Date", "The Rutgers Cinema", "Going Thrifting", "Going Book Thirfting"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(compliments.length);
        System.out.println("ahahahah there are definitely things to do in new brunswick with your friends hahaha why don't you tryyy");
        System.out.println(compliments[randomIndex]);
    }
}
