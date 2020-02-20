package emailapps;

public class Email {

    private String firstName;
    private String lastName;
    private String password;
    private String departament;
    private String alternateMail;
    int mailboxCapacity;

    Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String  randomPassword(int length){

        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*()1234567890";
        String password;

        for(int i=0;i<length;i++)
        {
            Math.random()
        }
    }

}
