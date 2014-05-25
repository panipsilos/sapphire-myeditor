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

package org.eclipse.sapphire.samples.contacts;

import org.eclipse.sapphire.Element;
import org.eclipse.sapphire.ElementType;
import org.eclipse.sapphire.Value;
import org.eclipse.sapphire.ValueProperty;
import org.eclipse.sapphire.modeling.annotations.Image;
import org.eclipse.sapphire.modeling.annotations.Label;
import org.eclipse.sapphire.modeling.annotations.NoDuplicates;
import org.eclipse.sapphire.modeling.annotations.PossibleValues;
import org.eclipse.sapphire.modeling.annotations.Required;
import org.eclipse.sapphire.modeling.xml.annotations.XmlBinding;

/**
 * @author <a href="mailto:konstantin.komissarchik@oracle.com">Konstantin Komissarchik</a>
 */

@Image( path = "Contact.png" )

public interface Connection extends Element
{
    ElementType TYPE = new ElementType( Connection.class );
    
  // *** Key ***
    
    @XmlBinding( path = "key" )
    @Label( standard = "KEY" )
    @Required

    ValueProperty PROP_KEY = new ValueProperty( TYPE, "Key" );

    Value<String> getKey();
    void setKey( String key );
    
    // *** Value ***
    
    @XmlBinding( path = "value" )
    @Label( standard = "VALUE" )
    @Required

    ValueProperty PROP_VALUE = new ValueProperty( TYPE, "Value" );

    Value<String> getValue();
    void setValue( String value );
    
    
}
