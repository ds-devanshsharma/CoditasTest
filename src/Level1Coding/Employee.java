package Level1Coding;

public class Employee {
    int id ;
    String name ;
    Address address ;
    String designation;
    int experience;

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", designation='" + designation + '\'' +
                ", experience=" + experience ;
    }

    public Employee(int id, String name, Address address, String designation, int experience) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.designation = designation;
        this.experience = experience;
    }
}
