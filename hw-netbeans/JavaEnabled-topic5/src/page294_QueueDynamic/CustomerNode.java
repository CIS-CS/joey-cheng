package page294_QueueDynamic;

/**
 * Holds information about a customer.
 * Demonstrates a self-referential record structure, ie, one of the
 * fields is a CustomerNode.
 */
class CustomerNode 
{	
    private String  name;
    private String  phone;
    private CustomerNode next;
    
    public CustomerNode()
    {
        name  = null;
        phone = null;
        next  = null;
    }

    public CustomerNode(String name, String phone, CustomerNode node)
    {
        setName(name);
        setPhone(phone);
        setNext(node);
    }

    // Get methods
    public String getName() 
    {
        return name;
    }
    
    public String getPhone()
    {
        return phone;
    }
    
    public CustomerNode getNext()
    {
        return next;
    }

    // Set methods
    public void setName(String name) 
    {
        this.name = name;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }
        
    public void setNext(CustomerNode node)
    {
        next = node;
    }
}


