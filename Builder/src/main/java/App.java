
public class App {
    public static void main(String args[]) {

        User websiteUser = new User.Builder("bob", "bob@gmail.com").build();

        User websiteUser2 = new User.Builder("bob", "bob@gmail.com").firstName("bob").lastName("kevin").build();

        System.out.println(websiteUser2);
    }
}
