package learning.ostap.objects;

public enum CatColor {
    RED("#FF0000"), BLACK("#000000"), WHITE("#FFFFFF"), UNKNOWN("?");
    private final String hexColor;

    CatColor(String hexCode) {
        this.hexColor = hexCode;
    }

    @Override
    public String toString() {
        return "CatColor{" +
                "hexColor='" + hexColor + '\'' +
                '}';
    }
}
