// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2010 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made available
 * under the terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.crypto.flexiprovider.integrator.signature.dsa;

import org.jcryptool.crypto.flexiprovider.integrator.IntegratorAction;

/**
 * Provides specifications for the DummyAction
 * @author mwalthart
 *
 */
public class DsaAction extends IntegratorAction {
	@Override
	protected String getFlexiProviderAlgorithmName() {return "RawDSA";} //$NON-NLS-1$
	@Override
	protected String getReadableAlgorithmName() {return "DSA";} //$NON-NLS-1$
	@Override
	protected String getShowKey() {return "DSA";} //$NON-NLS-1$
}