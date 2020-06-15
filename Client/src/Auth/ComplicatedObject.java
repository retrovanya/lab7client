package Auth;

import PersonData.Flat;

import java.io.Serializable;
public class ComplicatedObject implements Serializable {
    private String command;
    private Flat flat;
    private long id;
    private Long param;
    private long p;
    private String history;
    private String name;
    ComplicatedObject(String command){
        this.command = command;
    }
     ComplicatedObject(String command, Flat flat){
        this.command = command;
        this.flat = flat;
    }

     ComplicatedObject(String command, long id, Flat flat){
        this.command = command;
        this.id = id;
        this.flat = flat;
    }
    ComplicatedObject(String command,String name ){
        this.command = command;
        this.name = name;
    }
    ComplicatedObject(String command, long id){
        this.command = command;
        this.id = id;
    }
    public String getCommand(){
        return command;
    }
    public Flat getFlat(){
        return flat;
    }
    public Long getParam(){return param;}
    public long getId(){
        return id;
    }
    public long getP(){return p;}
    public String getHistory(){return history;}
    public String getName () {return name;}
    @Override
    public String toString() {
        return ("command: " + command + "\n" );
    }
}

