package page299_BinaryTreeDynamic;

/**
 * Holds the name and phone number of a contact.
 * @author Mark Hayes
 */
public class Contact {

    private String name  = null;
    private String phone = null;

    public Contact()
    {
        this(null, null);
    }

    public Contact(String name, String phone)
    {
        this.name  = name;
        this.phone = phone;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getPhone()
    {
        return phone;
    }
}
