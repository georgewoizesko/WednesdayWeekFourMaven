package com.projectten;

import org.netbeans.api.htmlui.OpenHTMLRegistration;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;

public class NbMain {
    private NbMain() {
    }
    
    @ActionID(
        category = "Games",
        id = "com.projectten.OpenPage"
    )
    @OpenHTMLRegistration(
        url="index.html",
        techIds={"controls4j"},
        displayName = "Open Your Page",
        iconBase = "com/projectten/icon.png"
    )
    @ActionReferences({
        @ActionReference(path = "Menu/Window"),
        @ActionReference(path = "Toolbars/Games")
    })
    public static void onPageLoad() throws Exception {
        AppCntrl.onPageLoad();
    }
}
