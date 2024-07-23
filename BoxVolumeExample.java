class Box {
    double length;
    double width;
    double height;

    // Default constructor
    Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    // Method to calculate volume
    double getVolume() {
        return length * width * height;
    }
}
class BoxVolumeExample {

    public static void main(String[] args) {
        Box box = new Box();
        System.out.println("Volume of the box: " + box.getVolume());
    }
}