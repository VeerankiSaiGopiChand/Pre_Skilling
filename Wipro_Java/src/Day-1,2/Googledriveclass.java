import java.util.Scanner;

class DriveFile {
    String fileName;
    double fileSizeInMB;

    void uploadFile(String inputFileName, double inputFileSize) {
        fileName = inputFileName;
        fileSizeInMB = inputFileSize;
        System.out.println("Uploaded: " + fileName + " (" + fileSizeInMB + " MB)");
    }

    void downloadFile() {
        if (fileName != null) {
            System.out.println("Downloading: " + fileName + " (" + fileSizeInMB + " MB)");
        } else {
            System.out.println("No file available to download.");
        }
    }
}

public class Googledriveclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DriveFile uploadedFile = new DriveFile();

        String inputFileName = scanner.nextLine();
        double inputFileSizeInMB = scanner.nextDouble();

        uploadedFile.uploadFile(inputFileName, inputFileSizeInMB);
        uploadedFile.downloadFile();
        
        scanner.close();
        
    }
}


