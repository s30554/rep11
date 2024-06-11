public class Car implements Comparable<Car>{
    private String name;
    private int yearOfProduction;

    public Car(String name, int yearOfProduction) {
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getName() {
        return name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
    @Override
    public int compareTo(Car Car2){
        return Integer.compare(this.yearOfProduction, Car2.yearOfProduction);
    }
    @Override
    public String toString(){
        return name + ", " + yearOfProduction;
    }
}