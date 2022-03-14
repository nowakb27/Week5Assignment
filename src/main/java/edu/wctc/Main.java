package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("LAST NAME: ");
        String LASTNAME = keyboard.nextLine();

        System.out.print("FIRST NAME: ");
        String FIRSTNAME = keyboard.nextLine();

        System.out.print("MIDDLE INITIAL: ");
        String MIDDLEINITIAL = keyboard.nextLine();

        System.out.print("MONTH OF BIRTH (1-12): ");
        int MONTHOFBIRTH = Integer.parseInt(keyboard.nextLine());

        System.out.print("DAY OF BIRTH (1-31): ");
        int DAYOFBIRTH = Integer.parseInt(keyboard.nextLine());

        System.out.print("YEAR OF BIRTH (YYYY): ");
        int YEAROFBIRTH = Integer.parseInt(keyboard.nextLine());

        System.out.print("GENDER (M/F): ");
        String GENDER = keyboard.nextLine();

        char genderCode = GENDER.charAt(0);

        try{
            DriversLicense driversLicense = new DriversLicense();
            driversLicense.setOverflow(0);
            driversLicense.setSoundexCode(new LastNameUtility().encodeLastName(LASTNAME));
            driversLicense.setFirstNameMiddleInitial(new FirstNameUtility().encodeFirstName(FIRSTNAME, MIDDLEINITIAL));
            driversLicense.setBirthYear(YEAROFBIRTH);
            driversLicense.setBirthMonthDayGender(new MonthDayGenderUtility().encodeMonthDayGender(YEAROFBIRTH, MONTHOFBIRTH, DAYOFBIRTH, genderCode));
            String floridaDriversLicense = new FloridaFormatter().formatLicenseNumber(driversLicense);
            String wisconsinDriversLicense = new WisconsinFormatter().formatLicenseNumber(driversLicense);
            System.out.printf("FLORIDA: %s%nWISCONSIN: %s", floridaDriversLicense, wisconsinDriversLicense);
        } catch (MissingNameException | UnknownGenderCodeException | InvalidBirthdayException e) {
            e.printStackTrace();
        }



    }

}