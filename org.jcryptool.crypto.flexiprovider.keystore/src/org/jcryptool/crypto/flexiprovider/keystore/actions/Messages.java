// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2010 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.flexiprovider.keystore.actions;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
    private static final String BUNDLE_NAME = "org.jcryptool.crypto.flexiprovider.keystore.actions.messages"; //$NON-NLS-1$
    public static String ImportKeyAction_0;
    public static String ImportKeyAction_1;
    public static String NewKeyPairAction_0;
    public static String NewKeyPairAction_1;
    public static String NewKeyPairAction_2;
    public static String NewKeyPairAction_3;
    public static String NewSymmetricKeyAction_0;
    public static String NewSymmetricKeyAction_1;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
