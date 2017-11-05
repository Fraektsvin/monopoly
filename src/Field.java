
package matador;


public class Field {
    private String name;
    private int number;
    
    public Field(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String toString() {
        return "This field has the name " + name + " and number " + number;
    }
}
