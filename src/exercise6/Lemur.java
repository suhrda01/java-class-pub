package exercise6;

import java.util.Objects;

/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
    private String name;
    private int age;
    private int tailLength;
    
    public Lemur(String name, int age) {
        this.name = name;
        this.age = age;
        tailLength = 20;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", name, age);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Lemur other = (Lemur) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
