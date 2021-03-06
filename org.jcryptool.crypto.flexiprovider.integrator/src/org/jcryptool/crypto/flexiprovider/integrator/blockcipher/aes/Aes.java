// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2010 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.flexiprovider.integrator.blockcipher.aes;

import org.jcryptool.core.operations.algorithm.AbstractAlgorithm;
import org.jcryptool.core.operations.dataobject.IDataObject;

/**
 * The class providing the plugin id
 *
 * @author mwalthart
 *
 */
public class Aes extends AbstractAlgorithm {

    public static String PLUGIN_ID = "org.jcryptool.crypto.flexiprovider.integrator.blockcipher.aes"; //$NON-NLS-1$

    public Aes() {
        super();
    }

    @Override
    public IDataObject execute() {
        return null;
    }

    @Override
    public IDataObject getDataObject() {
        return null;
    }

    @Override
    public String getAlgorithmName() {
        return "AES"; //$NON-NLS-1$
    }

}
