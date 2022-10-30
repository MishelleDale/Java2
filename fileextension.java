import java.io.File;


public class fileextension {
    public static void main(String[] args) {
        File file = new File("/file.txt");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        file = new File("/file.pdf");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        file = new File("/file");
        System.out.println("Расширение файла: " + getFileExtension(file));
        
        file = new File("/file.jpg");
        System.out.println("Расширение файла: " + getFileExtension(file));
    }
 
    //метод определения расширения файла
    private static String getFileExtension(File file) {
        String fileName = file.getName();
        // если в имени файла есть точка и она не является первым символом в названии файла
        if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
        // то вырезаем все знаки после последней точки в названии файла, то есть ХХХХХ.txt -> txt
        return fileName.substring(fileName.lastIndexOf(".")+1);
        // в противном случае возвращаем заглушку, то есть расширение не найдено
        else return "";
    }
}
