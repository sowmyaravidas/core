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
import org.jcryptool.core.logging.utils.LogUtil;
import org.jcryptool.core.util.constants.IConstants;
import org.jcryptool.core.util.directories.DirectoryService;
import org.jcryptool.crypto.flexiprovider.descriptors.IFlexiProviderOperation;
import org.jcryptool.crypto.flexiprovider.operations.FlexiProviderOperationsPlugin;
import org.jcryptool.crypto.flexiprovider.operations.OperationsManager;
import org.jcryptool.crypto.flexiprovider.operations.ui.listeners.ISelectedOperationListener;

public class ExportOperationAction extends Action {
    private IFlexiProviderOperation descriptor;
    private ISelectedOperationListener listener;

    public ExportOperationAction(ISelectedOperationListener listener) {
        this.setText(Messages.ExportOperationAction_0);
        this.setToolTipText(Messages.ExportOperationAction_1);
        this.setImageDescriptor(FlexiProviderOperationsPlugin.getImageDescriptor("icons/16x16/export.gif")); //$NON-NLS-1$
        this.listener = listener;
    }

    public void run() {
        this.descriptor = listener.getFlexiProviderOperation();
        if (this.descriptor != null) {
            LogUtil.logInfo("exporting... (" + descriptor.getTimestamp() + ")"); //$NON-NLS-1$ //$NON-NLS-2$
            FileDialog dialog = new FileDialog(Display.getCurrent().getActiveShell(), SWT.SAVE);
            dialog.setFilterPath(DirectoryService.getUserHomeDir());
            dialog.setFilterExtensions(new String[] {IConstants.ALL_FILTER_EXTENSION});
            dialog.setFilterNames(new String[] {IConstants.ALL_FILTER_NAME});
            dialog.setOverwrite(true);

            String filename = dialog.open();
            if (filename != null) {
                OperationsManager.getInstance().export(descriptor.getTimestamp(), filename);
            }
        }
    }

}
