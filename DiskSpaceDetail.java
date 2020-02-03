import java.io.File;

public class DiskSpaceDetail
{
    public static void main(String[] args)
    {	
    	File file = new File("/home/ubuntu");
    	long totalSpace = file.getTotalSpace();
	System.out.println("Total size : " + totalSpace + " bytes");
    }
}
