package lesson13;

public class Table {
    private int height;
    private int length;
    private int width;

    public Table (){
    }

    public Table(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }


    public int getHeight() {
        return height;
    }

    public Table setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Table setLength(int length) {
        this.length = length;
        return this;
    }

    public int getWidth() {
        return width;
    }

    public Table setWidth(int width) {
        this.width = width;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Table table = (Table) o;

        if (height != table.height) return false;
        if (length != table.length) return false;
        return width == table.width;
    }

    @Override
    public int hashCode() {
        int result = height;
        result = 31 * result + length;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Table{" +
                "height= " + height +
                ", length= " + length +
                ", width= " + width +
                '}';
    }
}
