/******************************************************************************
 * Copyright (c) 2014 Oracle
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial implementation and ongoing maintenance
 ******************************************************************************/

package org.eclipse.sapphire.samples.gallery;

import org.eclipse.sapphire.modeling.annotations.EnumSerialization;
import org.eclipse.sapphire.modeling.annotations.Label;

/**
 * @author <a href="mailto:konstantin.komissarchik@oracle.com">Konstantin Komissarchik</a>
 */

@Label( standard = "three choice answer" )

public enum ThreeChoiceAnswerCustomized
{
    @Label( standard = "yes" )
    @EnumSerialization( primary = "yes", alternative = { "true", "1" } )
    
    YES,
    
    @Label( standard = "maybe" )
    @EnumSerialization( primary = "maybe", alternative = "0", caseSensitive = false )
    
    MAYBE,
    
    @Label( standard = "no" )
    @EnumSerialization( primary = "no", alternative = { "false", "-1" }, caseSensitive = true )
    
    NO
    
}
