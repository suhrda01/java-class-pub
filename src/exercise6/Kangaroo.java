package exercise6;

import java.util.Objects;

/**
 * Class Kangaroo
 * @author yasiro01
 */
public class Kangaroo {
    private String name;
    private int age;
    private int babies;
    
    public Kangaroo(String name, int age) {
        this.name = name;
        this.age = age;
        babies = 1;
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
        final Kangaroo other = (Kangaroo) obj;
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
