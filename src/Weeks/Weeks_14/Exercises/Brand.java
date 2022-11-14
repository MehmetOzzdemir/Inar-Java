package Weeks.Weeks_14.Exercises;

public class Brand extends Cars {
    private final int NUMBER_OF_WHEEL = 4;
    private String country;
    private boolean hasElectricity;
    private boolean hasSunroof;
    private int numberOfProduction;
    private double brandValue;

    public Brand(){
        this("Germany",true,true,5,10000,"Black");
    }


    public Brand(String country,boolean isElectricity,boolean isSunroof,int numberOfProduction,double brandValue,String type){
        super();
        super.type="Hachback";
        this.country=country;
        this.hasElectricity=isElectricity;
        this.hasSunroof=isSunroof;
        this.numberOfProduction=numberOfProduction;
        this.brandValue=brandValue;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isElectricity() {
        return hasElectricity;
    }

    public void setElectricity(boolean electricity) {
        hasElectricity = electricity;
    }

    public boolean isSunroof() {
        return hasSunroof;
    }

    public void setSunroof(boolean sunroof) {
        hasSunroof = sunroof;
    }

    public int getNumberOfProduction() {
        return numberOfProduction;
    }

    public void setNumberOfProduction(int numberOfProduction) {
        this.numberOfProduction = numberOfProduction;
    }

    public double getBrandValue() {
        return brandValue;
    }

    public void setBrandValue(double brandValue) {
        this.brandValue = brandValue;
    }
    @Override
    public String toString(){
        return null;
    }



}
