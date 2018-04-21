public class User {

    // required
    private String userName;
    private String emailAddress;

    // optional
    private String firstName;
    private String lastName;
    private int phoneNumber;
    private String address;

    // private constructor
    private User(Builder builder) {
        userName = builder.userName;
        emailAddress = builder.emailAddress;
        firstName = builder.firstName;
        lastName = builder.lastName;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
    }

    @Override
    public String toString() {
        return "User [userName=" + userName + ", emailAddress=" + emailAddress + ", firstName+" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
    }

    public static class Builder {
        // required
        private String userName;
        private String emailAddress;

        // optional
        private String firstName;
        private String lastName;
        private int phoneNumber;
        private String address;

        public Builder(String userName, String email) {
            this.userName = userName;
            this.emailAddress = email;
        }

        public Builder firstName(String value) {
            this.firstName = value;
            //return instance of Builder
            return this;
        }

        public Builder lastName(String value) {
            this.lastName = value;
            //  return instance of Builder
            return this;
        }

        // creation of User object
        public User build() {
            // return instance of particular User object
            // this is the builder
            return new User(this);
        }

    }
}
