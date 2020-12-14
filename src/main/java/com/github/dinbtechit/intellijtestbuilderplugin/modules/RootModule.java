package com.github.dinbtechit.intellijtestbuilderplugin.modules;

import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.projectRoots.Sdk;
import com.intellij.ui.RowIcon;
import com.intellij.ui.TextIcon;
import com.intellij.workspace.api.ModuleDependencyItem;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import javax.swing.*;

public class RootModule extends ModuleType {

    public RootModule() {
        super("Test_Recorder");
    }

    @NotNull
    @Override
    public ModuleBuilder createModuleBuilder() {
        return new MyModuleBuilder();
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Title) String getName() {
        return "Test Builder";
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return "This project Creates a Modules";
    }

    @Override
    public Icon getNodeIcon(boolean isOpened) {
        return null;
    }
}
