public class Employee {
    private int phone;
    private String surname;

    public Employee(int phone, String surname) {
        this.phone = phone;
        this.surname = surname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
