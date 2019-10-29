package zadanie2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double stawkaGodzinowa;
    private double liczbaGodzinWTyg;

    public double getStawkaGodzinowa() {
        return stawkaGodzinowa;
    }

    public void setStawkaGodzinowa(double stawkaGodzinowa) {
        this.stawkaGodzinowa = stawkaGodzinowa;
    }

    public double getLiczbaGodzinWTyg() {
        return liczbaGodzinWTyg;
    }

    public void setLiczbaGodzinWTyg(double liczbaGodzinWTyg) {
        this.liczbaGodzinWTyg = liczbaGodzinWTyg;
    }

    public HourlyEmployee(String imie, String nazwisko, LocalDate dataZatrudnienia, double stawkaGodzinowa, double liczbaGodzinWTyg) {
        super(imie, nazwisko, dataZatrudnienia);
        this.stawkaGodzinowa = stawkaGodzinowa;
        this.liczbaGodzinWTyg = liczbaGodzinWTyg;
    }

}
