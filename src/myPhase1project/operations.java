package myPhase1project;

import java.io.File;
import java.io.IOException;

public class operations {
	
	
	public void listAllFiles(String path)
	{
		
		File myobj=new File(path);
        String[] listOfFiles=myobj.list();  
        if(listOfFiles.length>0) 
        {
            System.out.println("\nTotal Number of files: "+ listOfFiles.length);
            System.out.println("The Files in "+ myobj.getAbsolutePath() + " are: \n");
          for(int i=0;i<listOfFiles.length;i++)
           {
        	
        	System.out.println(listOfFiles[i]);
        	
           }
        }
        else
        	System.out.println("Directory is Empty");
	}
	
	public static void createNewFile(String path , String fileName) 
	{

		   try {
		   
				File myobj = new File(path +File.separator+fileName);
				boolean createFile;
			    createFile = myobj.createNewFile();
			
				if (createFile) 
				{
					
					System.out.println("\nFile Successfully Created: " + myobj.getAbsolutePath());
					
				}
				else if(!createFile) 
				{
					
					System.out.println("\nFile Already Exist.. Please try again." );
					
				}
		   }
		   catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("an error occured.");
			}
		   
	}
	
	public static void deleteFile(String path , String fileName) 
	{
	   File myobj = new File(path + File.separator + fileName);
		
		boolean deleteFile = myobj.delete();
		
		if (deleteFile) 
		{
			System.out.println("\nFile deleted Successfully");
			
		}
		else 
		{
			System.out.println("\nFile Not Found.. Please try again." );
			
		}
			
	}
	public static void searchFile(String path , String fileName)
	{
		File myobj = new File(path);
		String [] filelist = myobj.list();
		boolean flag = false;
		
		if(filelist==null) 
		{
			System.out.println("empty directory:");
		}
		else 
		{
			for(int i=0;i<filelist.length;i++)
			{
				String filename=filelist[i];
				if(filename.equalsIgnoreCase(fileName)) 
				{
					System.out.println(filename+  ", file found at "+  myobj.getAbsolutePath());
				
				flag=true;
				}
				
			}
		}
		
		if(flag == false)
			System.out.println("File Not Found.. Please try again.");
				
	}
	
	

	

}
