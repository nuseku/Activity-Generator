import java.util.Random;
//reminders to bestie boo
public class ActivityGenerator {
    public static void main(String[] args) {
        String[] compliments = {"Getting Boba", "Playing Pool", "Reading at a Park", "Going on a Picnic", "Rock Climbing", "taking a walk at Johnson Park", "Visiting Sandy Hook", "Visiting the Jersey Shore", "Getting Coffee", "getting Breakfast", "Getting Brunch", "Getting Dinner", "Going on a Study Date", "The Rutgers Cinema", "Going Thrifting", "Going Book Thirfting"};
        Random rand = new Random();
        int randomIndex = rand.nextInt(compliments.length);
        System.out.println("ahahahah there are definitely things to do in new brunswick with your friends hahaha why don't you tryyy");
        System.out.println(compliments[randomIndex]);
    }
}
