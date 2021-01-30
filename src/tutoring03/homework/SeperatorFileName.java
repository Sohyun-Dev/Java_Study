package tutoring03.homework;

public class SeperatorFileName {
    String file;

    public SeperatorFileName(String file) {
        this.file = file;
    }

    public void seperate(){
        int pos = file.lastIndexOf(".");
        String fileName = file.substring(0, pos);
        System.out.println("파일명 : " + fileName);
        String ext = file.substring( pos + 1 );
        System.out.println("확장자명 : " + ext);
    }
}
