public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromRemoteServer();
    }

    private void loadFromRemoteServer() {
        System.out.println("\nLoading " + fileName + " from remote server...");
    }

    public void display() {
        System.out.print("Displaying " + fileName);
    }
}
