import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name,address;
    private char gender;
    private int age;
    private ArrayList<Account> listbankaccount = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name, String address, char gender, int age) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void addBankAccount(Account bankaccount)
    {
        listbankaccount.add(bankaccount);
}
    public ArrayList<Account> getlistbankaccount()
    {
        return listbankaccount;
    }



    @Override
    public String toString() {
        return "name: " + name +
                " address: " + address +
                " gender: " + gender +
                " age: " + age
                 ;
    }
}
