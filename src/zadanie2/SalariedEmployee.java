package zadanie2;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double wynagrodzenieMsc;
    public SalariedEmployee(String imie, String nazwisko, LocalDate dataZatrudnienia, double wynagrodzenieMsc) {
        super(imie, nazwisko, dataZatrudnienia);
        this.wynagrodzenieMsc = wynagrodzenieMsc;
    }

    public double getWynagrodzenieMsc() {
        return wynagrodzenieMsc;
    }

    public void setWynagrodzenieMsc(double wynagrodzenieMsc) {
        this.wynagrodzenieMsc = wynagrodzenieMsc;
    }
}
