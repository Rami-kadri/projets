package user;

public class User {

    private String userid;
    private String pass1;
    private String pass2;
    private String email;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;

    public User(String userid, String pass1, String pass2, String email, String name, String address, String city, String state, String zip, String phone)
    {
        this.userid = userid;
        this.pass1 = pass1;
        this.pass2 = pass2;
        this.email = email;
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public void setUserID(String userid)
    {
        this.userid = userid;
    }

    public void setPass1(String pass1)
    {
        this.pass1 = pass1;
    }

    public void setPass2(String pass2)
    {
        this.pass2 = pass2;
    }

    public void setEmail(String email)
    {
        this.userid = userid;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
    public boolean passCheck(String pass1, String pass2)
    {
        if (pass1.equals(pass2))
            return true;
        else
            return false;
    }
    public boolean stateCheck (String state)
    {
        if (state.length() == 2)
            return true;
        else
            return false;
    }
    public void UserIDLength (String userid)
    {
        System.out.println ("Your user ID is " + userid.length());
    }
    public boolean stringCheck (String userid, String pass1, String pass2, String email, String name, String address, String city, String state, String zip, String phone)
    {
        if (userid.length()==0)
            return false;
        else if (pass1.length()==0)
            return false;
        else if (email.length()==0)
            return false;
        else if (name.length()==0)
            return false;
        else if (address.length()==0)
            return false;
        else if (city.length()==0)
            return false;
        else if (state.length()==0)
            return false;
        else if (zip.length()==0)
            return false;
        else if (phone.length()==0)
            return false;
        else
            return true;
    }
    public boolean emailCheck(String email)
    {
        int a = email.indexOf('@');
        int b = email.indexOf('.');
        if (a > -1)
            return true;
        if (b > -1)
            return true;
        if (a<b)
            return true;
        else
            return false;
    }
}