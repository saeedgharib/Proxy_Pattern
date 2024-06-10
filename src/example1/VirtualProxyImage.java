package example1;

public class VirtualProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public VirtualProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (isSupportedImageType(fileName)) {
            if (realImage == null) {
                realImage = new RealImage(fileName);
            }
            realImage.display();
        } else {
            fakeDisplay();
        }
    }

    private boolean isSupportedImageType(String fileName) {

        String[] supportedTypes = { "jpg", "png", "gif" };
        for (String type : supportedTypes) {
            if (fileName.endsWith(type)) {
                return true;
            }
        }
        return false;
    }

    private void fakeDisplay() {
        System.out.println("Unsupported image type. Displaying placeholder.");
    }
}
