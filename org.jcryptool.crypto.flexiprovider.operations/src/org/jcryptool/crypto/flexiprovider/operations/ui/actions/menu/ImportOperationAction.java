// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2008 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.flexiprovider.operations.ui.actions.menu;

import org.eclipse.jface.action.Action;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.jcryptool.core.util.constants.IConstants;
import org.jcryptool.core.util.directories.DirectoryService;
import org.jcryptool.crypto.flexiprovider.operations.FlexiProviderOperationsPlugin;
import org.jcryptool.crypto.flexiprovider.operations.OperationsManager;

public class ImportOperationAction extends Action {
    public ImportOperationAction() {
        this.setText(Messages.ImportOperationAction_0);
        this.setToolTipText(Messages.ImportOperationAction_1);
        this.setImageDescriptor(FlexiProviderOperationsPlugin.getImageDescriptor("icons/16x16/import.gif")); //$NON-NLS-1$
    }

    public void run() {
        FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
        dialog.setFilterPath(DirectoryService.getUserHomeDir());
        dialog.setFilterExtensions(new String[] {IConstants.ALL_FILTER_EXTENSION});
        dialog.setFilterNames(new String[] {IConstants.ALL_FILTER_NAME});
        dialog.setOverwrite(true);

        String fileName = dialog.open();
        if (fileName != null) {
            OperationsManager.getInstance().importOperation(fileName);
        }
    }

}
