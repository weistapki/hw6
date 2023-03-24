package task1;

public class StructureData {
    private String name;
    private int occurrence;

    public StructureData(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }


    @Override
    public String toString() {
        return "\n\t{" +
                "name: \"" + name + '\"' +
                ", occurrence: " + occurrence +
                "}";
    }
}
