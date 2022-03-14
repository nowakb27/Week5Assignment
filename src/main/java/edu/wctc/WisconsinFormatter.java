package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter {

    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        String SSSS = driversLicense.getSoundexCode();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        int YY = driversLicense.getBirthYear();
        String stringYY = Integer.toString(YY);
        char YY1 = stringYY.charAt(2);
        char YY2 = stringYY.charAt(3);
        int DDD = driversLicense.getBirthMonthDayGender();
        String dddFormatted = String.format("%03d", DDD);
        int NN = driversLicense.getOverflow();
        String nnFormatted = String.format("%d%d", NN, NN);
        return String.format("%s-%d%c-%c%s-%s", SSSS, FFF, YY1, YY2, dddFormatted, nnFormatted);
    }

}