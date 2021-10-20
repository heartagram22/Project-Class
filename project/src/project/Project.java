package project;

public class Project {
    public String name;
    public String description;
    public String name1(){
        final String name = this.name;
        return name;

    }
    public Project(){
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String getName () { return name;}
    public void setName (String name){this.name = name;}
    public String getDescription(){return description;}
    public void setDescription(String this_procejt_sets_a_name){this.description = description;}
}
