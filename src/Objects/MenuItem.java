package Objects;

public class MenuItem {
    private final String displayName;
    private final String displayDescription;
    private final String commandUsage;

    public MenuItem(final String displayName, final String displayDescription, final String commandUsage){
        this.displayName = displayName;
        this.displayDescription = displayDescription;
        this.commandUsage = commandUsage;
    }

    public String getDisplayName(){
        return this.displayName;
    }
    public String getDisplayDescription(){
        return this.displayDescription;
    }
    public String getCommandUsage(){
        return this.commandUsage;
    }

    public void execute(){ this.execute(); }
}
