public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 55.5f;
        float growth = 1.75f;
        System.out.println(service.calculate(weight, growth));


    }
}
