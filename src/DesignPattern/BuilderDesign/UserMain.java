package DesignPattern.BuilderDesign;

public class UserMain {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setUserId("user1")
                .setUserName("user1")
                .setEmailId("user1@gmail.com").build();

        System.out.println(user);

        User user2 = User.UserBuilder.builder()
                .setUserId("user2")
                .setEmailId("user2@gmail.com")
                .setUserName("user2")
                .build();
        System.out.println(user2);
    }
}
