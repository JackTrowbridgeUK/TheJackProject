package com.jayjaytee.jackproject.commands.hidden;

import com.jayjaytee.jackproject.managers.CommandManager;
import com.jayjaytee.jackproject.managers.InstallManager;
import com.jayjaytee.jackproject.objects.MenuItem;

public class InstallOverrideCommand extends MenuItem {
    public InstallOverrideCommand(){
        super("Install Override", "Overrides the install checks.", "installoverride", false);
    }

    @Override
    public void execute() {
        CommandManager commandManager = new CommandManager();
        InstallManager installManager = new InstallManager();

        installManager.install();

        commandManager.printMenuItems();
    }
}
