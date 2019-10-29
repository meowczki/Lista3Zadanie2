package zadanie2;

import java.time.LocalDate;

public class ComissionEmployee extends Employee{
    private double procentProwizji;
    private double lacznaKwotaSprzedazy;

    public ComissionEmployee(String imie, String nazwisko, LocalDate dataZatrudnienia, double procentProwizji, double lacznaKwotaSprzedazy) {
        super(imie, nazwisko, dataZatrudnienia);
        this.procentProwizji = procentProwizji;
        this.lacznaKwotaSprzedazy = lacznaKwotaSprzedazy;
    }

    public double getProcentProwizji() {
        return procentProwizji;
    }

    public void setProcentProwizji(double procentProwizji) {
        this.procentProwizji = procentProwizji;
    }

    public double getLacznaKwotaSprzedazy() {
        return lacznaKwotaSprzedazy;
    }

    public void setLacznaKwotaSprzedazy(double lacznaKwotaSprzedazy) {
        this.lacznaKwotaSprzedazy = lacznaKwotaSprzedazy;
    }
}
