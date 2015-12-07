import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> songs;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        songs = new ArrayList<String>();
    }
    
    public boolean checkIndex (int index)
    {
        if (0 <= index && index < songs.size() )
        {
            System.out.println ("Index has to be between 0 (included) and" + " " + songs.size() + " " + "excluded" );
            return true;
        }
        
        else
        {
            System.out.println ("");
            return false;
        }
    }
    
    public boolean validIndex (int index)
    {
        if (0 <= index && index < songs.size() )
        {
            return true;
        }
        else
            return false;
    }
        
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        songs.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return songs.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public boolean listFile(int index)
    {
        if (validIndex(index) == true)
        {
            String filename = songs.get(index);
            System.out.println(filename);
            return true;
        }
        else
        return false;
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public boolean removeFile(int index)
    {
        if(validIndex(index) == true) 
        {
            songs.remove(index);
            return true;
        }
        else
        return false;
    }
    
    public String listAllFiles()
    {   
        int position = 0;
        String result = "";
        
        if (songs.size() == 0)
        {
            return null;
        }
        
        for (String filename: songs)
        {   
            System.out.println(position + ":" + filename);
            result = result + "\n" + position + ":" +" " + filename ;
            position++;
            
        }
        
        return result;
            
    }
    
    public String listMatching (String searchString)
    {
        int index;
        String result = "";
        for (String filename: songs)
        {
            
            if (filename.contains(searchString))
            {
                result = result + filename + " ";
                /*index = songs.indexOf(filename);
                result = result + " " + songs.get(index);*/
                
                

            }
            
            
        }
        
        if (result == "")
        {
            return null;
        }
        
        else
        {
            return result.substring(0, result.length() - 1);
        }
    }
    
    public int getNumberOfFiles2()
    {
        
        {
            return songs.size();
        }
        

    }
}