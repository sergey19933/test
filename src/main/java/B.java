public class B {
   private int number;

    public B(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        B b = (B) o;

        return number == b.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
