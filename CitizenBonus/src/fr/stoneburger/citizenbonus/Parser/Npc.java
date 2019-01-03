package fr.stoneburger.citizenbonus.Parser;


public class Npc {
	
    private String name;
    private String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getpath() {
        return path;
    }

    public void setpath(String path) {
        this.path = path;
    }
    
    @Override
    public String toString() {
        return "> Npc{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}

