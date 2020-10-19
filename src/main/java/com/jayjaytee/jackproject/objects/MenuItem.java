package com.jayjaytee.jackproject.objects;

public abstract class MenuItem {
    private final String displayName;
    private final String displayDescription;
    private final String commandUsage;
    private final boolean displayCommand;

    public MenuItem(final String displayName, final String displayDescription, final String commandUsage, final boolean displayCommand){
        this.displayName = displayName;
        this.displayDescription = displayDescription;
        this.commandUsage = commandUsage;
        this.displayCommand = displayCommand;
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
    public boolean getDisplayCommand() { return this.displayCommand; }

    public abstract void execute();
}
