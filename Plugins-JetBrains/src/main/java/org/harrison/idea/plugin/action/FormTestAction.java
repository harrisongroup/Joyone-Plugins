package org.harrison.idea.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.harrison.idea.plugin.screen.TestDialog;
import org.jetbrains.annotations.NotNull;

public class FormTestAction extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        TestDialog tDialog = new TestDialog(e.getProject());
        tDialog.setResizable(true);
        tDialog.show();
    }
}
