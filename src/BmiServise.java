class BmiService {
    public int calculate(double heightInMeters, double weightInKillo) {
        return (int) (weightInKillo / (heightInMeters * heightInMeters)) ;
    }
}