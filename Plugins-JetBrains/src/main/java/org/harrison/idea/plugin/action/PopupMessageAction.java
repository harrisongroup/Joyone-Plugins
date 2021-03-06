package org.harrison.idea.plugin.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageDialogBuilder;
import com.intellij.openapi.ui.Messages;
import com.intellij.pom.Navigatable;
import org.jetbrains.annotations.NotNull;

public class PopupMessageAction extends AnAction {


    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project currentProject = e.getProject();
        StringBuffer dlgMsg = new StringBuffer(e.getPresentation().getText() + "Selected");
        String dlgTitle = e.getPresentation().getDescription();
        Navigatable nav = e.getData(CommonDataKeys.NAVIGATABLE);

        if (nav != null) {
            dlgMsg.append(String.format("\nSelected Element: %s ", nav.toString()));
        }

        Messages.showMessageDialog(currentProject,dlgMsg.toString(), dlgTitle, Messages.getInformationIcon());
    }
}
