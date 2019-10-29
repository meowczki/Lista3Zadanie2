package zadanie2;

import java.time.LocalDate;

public class Employee {

    private static int counter=0;
    private int id;
    private String imie;
    private String nazwisko;
    private LocalDate dataZatrudnienia;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public LocalDate getDataZatrudnienia() {
        return dataZatrudnienia;
    }

    public void setDataZatrudnienia(LocalDate dataZatrudnienia) {
        this.dataZatrudnienia = dataZatrudnienia;
    }

    Employee(String imie, String nazwisko, LocalDate dataZatrudnienia){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.dataZatrudnienia=dataZatrudnienia;
        this.id=counter++;
    }
}
