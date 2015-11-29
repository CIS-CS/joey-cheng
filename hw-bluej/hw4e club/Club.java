import java.util.ArrayList;
/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    private ArrayList<Membership> members;
    // Define any necessary fields here ...
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        members = new ArrayList<Membership>();
        // Initialise any fields here ...
        
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     * returns true when member is successfully added.
     */
    public boolean join(Membership member)
    {
        boolean check = true;
        
        for (int index = 0; index < members.size(); index++)
        {
            if (member == members.get(index))
            {
                check = false;
            }
            
        }
        
        if(check)
        {
           members.add(member);
        }
        return check;
        
    }

    public int numberOfMembers()
    {
        return members.size();
    }

}