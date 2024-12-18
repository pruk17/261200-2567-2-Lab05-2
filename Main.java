public class Main {
    public static void main(String[] args) {
        User john = new User("john", 1946, "February", 6);
        john.displayInfo();
        System.out.println("  -----------------------------");
        //"nicolas", 1964 , "January", 7
        Admin nicolas = new Admin("nicolas", 1964 , "January", 7);
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);

        // Update Lab05-2 -----------------------------------
        john.displayHappyBirthday();    //"john", 1946, "February", 6  (Don't show)
        nicolas.displayHappyBirthday(); //"nicolas", 1964 , "January", 7 (Don't show)
        System.out.println("  -----------------------------");
        john = new User("john", 1946, "December", 18);
        nicolas = new Admin("nicolas", 1964 , "December", 18);
        john.displayHappyBirthday();    //"john", 1946, "December", 18 ;Today
        nicolas.displayHappyBirthday(); //"nicolas", 1964 , "December", ;Today
    }
}