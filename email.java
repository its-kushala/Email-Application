import java.util.Scanner;

public class email {
    private String firstname;
    private String lastname;
    private String password;
    private String department;
    private String Email;
    private int mailboxcapacity = 500;
    private int defaultpasswordlength = 10;
    private String alternateemail;
    private String companySuffix = "mycompany.com";


public email(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    //System.out.println("Email created:" + firstname + "" + lastname);

    this.department = setDepartment();
    //System.out.println("Department:" + this.department);

    this.password = randomPassword(defaultpasswordlength);
    System.out.println("Your password:" + this.password);

    Email = firstname.toLowerCase() + "." +lastname.toLowerCase() + "@" +department +"." +companySuffix ;
    //System.out.println("Your email is: " + Email);
}


private String setDepartment(){
    System.out.println("New Worker:" +firstname + ". Department code: \n1 Sales\n2 Develepoment\n3 Accounting\n0 none\n Enter department code: ");
    Scanner time = new Scanner(System.in);
    int depChoice = time.nextInt();
    if(depChoice == 1) { return "sales"; }
    else if(depChoice == 2) { return "dev"; }
    else if (depChoice == 3) { return "acct"; }
    else { return ""; }
}

private String randomPassword(int length) {
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%" ;
    char[] password = new char[length];
    for (int i=0; i<length; i++){
        int rand = (int) (Math.random() * passwordSet.length());
        password[i] = passwordSet.charAt(rand);
    }
    return new String(password);
}

public void setMailboxCapacity(int capacity ){
    this.mailboxcapacity = capacity;
}

public void setAlternativeEmail(String altEmail){
    this.alternateemail = altEmail;
}

public void changePassword(String password){
    this.password = password;
}

public int getMailboxCapacity() {return mailboxcapacity;}
public String getAlternativeEmail() {return alternateemail;}
public String getPassword() {return password;}

public String showInfo() {
    return "Display Name:" +firstname + "" +lastname +
            "\nCompany Email:" + Email +
            "\nMailbox Capacity:" +mailboxcapacity +"mb";
}

}