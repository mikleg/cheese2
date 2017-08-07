package org.launchcode.models;

public class Cheese
{
    private String name;
    private String description;

    public void setName(String aName)
    {
        name = aName;
    }

    public String getName()
    {
        return name;
    }

    public void setDescription(String aDescription)
    {
        description = aDescription;
    }

    public String getDescription()
    {
        return description;
    }

    public Cheese (String aName, String aDescription)
    {
        this.setName(aName);
        this.setDescription(aDescription);
    }
}
