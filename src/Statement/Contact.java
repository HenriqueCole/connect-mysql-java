package Statement;

import java.util.Objects;

public class Contact {
    private Integer id;
    private String name;
    private String email;
    private String phone;
    private Integer age;

    public Contact(String name, String email, String phone, Integer age) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public Contact(Integer id, String name, String email, String phone, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Statement.Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && email.equals(contact.email) && phone.equals(contact.phone) && age.equals(contact.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phone, age);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}