package edu.wctc;

public class FloridaFormatter implements DriversLicenseFormatter{
    @Override
    public String formatLicenseNumber(DriversLicense driversLicense) {

        String SSSS = driversLicense.getSoundexCode();
        int FFF = driversLicense.getFirstNameMiddleInitial();
        String fffFormatted = String.format("%03d", FFF);
        String YY = Integer.toString(driversLicense.getBirthYear());
        YY = YY.substring(YY.length() - 2);
        int DDD = driversLicense.getBirthMonthDayGender();
        String dddFormatted = String.format("%03d", DDD);
        int N = driversLicense.getOverflow();

        return String.format("%s-%s-%s-%s-%d", SSSS, fffFormatted, YY, dddFormatted, N);
    }
}
