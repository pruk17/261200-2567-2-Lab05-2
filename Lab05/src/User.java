import java.time.LocalDate;

public class User {
    protected
    String name;
    LocalDate dob;

    public User() {
        name = null;
        dob = LocalDate.now(); // current date
    }

    User(String name, int year, String month, int day) {
        this.name = name;
        String[] month_array = {"January", "February", "March", "April", "May", "June"
                , "July", "August", "September", "October", "November", "December"};
        int month_Toint = 0;
        for (int i = 0; i <= 12; i++) {
            if (month == month_array[i]) {
                month_Toint = i + 1;
                break;
            } else if (i == 11 && month != month_array[i]) month_Toint = 12;
        }
        dob = LocalDate.of(year, month_Toint, day);
    }

    User(String name, int year, int month_int, int day) {
        this.name = name;
        dob = LocalDate.of(year, month_int, day);
    }

    void displayInfo() {
        System.out.println("User name: " + this.name);
        System.out.println("User Birthday: " + dob);
    }

    // Update Lab05-2 --------------------------------------------

    boolean isBirthday() {
        boolean checkD = false, checkM = false;
        if(dob.getMonthValue() == LocalDate.now().getMonthValue()) checkM = true;
        if(dob.getDayOfMonth() == LocalDate.now().getDayOfMonth()) checkD = true;
        if(checkM && checkD) return true;
        else return false;
    }
    void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
