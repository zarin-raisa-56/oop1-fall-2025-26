//Extract the username (before @) from an email address.
package lab;

public class Task7 {
    
    public static void main(String[] args) {
        // ইমেইল অ্যাড্রেস
        String email = "meherun.nahar@gmail.com";

        // '@' এর অবস্থান বের করা
        int atPosition = email.indexOf("@");

        // substring দিয়ে ইউজারনেম কাটা
        String username = email.substring(0, atPosition);

        // ফলাফল দেখানো
        System.out.println("Username: " + username);
    }
}
