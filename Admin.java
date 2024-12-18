import java.time.LocalDate;

public class Admin extends User{
    protected void displayInfo(){
        System.out.println("User type: admin.");
        super.displayInfo();
    }
    Admin(String name, int year, String month, int day){
        this.name = name;
        String[] month_array = {"January", "February", "March", "April", "May", "June"
                , "July", "August", "September", "October", "November", "December"};
        int month_Toint = 0;
        for(int i = 0; i <= 12; i++){
            if(month == month_array[i]) {
                month_Toint = i+1;
                break;
            }
            else if(i == 11 && month != month_array[i]) month_Toint = 12;
        }
        dob = LocalDate.of(year,month_Toint,day);
    }
    void displayInfo(boolean full){
        if(full) {
            System.out.println("Name: "+ name);
            System.out.println("Birthday: "+ dob +"  User type: admin");
        } else System.out.println("Name: "+ name);
    }
    
    // Update Lab05-2 --------------------------------------------
    void displayHappyBirthday() {
        int age = LocalDate.now().getYear() - dob.getYear();
        if(isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }
}
