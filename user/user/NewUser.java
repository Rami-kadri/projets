package user;

import java.util.Scanner;

public class NewUser {

        public void User_Add() {

            Scanner kb = new Scanner( System.in);
            System.out.println ("Enter a username");
            String userid = kb.nextLine(  );

            System.out.println ("Enter a Password");
            String pass1 = kb.nextLine(  );

            Scanner kb1 = new Scanner( System.in);
            System.out.println ("Re-enter your password");
            String pass2 = kb.nextLine(  );
            if (pass1.equals(pass2))
                System.out.println ("Passwords match");
            else
                System.out.println ("Passwords do not match");

            Scanner kb3 = new Scanner( System.in);
            System.out.println ("Enter your e-mail address");
            String email = kb.nextLine(  );

            Scanner kb4 = new Scanner( System.in);
            System.out.println ("Enter your name");
            String name = kb.nextLine(  );

            Scanner kb5 = new Scanner( System.in);
            System.out.println ("Enter your address");
            String address = kb.nextLine(  );

            Scanner kb6 = new Scanner( System.in);
            System.out.println ("Enter your city");
            String city = kb.nextLine(  );

            Scanner kb7 = new Scanner( System.in);
            System.out.println ("Enter your state (abbreviated)");
            String state = kb.nextLine(  );

            Scanner kb8 = new Scanner( System.in);
            System.out.println ("Enter your zip code");
            String zip = kb.nextLine(  );

            Scanner kb9sdf = new Scanner( System.in);
            System.out.println ("Enter your phone number");
            String phone = kb.nextLine(  );

            User user1 = new User(userid, pass1, pass2, email, name, address, city, state, zip, phone);
        }
    }

