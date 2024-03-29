class vix {
    double kelvin;

    vix() {

    }

    vix(double kelvin) {
        this.kelvin = kelvin;
    }

    void temperature() {
        double fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
        double celsius = kelvin - 273.15;
        System.out.println("Kelvin: " + kelvin);
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
    }

    void temperature(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        double kelvin = celsius + 273.15;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celsius: " + celsius);
        System.out.println("Kelvin: " + kelvin);
    }

    void temperature(double celsius, String unit) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 9 / 5 + 32;
        if (unit.equals("C")) {
            System.out.println("Celsius: " + celsius);
            System.out.println("Kelvin: " + kelvin);
            System.out.println("Fahrenheit: " + fahrenheit);
        }
    }
}

class tempfc {
    public static void main(String[] args) {
        vix obj = new vix(300); 
        obj.temperature(); 
        obj.temperature(86); 
        obj.temperature(27, "C"); 
    }
}
